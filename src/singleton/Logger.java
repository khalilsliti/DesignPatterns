package singleton;

public class Logger {

    private static Logger logger; // making the logger static so that we can call it inside the static method
    private Logger(){} // making the constructor private to make uncallable from other classes

    static public Logger getInstance()
    // making the method static so that we won't need to instanciate an instance to call the method
    {
        if (logger == null)
        {
            logger = new Logger();
        }
        return logger;
    }
}
