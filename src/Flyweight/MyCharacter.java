package Flyweight;

/**
 * Created by KEKE on 2019/5/12
 */
public class MyCharacter {

    private Character character;

    public MyCharacter(Character c){
        character = c;
    }

    public void display(){
        System.out.println(character);
    }
}
