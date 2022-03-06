package SpringAssignment;

import org.springframework.stereotype.Component;

@Component
public class Batch1Class implements BatchClassInterface3 {

    public String getStudent(String name)
    {
        return name;
    }
}
