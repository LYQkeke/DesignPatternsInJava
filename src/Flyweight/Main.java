package Flyweight;

/**
 * Created by KEKE on 2019/5/12
 */
public class Main {

    public static void main(String[] args) {

        MyCharactorFactory factory = new MyCharactorFactory();
        MyCharacter character1 =  factory.get('a');
        MyCharacter character2 =  factory.get('a');
        MyCharacter character3 =  factory.get('b');
        MyCharacter character4 =  factory.get('b');
        character1.display();
        character2.display();
        character3.display();
        character4.display();
        System.out.println(character1==character2);
        System.out.println(character1==character3);
        System.out.println(character3==character4);
    }
}
