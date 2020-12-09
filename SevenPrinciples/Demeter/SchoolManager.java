package SevenPrinciples.Demeter;

import java.util.ArrayList;
import java.util.List;

public class SchoolManager
{
    public List<Employee> getAllEmployees()
    {
        List<Employee> list = new ArrayList<>();
        for (int i = 0; i < 5; ++ i)
        {
            Employee emp = new Employee();
            emp.setId("学校总部员工id=" + i);
            list.add(emp);
        }
        return list;
    }

    // CollegeEmployee不是本类的直接朋友
    void printAllEmployees(CollegeManager sub)
    {
        List<CollegeEmployee> list1 = sub.getAllEmployees();
        System.err.println("-------------学院员工-------------");
        for (CollegeEmployee e : list1)
        {
            System.out.println(e.getId());
        }

        List<Employee> list2 = this.getAllEmployees();
        System.out.println("-------------学校总部员工-------------");
        for (Employee e : list2)
        {
            System.out.println(e.getId());
        }
    }
}
