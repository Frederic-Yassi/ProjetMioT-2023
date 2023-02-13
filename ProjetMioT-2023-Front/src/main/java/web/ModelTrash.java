package web;

public class ModelTrash {
	int id;
	String state;
	int level;
	String adresse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "ModelTrash [id=" + id + ", state=" + state + ", level=" + level + ", adresse=" + adresse + "]";
	}
	public ModelTrash(int id, String state, int level, String adresse) {
		super();
		this.id = id;
		this.state = state;
		this.level = level;
		this.adresse = adresse;
	}
	public ModelTrash() {
		super();
	}
	
}
