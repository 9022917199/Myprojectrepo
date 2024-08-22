package EduWavehub.example.EduWave.Model;




import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

@Entity
public class Contact {
	@Id
	@GeneratedValue(generator = "S_seqcon", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name ="S_seqcon", sequenceName = "S_sequenceCon", initialValue = 1, allocationSize = 1)
	int S_id;
	@NotBlank(message = "employee name can't be left empty")
	String name;
	@Email(message = "Enter a valid EmailId")
	String email;
	@Pattern(regexp = "^[0-9]{10}$", message = "Student number must be a 10-digit number.")
	String phone;
	@NotNull(message = "Enter a valid Message")
	String Message;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(int s_id, @NotNull String name, @Email String email, String phone, String message) {
		super();
		S_id = s_id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		Message = message;
	}
	public int getS_id() {
		return S_id;
	}
	public void setS_id(int s_id) {
		S_id = s_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@Override
	public String toString() {
		return "Contact [S_id=" + S_id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", Message="
				+ Message + "]";
	}
	
	}
