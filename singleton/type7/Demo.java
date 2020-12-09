package singleton.type7;

class Demo
{
    public static void main(String[] args)
    {
        System.out.println("使用静态内部类完成单例模式");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode =" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
