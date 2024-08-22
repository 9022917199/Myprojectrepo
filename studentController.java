package EduWavehub.example.EduWave.Controller;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import EduWavehub.example.EduWave.Model.Contact;
import EduWavehub.example.EduWave.Model.Login;
import EduWavehub.example.EduWave.Model.Studentreg;
import EduWavehub.example.EduWave.Model.feedback;
import EduWavehub.example.EduWave.Model.registration;
import EduWavehub.example.EduWave.Model.course_List;
import jakarta.persistence.Query;
import jakarta.servlet.Registration;
import jakarta.validation.Valid; 


@Controller
public class studentController {
   
	@Autowired
	SessionFactory ss;
	
	@RequestMapping("/")
	public String name()
	{
		return "home";
	}
		@RequestMapping("/CreateAccount")
	   	public String registerStudent()
	   	{
	   		return "Studentregistration";
	   	}
		@RequestMapping("/Studentregistration")
		public Studentreg dataSave(Studentreg reg) {
			Session s = ss.openSession();
			Transaction tx = s.beginTransaction();
			s.save(reg);
			System.out.println(reg);
			tx.commit();
			return reg;
	}

	@RequestMapping("/Adminlogin")
	public String login()
	{
		return "login";
	}
	
	@RequestMapping("/login")
	public String gopalLogin(Login login, Model model) {
		
		Session session = ss.openSession();

		Login dbLogin = session.get(Login.class, login.getPassword()); // gopal // sagar

		String page = "homeAdmin2";
		String msg = null;
		if (dbLogin != null) 
		{
			if (login.getUname().equals(dbLogin.getUname())) 
			{ // 1234 //1234
				page = "homeAdmin2";
			} else {
				msg = "Invalid Username";
			}
		} else {
			msg = "Invalid Password";
		}
		model.addAttribute("msg", msg); // front end
		return page;	
	}   
	
    @RequestMapping("/aboutUs")
	public String aboutUs()
	{
		return "Ab";
	} 
    @RequestMapping("/Coursecatlog")
	public String Coursecatlog()
	{
		return "Coursecatlog";
	}
    
    @RequestMapping("/Coursedetail")
	public String courseDetails()
	{
		return "CDetails";
	}
    @RequestMapping("/viewtable4")
   	public ModelAndView viewtable4() {
   		Session s = ss.openSession();
   		Query query = s.createQuery("from course_List");
   		List<feedback> al = ((org.hibernate.query.Query) query).list();
   		ModelAndView view = new ModelAndView();
   		view.addObject("al", al);
   		System.out.println(al);
   		view.setViewName("CDetails");
   		return view;
   	}
    @RequestMapping("/contactpage")
	public String contactPage() {
		return "contact";
	}
    
    @RequestMapping("/contact")
	public Contact contactSave(@Valid Contact contact) {
		Session s = ss.openSession();
		Transaction tx = s.beginTransaction();
		s.save(contact);
		System.out.println(contact);
		tx.commit();
		return contact;
	}
   
    @RequestMapping("/feedbackpage")
	public String feedbackPage() {
		return "feedback";
	}

    @RequestMapping("/feedback")
	public EduWavehub.example.EduWave.Model.feedback feedbackSave(@Valid EduWavehub.example.EduWave.Model.feedback feedback)
	{
    	Session s = ss.openSession();
		Transaction tx = s.beginTransaction();
		s.save(feedback);
		System.out.println(feedback);
		tx.commit();
		System.out.println("Data Submited in feedback");
		
		return feedback;
	}
    @RequestMapping("/homeAdmin")
	public String admin()
	{
		return "homeAdmin2";
	}
   
    /*@RequestMapping("/contactAdmin")
	public String contactadmin()
	{
		return "contactAdmin";
	}*/
    @RequestMapping("/viewtable")
	public ModelAndView viewtable() 
    {
    	Session s = ss.openSession();
		Query query = s.createQuery("from Contact");
		List<Contact> al = ((org.hibernate.query.Query) query).list();
		ModelAndView view = new ModelAndView();
		view.addObject("al", al);
		System.out.println(al);
		view.setViewName("contactAdmin");
		return view;
	}
    
    @RequestMapping("/feedbackAdmin")
   	public String feedbackadmin()
   	{
   		return "feedbackAdmin";
   	}
    @RequestMapping("/viewtable1")
	public ModelAndView viewtable1() {
		Session s = ss.openSession();
		Query query = s.createQuery("from feedback");
		List<feedback> al = ((org.hibernate.query.Query) query).list();
		ModelAndView view = new ModelAndView();
		view.addObject("al", al);
		System.out.println(al);
		view.setViewName("feedbackAdmin");
		return view;
	}
    @RequestMapping("/studentAdmin")
   	public String studentadmin()
   	{
   		return "registartionAdmin";
   	}
    
    @RequestMapping("/viewtable2")
   	public ModelAndView viewtable2() {
   		Session s = ss.openSession();
   		Query query = s.createQuery("from Studentreg");
   		List<feedback> al = ((org.hibernate.query.Query) query).list();
   		ModelAndView view = new ModelAndView();
   		view.addObject("al", al);
   		System.out.println(al);
   		view.setViewName("registartionAdmin");
   		return view;
   	}
    @RequestMapping("/aboutAdmin")
   	public String aboutAdmin()
   	{
   		return "AbAdmin";
   	}
    @RequestMapping("/courseAdmin")
   	public String courseAdmin()
   	{
   		return "CoursecatlogAdmin";
   	}
    
    @RequestMapping("/CourseInfo")
	public String courseInfo()
	{
		return "CourseInfo";
	} 
    @RequestMapping("/viewtable3")
   	public ModelAndView viewtable3() {
   		Session s = ss.openSession();
   		Query query = s.createQuery("from course_List");
   		List<feedback> al = ((org.hibernate.query.Query) query).list();
   		ModelAndView view = new ModelAndView();
   		view.addObject("al", al);
   		System.out.println(al);
   		view.setViewName("CourseInfo");
   		return view;
   	}
    @RequestMapping("/html1")
   	public String html()
   	{
   		return "HTML";
   	}
    @RequestMapping("/css")
   	public String css()
   	{
   		return "CSS";
   	}
    @RequestMapping("/javascript")
   	public String javascript()
   	{
   		return "javaScript";
   	}
    @RequestMapping("/java")
   	public String java()
   	{
   		return "java";
   	}
    @RequestMapping("/python")
   	public String python()
   	{
   		return "python";
   	}
    @RequestMapping("/reactjs")
   	public String reactjs()
   	{
   		return "reactJs";
   	}
    @RequestMapping("/logout")
	public String logout()
	{
		return "logout";
	}
    
    @RequestMapping("/updateCoursePage")
   	public String updateCourse()
   	{
   		return "updateCourse";
   	}
  
    @RequestMapping("/updateCourse")
	public ModelAndView Update(course_List update) {
		Session s = ss.openSession();
		Transaction tx = s.beginTransaction();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("updateCourse");
		s.update(update);
		tx.commit();
		return mv;
	}
}