package Proxy;

/**
 * Created by KEKE on 2019/5/12
 */
public class ProxyImage implements Image {

    private String fileName;

    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        // 在需要进行display时，才创建RealImage
        // 减少了不必要的内存占用
        if (realImage==null)
            realImage = new RealImage(fileName);
        realImage.display();
    }
}
