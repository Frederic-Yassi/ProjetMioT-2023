package web;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.HttpConstraint;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import metier.TRash;
import metier.TrashImpl;
import metier.UserImpl;

/**
 * Servlet implementation class DashboardServlet
 */
@WebServlet({"/etat_poubelle", "/profil", "/404", "/inscription", "/liste_poubelles", "/liste_utilisateurs", "/ajout_poubelle"})
public class DashboardServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Recuperer les infos de l'utilisateur de la seesion
	 HttpSession session = request.getSession();
	 ModelUser utilisateur = (ModelUser) session.getAttribute("user");
	 
	  
	// Recuperer les infos de la poubelle et afficher en fonction de l'utilisateur ex(par son id)
	 String trashInfo = new TrashImpl().getTrashInfo(utilisateur.getAdresse());
	 HashMap<String, Object> map = new Gson().fromJson(trashInfo, HashMap.class);

	//Traitrement des données envoyées
	 String  state=(String) map.get("state");
	 Double level1 = (Double) map.get("level");
	 int level =(int) Math.round(level1);
	 String  adresse=(String) map.get("address");
	 
	 ModelTrash trash = new ModelTrash();
//	 trash.setId(id);
	 trash.setLevel(level);
	 trash.setAdresse(adresse);
	 trash.setState(state);
	 
	 // avant chauqe page verifier que la session existe (l'utilisatuer) et faire ensuite le reste
	  if(utilisateur!=null) {
		  String path=request.getServletPath();
		  
		  //injecter le model de l'utilisateur
		  request.setAttribute("utilisateur", utilisateur);
		  
		  // Rediriger la requete en fonction du role de l'utilisateur
		  if(utilisateur.getRole().equals("Locataire")) {		
			  if(path.equals("/etat_poubelle")) {
				  request.setAttribute("trash", trash);
				  request.getRequestDispatcher("etat_poubelle.jsp").forward(request, response); 
			  } else if(path.equals("/profil")) {
				  request.getRequestDispatcher("profil.jsp").forward(request, response); 
			  }else {
				  request.getRequestDispatcher("etat_poubelle.jsp").forward(request, response); 
			  }
		  }
		  else if(utilisateur.getRole().equals("Proprietaire")) {		  
			  if(path.equals("/etat_poubelle")) {
				  request.setAttribute("trash", trash);
				  request.getRequestDispatcher("etat_poubelle.jsp").forward(request, response); 
			  } else if(path.equals("/profil")) {
				  request.getRequestDispatcher("profil.jsp").forward(request, response); 
			  }else {
				  request.getRequestDispatcher("etat_poubelle.jsp").forward(request, response); 
			  }
		  }	
		  else if(utilisateur.getRole().equals("Admin")) {
			  if(path.equals("/inscription")) {
				  String id = request.getParameter("id");
				  ModelUser user_a_modifier;
				  if(id==null) {
					  user_a_modifier = new ModelUser();
					  
					  request.setAttribute("ajout", "true");
				  }else {
					//Recuperer les données de l'utiiateur en question
				    String getUserInfo = new UserImpl().getUserInfo(Integer.parseInt(id));
				    HashMap<String, Object> map_user_a_modifier = new Gson().fromJson(getUserInfo, HashMap.class);
				    
				    //Traitrement des données envoyées
			    	Double id1 = (Double) map_user_a_modifier.get("id");
			    	int id_user_a_modifier =(int) Math.round(id1);
			    	String email_user_a_modifier =(String) map_user_a_modifier.get("email");
			    	String first_name_user_a_modifier =(String) map_user_a_modifier.get("prenom");
			    	String user_name_user_a_modifier =(String) map_user_a_modifier.get("username");
			    	String last_name_user_a_modifier =(String) map_user_a_modifier.get("nom");
			    	String role_user_a_modifier =(String) map_user_a_modifier.get("role");
			    	String numero_user_a_modifier =(String) map_user_a_modifier.get("num");
			    	String  adress_user_a_modifier=(String) map_user_a_modifier.get("address");
			    	String pass_word_user_a_modifier =(String) map_user_a_modifier.get("name");
				    
					//ajout de l'utilisateur dans le modele utilisateur
				    user_a_modifier = new ModelUser();
				    user_a_modifier.setId(id_user_a_modifier);
				    user_a_modifier.setFirst_name(first_name_user_a_modifier);
				    user_a_modifier.setLast_name(last_name_user_a_modifier);
				    user_a_modifier.setUser_name(user_name_user_a_modifier);
				    user_a_modifier.setMail(email_user_a_modifier);
				    user_a_modifier.setRole(role_user_a_modifier);
				    user_a_modifier.setNumero(numero_user_a_modifier);
				    user_a_modifier.setAdresse(adress_user_a_modifier);
				    user_a_modifier.setPass_word(pass_word_user_a_modifier);
				    
				    request.setAttribute("ajout", "false");
					  
				  }
				  request.setAttribute("user_a_modifier", user_a_modifier);
				  request.getRequestDispatcher("inscription.jsp").forward(request, response); 
			  } else if(path.equals("/liste_utilisateurs")) {
				  String listOfUsers1 = new UserImpl().getUsers();
				  Gson gson = new Gson();
				  Type type = new TypeToken<List<HashMap<String, String>>>(){}.getType();
				  List<HashMap<String, String>> map_list_users = gson.fromJson(listOfUsers1, type);
				  List<ModelUser> listOfUsers = new ArrayList<ModelUser>();
				  
				  for (int i = 0; i < map_list_users.size(); i++) {
					  
					  //Traitrement des données envoyées
				    	//Double id1 = (Double) map_list_users.get(i).get("id");
				    	//int id_list_user =(int) Math.round(id1);
					  	String id1 = (String) map_list_users.get(i).get("id");
					  	int id_list_user = Integer.parseInt(id1);
				    	String email_list_user =(String) map_list_users.get(i).get("email");
				    	String first_list_user =(String) map_list_users.get(i).get("prenom");
				    	String user_list_user =(String) map_list_users.get(i).get("username");
				    	String last_list_user =(String) map_list_users.get(i).get("nom");
				    	String role_list_user =(String) map_list_users.get(i).get("role");
				    	String numero_list_user =(String) map_list_users.get(i).get("num");
				    	String  adress_list_user =(String) map_list_users.get(i).get("address");
				    	String pass_word_list_user =(String) map_list_users.get(i).get("name");
					    
						//ajout de l'utilisateur dans le modele utilisateur
				    	ModelUser list_user = new ModelUser();
				    	list_user.setId(id_list_user);
				    	list_user.setFirst_name(first_list_user);
				    	list_user.setLast_name(last_list_user);
				    	list_user.setUser_name(user_list_user);
				    	list_user.setMail(email_list_user);
				    	list_user.setRole(role_list_user);
					    list_user.setNumero(numero_list_user);
					    list_user.setAdresse(adress_list_user);
					    list_user.setPass_word(pass_word_list_user);
					  
					  	listOfUsers.add(list_user);
				  }
				  
				  request.setAttribute("listOfUsers", listOfUsers);
				  request.getRequestDispatcher("liste_utilisateurs.jsp").forward(request, response); 
			  }else if(path.equals("/profil")) {
				  request.getRequestDispatcher("profil.jsp").forward(request, response); 
			  }else if(path.equals("/ajout_poubelle")) {
				  
				  String adresse_a_modifier = request.getParameter("adresse");
				  ModelTrash trash_a_modifier;
				  if(adresse_a_modifier==null) {
					  trash_a_modifier = new ModelTrash();
					  
					  request.setAttribute("ajout", "true");
				  }else {
					//Recuperer les données de l'utiiateur en question
				    String getTrashInfo = new TrashImpl().getTrashInfo(adresse_a_modifier);
				    HashMap<String, Object> map_trash_a_modifier = new Gson().fromJson(getTrashInfo, HashMap.class);
				    
				  //Traitrement des données envoyées
					 String  state_modifier=(String) map_trash_a_modifier.get("state");
					 Double level1_modifier = (Double) map_trash_a_modifier.get("level");
					 int level_modifier =(int) Math.round(level1);
					 String  adresse_modifier=(String) map_trash_a_modifier.get("address");
					 
					 trash_a_modifier = new ModelTrash();
//					 trash.setId(id);
					 trash_a_modifier.setLevel(level_modifier);
					 trash_a_modifier.setAdresse(adresse_modifier);
					 trash_a_modifier.setState(state_modifier);
				    
					 request.setAttribute("ajout", "false");
				  }
				  System.out.println("test pou "+ trash_a_modifier);
				  request.setAttribute("trash_a_modifier", trash_a_modifier);
				  request.getRequestDispatcher("ajout_poubelle.jsp").forward(request, response); 
			  }else if(path.equals("/liste_poubelles")) {
				  String trashes = new TrashImpl().getTrashes();
				  Gson gson = new Gson();
				  Type type = new TypeToken<List<HashMap<String, String>>>(){}.getType();
				  List<HashMap<String, String>> map_list_trashes = gson.fromJson(trashes, type);
				  List<ModelTrash> listOfTrashes = new ArrayList<ModelTrash>();
				  
				  for (int i = 0; i < map_list_trashes.size(); i++) {
					  
						//Traitrement des données envoyées
//					  	String id1_list_trash = (String) map_list_trashes.get(i).get("id");
//					  	int id_list_trash = Integer.parseInt(id1_list_trash);
						String  state_list_trash=(String) map_list_trashes.get(i).get("state");
						String level1_list_trash = (String) map_list_trashes.get(i).get("level");
						int level_list_trash = Integer.parseInt(level1_list_trash);
						String  adresse_list_trash=(String) map_list_trashes.get(i).get("address");
						 
						 ModelTrash list_trashes = new ModelTrash();
//						 list_trashes.setId(id_list_trash);
						 list_trashes.setLevel(level_list_trash);
						 list_trashes.setAdresse(adresse_list_trash);
						 list_trashes.setState(state_list_trash);
					  	
					  	listOfTrashes.add(list_trashes);
				  }

				  request.setAttribute("listOfTrashes", listOfTrashes);
				  request.getRequestDispatcher("liste_poubelles.jsp").forward(request, response); 
			  }else {
				  request.getRequestDispatcher("profil.jsp").forward(request, response);
			  }
		  }	
		  else if(utilisateur.getRole().equals("Eboueur")) {
			  String trashes = new TrashImpl().getTrashes();
			  Gson gson = new Gson();
			  Type type = new TypeToken<List<HashMap<String, String>>>(){}.getType();
			  List<HashMap<String, String>> map_list_trashes = gson.fromJson(trashes, type);
			  List<ModelTrash> listOfTrashes = new ArrayList<ModelTrash>();
			  
			  for (int i = 0; i < map_list_trashes.size(); i++) {
					//Traitrement des données envoyées
//				  	String id1_list_trash = (String) map_list_trashes.get(i).get("id");
//				  	int id_list_trash = Integer.parseInt(id1_list_trash);
					String  state_list_trash=(String) map_list_trashes.get(i).get("state");
					String level1_list_trash = (String) map_list_trashes.get(i).get("level");
					int level_list_trash = Integer.parseInt(level1_list_trash);
					String  adresse_list_trash=(String) map_list_trashes.get(i).get("address");
					 
					ModelTrash list_trashes = new ModelTrash();
//					list_trashes.setId(id_list_trash);
					list_trashes.setLevel(level_list_trash);
					list_trashes.setAdresse(adresse_list_trash);
					list_trashes.setState(state_list_trash);
				  	
				  	listOfTrashes.add(list_trashes);
			  }

			  request.setAttribute("listOfTrashes", listOfTrashes);
			  
			  if(path.equals("/profil")) {
				  request.getRequestDispatcher("profil.jsp").forward(request, response); 
			  } else if(path.equals("/liste_poubelles")) {
				  request.getRequestDispatcher("liste_poubelles.jsp").forward(request, response); 
			  }else {
				  request.getRequestDispatcher("liste_poubelles.jsp").forward(request, response); 
			  }
		  }		   
	  }else {
		  request.getRequestDispatcher("login.jsp").forward(request, response); 
	  }
	  
  }
}
