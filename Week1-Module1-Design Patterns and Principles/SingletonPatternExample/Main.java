public class Main {
    public static void main(String[] args){
        Logger logger1 = Logger.getInstance();
        System.out.println("This is the first log message.");

        Logger logger2 = Logger.getInstance();
        System.out.println("This is the second log message.");

        if(logger1 == logger2){
            System.out.println("Both logger instances are the same.");
        }
    }

}
