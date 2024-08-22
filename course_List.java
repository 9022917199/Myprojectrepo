package EduWavehub.example.EduWave.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class course_List {

@Id
int C_id;
String C_name;
String C_duration;
int C_fees;
public course_List() {
	super();
	// TODO Auto-generated constructor stub
}
public course_List(int c_id, String c_name, String c_duration, int c_fees) {
	super();
	C_id = c_id;
	C_name = c_name;
	C_duration = c_duration;
	C_fees = c_fees;
}
public int getC_id() {
	return C_id;
}
public void setC_id(int c_id) {
	C_id = c_id;
}
public String getC_name() {
	return C_name;
}
public void setC_name(String c_name) {
	C_name = c_name;
}
public String getC_duration() {
	return C_duration;
}
public void setC_duration(String c_duration) {
	C_duration = c_duration;
}
public int getC_fees() {
	return C_fees;
}
public void setC_fees(int c_fees) {
	C_fees = c_fees;
}
@Override
public String toString() {
	return "course_List [C_id=" + C_id + ", C_name=" + C_name + ", C_duration=" + C_duration + ", C_fees=" + C_fees
			+ "]";
}

}
