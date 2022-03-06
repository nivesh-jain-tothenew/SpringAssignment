package SpringAssignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TightlyCoupledCodeApplication {

	public static void main(String[] args) {
		Batch batch = new Batch();
		String result =  batch.getStudent("Nivesh");
		System.out.println(result);
		SpringApplication.run(TightlyCoupledCodeApplication.class, args);
	}

}
