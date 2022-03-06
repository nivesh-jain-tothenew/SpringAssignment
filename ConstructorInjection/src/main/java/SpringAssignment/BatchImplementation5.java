package SpringAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BatchImplementation5 {

    @Autowired
    BatchClassInterface5 batchClassInterface2;

    public BatchImplementation5(BatchClassInterface5 batchClassInterface2) {
        this.batchClassInterface2 = batchClassInterface2;
    }

    public void studentDetails(String name)
    {
        System.out.println(batchClassInterface2.getStudent(name));
    }
}
