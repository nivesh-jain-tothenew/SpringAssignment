package SpringAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LooselyCoupledCodeApplication {

	public static void main(String[] args) {
		BatchImplementation batchImplementation = new BatchImplementation(new Batch1());
		System.out.println(batchImplementation.studentDetails("nivesh"));
		//SpringApplication.run(LooselyCoupledCodeApplication.class, args);
	}

}
