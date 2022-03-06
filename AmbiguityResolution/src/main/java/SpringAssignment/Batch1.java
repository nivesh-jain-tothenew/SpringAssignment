package SpringAssignment;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Batch1 implements BatchClassInterface4 {

    public String getStudent(String name)
    {
        return name;
    }
}
