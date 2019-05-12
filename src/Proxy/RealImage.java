package Proxy;

/**
 * Created by KEKE on 2019/5/12
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        // 创建对象的时候直接从内存中加载
        // 造成不必要的内存占用
        loadFromDisk();
    }

    @Override
    public void display() {
        System.out.println("displaying " + fileName);
    }

    private void loadFromDisk(){
        System.out.println(fileName + " loading...");
    }
}
