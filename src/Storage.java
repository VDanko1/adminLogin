import java.util.HashSet;

public class Storage {
    private HashSet<Employee> emp;


    public Storage() {
        this.emp = new HashSet<>();




    }
    public void addEmployee(Employee employee) {
        this.emp.add(employee);
    }




}
