package SpringAssignment;

import org.springframework.stereotype.Component;

@Component
public class Batch1 implements BatchClassInterface5 {

    public String getStudent(String name)
    {
        return name;
    }
}
