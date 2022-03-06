package SpringAssignment;

public class BatchImplementation{

    BatchClassInterface batchClassInterface;

    public BatchImplementation(BatchClassInterface batchClassInterface) {
        this.batchClassInterface = batchClassInterface;
    }

    public String studentDetails(String name)
    {
        batchClassInterface.getStudent(name);

        return name;

    }
}
