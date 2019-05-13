package Composite;

import java.util.List;

/**
 * Created by KEKE on 2019/5/13
 */
public class Main {

    public static void main(String[] args) {
        Folder rootFolder = new Folder("C:");
        Folder folder1 = new Folder("folder1/");
        rootFolder.add(folder1);
        folder1.add(new File("file.abc"));
        folder1.add(new File("file.doc"));
        folder1.add(new File("file.exe"));
        rootFolder.add(new File("file.txt"));
        displayTree(rootFolder,0);

    }

    private static void displayTree(AbstractFile folder,int deep){
        for (int i = 0; i < deep; i++) {
            System.out.print("---");
        }
        folder.display();
        List<AbstractFile> files = folder.getChild();
        for (AbstractFile file : files){
            if (file instanceof File){
                for (int i = 0; i < deep+1; i++) {
                    System.out.print("---");
                }
                file.display();
            }else
                displayTree(file,deep+1);
        }
    }
}
