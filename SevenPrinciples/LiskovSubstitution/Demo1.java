package SevenPrinciples.LiskovSubstitution;

// 类B重写了父类的方法，改变了原来的功能
public class Demo1
{
    public static void main(String[] args)
    {
        A a = new A(); 
        System.out.println("11 - 3 = " + a.func1(11, 3));   
        System.out.println("1 - 8 = " + a.func1(1, 8));

        System.out.println("---------------------------");

        B b = new B();
        System.out.println("11 - 3 = " + b.func1(11, 3));
        System.out.println("1 - 8 = " + b.func1(1, 8));
        System.out.println("11 + 3 + 9 = " + b.func2(11, 3));
    }    
}
