package Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KEKE on 2019/5/13
 */
public class Folder extends AbstractFile {

    private List<AbstractFile> children;

    public Folder(String name) {
        super(name);
        children = new ArrayList<>();
    }

    @Override
    public boolean add(AbstractFile file) {
        return children.add(file);
    }

    @Override
    public boolean remove(AbstractFile file) {
        return children.remove(file);
    }

    @Override
    public void display() {
        System.out.println("Folder: " + this.getName());
    }

    @Override
    public List<AbstractFile> getChild() {
        return children;
    }
}
