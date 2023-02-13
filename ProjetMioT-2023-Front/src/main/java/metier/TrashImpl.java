package metier;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class TrashImpl implements TRash {

	@Override
	public String getTrashInfo(String adress) throws IOException {
		
		URL apiUrl = new URL("http://backend:8084/api/trash/get/data?address="+adress);
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
	public String getTrashes() throws IOException{
		URL apiUrl = new URL("http://backend:8084/api/trash/get/all");
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
	public void addTrash() {
		// TODO Auto-generated method stub

	}

	@Override
	public String deleteTrash(String adress) throws IOException{
		URL apiUrl = new URL("http://backend:8084/api/user/delete?id="+adress);
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
	public void modifyTrashLevel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyTrashAddress() {
		// TODO Auto-generated method stub

	}

	@Override
	public void modifyTrashState() {
		// TODO Auto-generated method stub

	}

}
