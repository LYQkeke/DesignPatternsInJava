package Composite;

import java.util.List;

/**
 * Created by KEKE on 2019/5/13
 */
public class File extends AbstractFile{


    public File(String name) {
        super(name);
    }

    @Override
    public boolean add(AbstractFile file) {
        return false;
    }

    @Override
    public boolean remove(AbstractFile file) {
        return false;
    }

    @Override
    public void display() {
        System.out.println("File: " + this.getName());
    }

    @Override
    public List<AbstractFile> getChild() {
        return null;
    }
}
