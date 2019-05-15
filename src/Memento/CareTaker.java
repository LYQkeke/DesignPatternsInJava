package Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KEKE on 2019/5/15
 */
public class CareTaker {

    private List<PersonMemento> list;

    public CareTaker() {
        this.list = new ArrayList<>();
    }

   public int add(PersonMemento memento){
        list.add(memento);
        return list.size()-1;
   }

   public PersonMemento get(int index){
       return list.get(index);
   }

}
