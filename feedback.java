package EduWavehub.example.EduWave.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class feedback {
	@Id
	@GeneratedValue(generator = "S_seq2", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name ="S_seq2", sequenceName = "S_sequence2", initialValue = 1, allocationSize = 1)
	int S_id;
	@NotNull
	@Size(min = 4, message = "Username must be minimum of 4 characters")
	String name;
	@Email (message = "Email address is not valid")
	String email;
	@NotNull(message = "Enter a valid Message")
	String Message;
	public feedback() {
		super();
		// TODO Auto-generated constructor stub
	}
	public feedback(int s_id, @NotNull @Size(min = 4, message = "Username must be minimum of 4 characters") String name,
			@Email(message = "Email address is not valid") String email,
			@NotEmpty(message = "Please enter some data") String message) {
		super();
		S_id = s_id;
		this.name = name;
		this.email = email;
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
	public String getMessage() {
		return Message;
	}
	public void setMessage(String message) {
		Message = message;
	}
	@Override
	public String toString() {
		return "feedback [S_id=" + S_id + ", name=" + name + ", email=" + email + ", Message=" + Message + "]";
	}
	
			
}
