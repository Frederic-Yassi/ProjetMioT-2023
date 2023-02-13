package web;

public class ModelUser {
	int id;
	String first_name;
	String Last_name;
	String user_name;
	String pass_word;
	String mail;
	String role;
	String numero;
	String adresse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPass_word() {
		return pass_word;
	}
	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	@Override
	public String toString() {
		return "ModelUser [id=" + id + ", first_name=" + first_name + ", Last_name=" + Last_name + ", user_name="
				+ user_name + ", pass_word=" + pass_word + ", mail=" + mail + ", role=" + role + ", numero=" + numero
				+ ", adresse=" + adresse + "]";
	}
	public ModelUser(int id, String first_name, String last_name, String user_name, String pass_word, String mail,
			String role, String numero, String adresse) {
		super();
		this.id = id;
		this.first_name = first_name;
		Last_name = last_name;
		this.user_name = user_name;
		this.pass_word = pass_word;
		this.mail = mail;
		this.role = role;
		this.numero = numero;
		this.adresse = adresse;
	}
	public ModelUser() {
		super();
	}
	
	
}
