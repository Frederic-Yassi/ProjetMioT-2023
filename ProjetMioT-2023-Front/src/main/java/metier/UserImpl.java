package metier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.List;

import web.ModelUser;

public class UserImpl implements USer {

	@Override
	public String testApi() throws IOException {
		URL apiUrl = new URL("http://backend:8084/api/testApi");
	    BufferedReader in = new BufferedReader(
	    	new InputStreamReader(apiUrl.openStream())
	    );

	    String inputLine;
	    String output = "";
	    while ((inputLine = in.readLine()) != null) {
	    	System.out.println(inputLine);
	    	output += inputLine;
	    }
	    in.close();
	    return output;

	}

	@Override
	public String testBdd() throws IOException{
		URL apiUrl = new URL("http://backend:8084/api/testBdd");
	    BufferedReader in = new BufferedReader(
	    	new InputStreamReader(apiUrl.openStream())
	    );

	    String inputLine;
	    String output = "";
	    while ((inputLine = in.readLine()) != null) {
	    	System.out.println(inputLine);
	    	output += inputLine;
	    }
	    in.close();
	    return output;

	}

	@Override
	public String getUserId(String admin, String password) throws IOException{
		URL apiUrl = new URL("http://backend:8084/api/user/get?name="+admin+"&pwd="+password);//username
	    BufferedReader in = new BufferedReader(
	    	new InputStreamReader(apiUrl.openStream())
	    );

	    String inputLine;
	    String output = "";
	    while ((inputLine = in.readLine()) != null) {
	    	System.out.println(inputLine);
	    	output += inputLine;
	    }
	    in.close();
	    return output;
	}

	@Override
	public String getUsers() throws IOException{
		URL apiUrl = new URL("http://backend:8084/api/user/get/all");
	    BufferedReader in = new BufferedReader(
	    	new InputStreamReader(apiUrl.openStream())
	    );

	    String inputLine;
	    String output = "";
	    while ((inputLine = in.readLine()) != null) {
	    	System.out.println(inputLine);
	    	output += inputLine;
	    }
	    in.close();
	    return output;

	}

	@Override
	public String getUserInfo(long id) throws IOException {
		
		URL apiUrl = new URL("http://backend:8084/api/user/get/data?id="+id);
	    BufferedReader in = new BufferedReader(
	    	new InputStreamReader(apiUrl.openStream())
	    );

	    String inputLine;
	    String output = "";
	    while ((inputLine = in.readLine()) != null) {
	    	System.out.println(inputLine);
	    	output += inputLine;
	    }
	    in.close();
	    return output;

	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub

	}

	@Override
	public String deleteUser(int id) throws IOException{
		URL apiUrl = new URL("http://backend:8084/api/user/delete?id="+id);
	    BufferedReader in = new BufferedReader(
	    	new InputStreamReader(apiUrl.openStream())
	    );
	
	    String inputLine;
	    String output = "";
	    while ((inputLine = in.readLine()) != null) {
	    	System.out.println(inputLine);
	    	output += inputLine;
	    }
	    in.close();
	    return output;

	}

	@Override
	public void modifyUserEmail() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyUserName() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyUserPwd() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyUserRole() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyUserNum() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyUserAddress() {
		// TODO Auto-generated method stub

	}

	@Override
	public void authendificate() {
		// TODO Auto-generated method stub

	}

	@Override
	public String authendification(String username, String password) throws IOException {
		URL apiUrl = new URL("http://backend:8084/api/auth?name="+username+"&pwd="+password);
	    BufferedReader in = new BufferedReader(
	    	new InputStreamReader(apiUrl.openStream())
	    );

	    String inputLine;
	    String id = "";
	    while ((inputLine = in.readLine()) != null) {
	    	System.out.println(inputLine);
	    	id += inputLine;
	    }
	    in.close();
	    return id;

	}

	@Override
	public void handleLogin() {
		// TODO Auto-generated method stub

	}

}
