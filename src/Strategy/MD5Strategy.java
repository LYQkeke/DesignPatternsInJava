package Strategy;

/**
 * Created by KEKE on 2019/5/12
 */
public class MD5Strategy implements EncryptStrategy {
    @Override
    public void encrypt() {
        System.out.println("执行MD5加密...");
    }
}
