package singleton.type1;

class Singleton
{
    private final static Singleton instance = new Singleton();

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        return instance;
    }
}
