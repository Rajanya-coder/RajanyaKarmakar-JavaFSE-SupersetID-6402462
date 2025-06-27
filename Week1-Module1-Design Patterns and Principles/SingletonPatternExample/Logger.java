public class Logger {
    private static Logger instance;        //private static instance of itself.

    private Logger(){                      //constructor of Logger is private
        System.out.println("Initializing the Logger...");
    }
    public static Logger getInstance(){     //public static method to get the instance of the Logger class.
        if(instance == null){               //Singleton design pattern.
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message) {
        System.out.println("LOG: " + message);
    }

}

