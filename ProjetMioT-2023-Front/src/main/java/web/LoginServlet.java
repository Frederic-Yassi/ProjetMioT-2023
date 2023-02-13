package web;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import metier.TRash;
import metier.TrashImpl;
import metier.USer;
import metier.UserImpl;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    String username = (String) request.getParameter("log_username");
    String password = request.getParameter("log_password");
    
    // Verification de l'utilisateur avec l'API à partir de la fonction
    String userId = new UserImpl().getUserId(username, password);
    if (!userId.equals("-1")) {
    //	
    	//Tester l'API et la base de donnée
    	String testApi = new UserImpl().testApi();
    	String testBdd = new UserImpl().testBdd();
    	
    	System.out.println(testApi);
    	System.out.println(testBdd);
    	

    	//Recuperer les données de l'utiiateur en question
    	String getUserInfo = new UserImpl().getUserInfo(Integer.parseInt(userId));//Integer.parseInt(userId)
    	HashMap<String, Object> map = new Gson().fromJson(getUserInfo, HashMap.class);
    
    	//Traitrement des données envoyées
    	Double id1 = (Double) map.get("id");
    	int id =(int) Math.round(id1);
    	String email =(String) map.get("email");
    	String first_name =(String) map.get("prenom");
    	String user_name =(String) map.get("username");
    	String last_name =(String) map.get("nom");
    	String role =(String) map.get("role");
    	String numero =(String) map.get("num");
    	String  adress=(String) map.get("address");
    	String pass_word =(String) map.get("name");
    	
    	//ajout de l'utilisateur dans le modele utilisateur
    	ModelUser user = new ModelUser();
    	user.setId(id);
    	user.setFirst_name(first_name);
    	user.setLast_name(last_name);
    	user.setUser_name(user_name);
    	user.setMail(email);
    	user.setRole(role);
    	//user.setRole("Admin");
    	user.setNumero(numero);
    	user.setAdresse(adress);
    	user.setPass_word(pass_word);

	    // à defaut mais a supprimer
//	    ModelUser user = new ModelUser(1, "Olivia", "AVOGNAN", "OAvognan", "0123456", "wilfriedsoumag@gmail.com","Admin", "+337578562656", "9 rue louis arrect bat 752");
	    System.out.println("l'utilisateur  ****************************************");
	    
	    //Enregistrerle model de l'utilisateur dans sa session
	    request.getSession().setAttribute("user", user);
	    response.sendRedirect("etat_poubelle");
    } else {
    	request.setAttribute("erreur", "true");
    	request.getRequestDispatcher("login.jsp").forward(request, response);
    }
  }
}

