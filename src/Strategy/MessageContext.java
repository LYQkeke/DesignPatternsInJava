package Strategy;

/**
 * Created by KEKE on 2019/5/12
 */
public class MessageContext {

    private EncryptStrategy encryptStrategy;

    public MessageContext(EncryptStrategy encryptStrategy){
        this.encryptStrategy = encryptStrategy;
    }

    public void getMessage(){
        encryptStrategy.encrypt();
        System.out.println("得到加密消息");
    }
}
