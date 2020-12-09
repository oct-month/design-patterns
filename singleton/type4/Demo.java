package singleton.type4;

class Demo
{
    public static void main(String[] args)
    {
        System.out.println("懒汉式2，线程安全~");
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
        System.out.println("instance.hashCode =" + instance.hashCode());
        System.out.println("instance2.hashCode=" + instance2.hashCode());
    }
}
