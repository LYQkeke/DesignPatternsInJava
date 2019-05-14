package CoR;

/**
 * Created by KEKE on 2019/5/14
 */
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
