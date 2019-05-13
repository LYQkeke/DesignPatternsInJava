package Composite;

import java.util.List;

/**
 * Created by KEKE on 2019/5/13
 */
public abstract class AbstractFile {

    private String name;

    public AbstractFile(String name){
        this.name = name;
    }

    abstract public boolean add(AbstractFile file);

    abstract public boolean remove(AbstractFile file);

    abstract public void display();

    abstract public List<AbstractFile> getChild();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
