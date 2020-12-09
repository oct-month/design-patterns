package SevenPrinciples.Demeter;

public class Demo1
{
    public static void main(String[] args)
    {
        SchoolManager schoolManager = new SchoolManager();
        schoolManager.printAllEmployees(new CollegeManager());
    }
}
