package SpringAssignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BatchImplementation3 {

    @Autowired
    BatchClassInterface3 batchClassInterface2;

    public BatchImplementation3(BatchClassInterface3 batchClassInterface2) {
        this.batchClassInterface2 = batchClassInterface2;
    }

    public void studentDetails(String name)
    {
        System.out.println(batchClassInterface2.getStudent(name));
    }
}
