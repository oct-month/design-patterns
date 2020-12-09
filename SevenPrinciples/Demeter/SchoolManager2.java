package SevenPrinciples.Demeter;

import java.util.List;
import java.util.ArrayList;

public class SchoolManager2
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

    public void printAllEmployee(CollegeManager2 sub)
    {
        // 将输出学院员工的方法，封装到CollegeManager2
        sub.printEmployee();

        List<Employee> list2 = this.getAllEmployees();
        System.out.println("-------------学校总部员工-------------");
        for (Employee e : list2)
        {
            System.out.println(e.getId());
        }
    }
}
