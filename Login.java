package EduWavehub.example.EduWave.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Login {
	@Id
	int A_id;
	String uname;
	int password;
	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Login(int a_id, String uname, int password) {
		super();
		A_id = a_id;
		this.uname = uname;
		this.password = password;
	}
	public int getA_id() {
		return A_id;
	}
	public void setA_id(int a_id) {
		A_id = a_id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Login [A_id=" + A_id + ", uname=" + uname + ", password=" + password + "]";
	}
				 
}
