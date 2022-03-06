package SpringAssignment;

import org.springframework.stereotype.Component;

public class Batch2 implements BatchClassInterface2 {

    public String getStudent(String name)
    {
        return "new "+name;
    }
}
