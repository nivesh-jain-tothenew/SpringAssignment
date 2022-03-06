package SpringAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BeanPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(BeanPropertiesApplication.class, args);
		BatchImplementation3 batchImplementation = applicationContext.getBean(BatchImplementation3.class);
		batchImplementation.studentDetails("nivesh");
		//SpringApplication.run(LooselyCoupledCodeApplication.class, args);
	}

}
