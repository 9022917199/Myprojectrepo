package EduWavehub.example.EduWave.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class registration {
	@Id
	@GeneratedValue(generator = "S_seqregis", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name ="S_seqregis", sequenceName = "S_sequenceRegis", initialValue = 1, allocationSize = 1)
	int S_id;
	String fullname;
	String email;
	String CollageName;
	String fieldname;
	String course;
	String phonenumber;
	public registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public registration(int s_id, String fullname, String email, String CollageName, String fieldname, String course,
			String phonenumber) {
		super();
		S_id = s_id;
		this.fullname = fullname;
		this.email = email;
		this.CollageName = CollageName;
		this.fieldname = fieldname;
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
	public void setCollageName(String CollageName) {
		this.CollageName = CollageName;
	}
	public String getFieldname() {
		return fieldname;
	}
	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
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
		return "registration [S_id=" + S_id + ", fullname=" + fullname + ", email=" + email + ", CollageName=" + CollageName
				+ ", fieldname=" + fieldname + ", course=" + course + ", phonenumber=" + phonenumber + "]";
	}
	
}
