package SpringAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ComponentAndAutowiredAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(ComponentAndAutowiredAnnotationApplication.class, args);
		BatchImplementation2 batchImplementation = applicationContext.getBean(BatchImplementation2.class);
		batchImplementation.studentDetails("nivesh");
		//SpringApplication.run(LooselyCoupledCodeApplication.class, args);
	}

}
