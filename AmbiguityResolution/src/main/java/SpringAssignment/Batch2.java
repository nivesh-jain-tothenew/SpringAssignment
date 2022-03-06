package SpringAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Batch2 implements BatchClassInterface4 {

    public String getStudent(String name)
    {
        return "new "+name;
    }
}
