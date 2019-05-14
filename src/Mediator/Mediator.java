package Mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KEKE on 2019/5/14
 */
public class Mediator {

    private List<Person> women;

    private List<Person> men;

    public Mediator() {
        women = new ArrayList<>();
        men = new ArrayList<>();
    }

    public void register(Person person){
        if (person instanceof Woman){
            women.add(person);
        }else {
            men.add(person);
        }
    }

    public void getPartner(Person person){
        List<Person> tempList;
        if (person instanceof Woman)
            tempList = men;
        else
            tempList = women;
        boolean find = false;
        for (Person p : tempList){
            if (p.getCondition()==person.getCondition()) {
                System.out.println(person.getName() + " & " + p.getName() + " 匹配");
                find = true;
            }
        }
        if (!find)
            System.out.println("未找到与 " + person.getName() +" 匹配的人");
    }
}
