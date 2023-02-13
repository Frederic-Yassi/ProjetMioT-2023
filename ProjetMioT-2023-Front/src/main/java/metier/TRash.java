package metier;

import java.io.IOException;
import java.net.MalformedURLException;

public interface TRash {
	public String getTrashInfo(String adress) throws MalformedURLException, IOException; 
	public String getTrashes()throws IOException; 
	public void addTrash(); 
	public String deleteTrash(String adress)throws IOException; 
	public void modifyTrashLevel(); 
	public void modifyTrashAddress(); 
	public void modifyTrashState(); 
}
