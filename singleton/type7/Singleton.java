package singleton.type7;

class Singleton
{    
    private Singleton()
    {
    }

    private static class SingletonInstance
    {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance()
    {
        return SingletonInstance.INSTANCE;
    }
}
