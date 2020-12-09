package SevenPrinciples.LiskovSubstitution;

// 去掉原有的依赖关系，采用依赖、聚合、组合等关系代替
public class Demo2
{
    public static void main(String[] args)
    {
        A2 a = new A2();
        System.out.println("11 - 3 = " + a.func1(11, 3));
        System.out.println("1 - 8 = " + a.func1(1, 8));

        System.out.println("-----------------------------");

        B2 b = new B2();
        System.out.println("11 + 3 = " + b.func1(11, 3));
        System.out.println("1 + 8 = " + b.func1(1, 8));
        System.out.println("11 + 3 + 9 = " + b.func2(11, 3));
        System.out.println("11 - 3 = " + b.func3(11, 3));
    }
}
