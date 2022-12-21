package mapyCw1;

import java.util.HashMap;
import java.util.Map;

public class Company {

    Map<String ,Employee> employeeMap = new HashMap<>();

    boolean addEmployee(Employee employee){
        String key = employee.getName() + " " + employee.getLastName();
        if(employeeMap.containsKey(key))
            return false;
        employeeMap.put(key,employee);
        return true;
    }

    Employee getEmployee(String name, String lastName){
        String key = name + " " + lastName;
        return employeeMap.get(key);
    }
}
