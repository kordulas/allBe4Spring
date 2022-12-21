package cw1;

import javax.swing.plaf.IconUIResource;
import java.io.Serializable;
import java.util.Arrays;

public class Company implements Serializable {

    public static final int MAX_EMPOYEES = 3;
    private Employee[] employees = new Employee[MAX_EMPOYEES];
    int couter = 0;


    public void add(Employee employee){
        if(employee != null){
            employees[couter] = employee;
            couter++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Employee employee : employees){
            sb.append(employee.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
