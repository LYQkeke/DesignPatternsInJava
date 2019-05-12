package Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by KEKE on 2019/5/12
 */
public class MyCharactorFactory {

    private Map<Character, MyCharacter> map;

    public MyCharactorFactory(){
        map = new HashMap<>();
    }

    public MyCharacter get(Character character){
        MyCharacter myCharacter = map.get(character);
        if (myCharacter == null){
            myCharacter = new MyCharacter(character);
            map.put(character,myCharacter);
        }
        return myCharacter;
    }
}
