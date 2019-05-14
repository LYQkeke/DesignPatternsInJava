package CoR;

/**
 * Created by KEKE on 2019/5/14
 */
public class Main {

    private static AbstractLogger getChainOfLogger(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
    public static void main(String[] args) {
        AbstractLogger chainOfLogger = getChainOfLogger();
        chainOfLogger.logMessage(AbstractLogger.INFO,"this is a message");
        chainOfLogger.logMessage(AbstractLogger.DEBUG,"this is a debug level info");
        chainOfLogger.logMessage(AbstractLogger.ERROR,"this is a error level info");
    }

}
