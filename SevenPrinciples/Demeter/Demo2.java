package SevenPrinciples.Demeter;

public class Demo2
{
    public static void main(String[] args)
    {
        SchoolManager2 schoolManager = new SchoolManager2();
        schoolManager.printAllEmployee(new CollegeManager2());
    }
}
