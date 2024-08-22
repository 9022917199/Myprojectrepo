package EduWavehub.example.EduWave.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

@Entity
public class Studentreg {
	@Id
	@GeneratedValue(generator = "S_seq", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name ="S_seq", sequenceName = "S_sequenceRegistration", initialValue = 1, allocationSize = 1)
	int S_id;
	@NotBlank(message = "employee name can't be left empty")
	String fullname;
	@Email(message = "Enter a valid EmailId")
	String email;
	String CollageName;
	String course;
	@Pattern(regexp = "^[0-9]{10}$", message = "Student number must be a 10-digit number.")
	String phonenumber;
	public Studentreg() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studentreg(int s_id, String fullname, String email, String collageName, String course, String phonenumber) {
		super();
		S_id = s_id;
		this.fullname = fullname;
		this.email = email;
		CollageName = collageName;
		this.course = course;
		this.phonenumber = phonenumber;
	}
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCollageName() {
		return CollageName;
	}
	public void setCollageName(String collageName) {
		CollageName = collageName;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Studentreg [S_id=" + S_id + ", fullname=" + fullname + ", email=" + email + ", CollageName="
				+ CollageName + ", course=" + course + ", phonenumber=" + phonenumber + "]";
	}
	
}
