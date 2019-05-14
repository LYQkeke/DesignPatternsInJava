package CoR;

/**
 * Created by KEKE on 2019/5/14
 */
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        super(level);
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: "+message);
    }
}
