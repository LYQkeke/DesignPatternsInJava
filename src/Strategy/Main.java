package Strategy;

/**
 * Created by KEKE on 2019/5/12
 */
public class Main {

    public static void main(String[] args) {
        MessageContext messageContext1 = new MessageContext(new MD5Strategy());
        messageContext1.getMessage();
        System.out.println();
        MessageContext messageContext2 = new MessageContext(new SHAStrategy());
        messageContext2.getMessage();
        System.out.println();
        MessageContext messageContext3 = new MessageContext(()-> System.out.println("执行我的定制加密..."));
        messageContext3.getMessage();
    }
}
