package SpringAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AmbiguityResolutionApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(AmbiguityResolutionApplication.class, args);
		BatchImplementation4 batchImplementation = applicationContext.getBean(BatchImplementation4.class);
		batchImplementation.studentDetails("nivesh");
		//SpringApplication.run(LooselyCoupledCodeApplication.class, args);
	}

}
