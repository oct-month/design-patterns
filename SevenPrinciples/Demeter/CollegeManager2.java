package SevenPrinciples.Demeter;

import java.util.ArrayList;
import java.util.List;

public class CollegeManager2
{
    public List<CollegeEmployee> getAllEmployees()
    {
        List<CollegeEmployee> list = new ArrayList<>();
        for (int i = 0; i < 10; ++ i)
        {
            CollegeEmployee emp = new CollegeEmployee();
            emp.setId("学院员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    public void printEmployee()
    {
        List<CollegeEmployee> list1 = this.getAllEmployees();
        System.out.println("-----------学院员工-----------");
        for (CollegeEmployee e : list1)
        {
            System.out.println(e.getId());
        }
    }
}
