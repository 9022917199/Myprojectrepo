package EduWavehub.example.EduWave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EduWaveApplication {
	public static void main(String[] args) 
	{
		SpringApplication.run(EduWaveApplication.class, args);
		System.out.println("Hello user");
	}
}
