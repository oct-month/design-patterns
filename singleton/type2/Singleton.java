package singleton.type2;

class Singleton
{
    private static Singleton instance;

    static {
        instance = new Singleton();
    }

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        return instance;
    }
}
