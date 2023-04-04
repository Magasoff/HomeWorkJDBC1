import java.io.IOException;
import java.util.List;

public interface EmployeeDAO {

    void add(Employee employee);

    Employee getBuyId(int Id);

    List<Employee> getAllEmployee();

    void updateEmployee(int id, Employee employee);

    void deleteEmployee(int id);

    Employee getById(int id);
}

