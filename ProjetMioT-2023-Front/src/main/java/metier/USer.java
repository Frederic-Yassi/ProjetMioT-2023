package metier;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import web.ModelUser;

public interface USer {
	public String testApi() throws IOException; 
	public String testBdd() throws IOException;  
	public String getUserId(String admin, String password) throws IOException; 
	public String getUsers() throws  IOException; 
	public String getUserInfo(long id) throws MalformedURLException, IOException; 
	public void addUser(); 
	public String deleteUser(int id)throws IOException; 
	public void modifyUserEmail(); 
	public void modifyUserName(); 
	public void modifyUserPwd(); 
	public void modifyUserRole(); 
	public void modifyUserNum(); 
	public void modifyUserAddress(); 
	public void authendificate(); 
	public String authendification(String username, String password) throws MalformedURLException, IOException; 
	public void handleLogin(); 
	
}
