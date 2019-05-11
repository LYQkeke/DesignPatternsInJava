package Prototype;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by KEKE on 2019/5/11
 */
public class Person implements Cloneable {

    private String name;

    private List<String> friends;

    public Person(){
        name = "乔可可";
//        Arrays asList 方法返回的是一个不可变 List
//        friends = Arrays.asList("Pony Ma","Jack Ma");
        friends = new ArrayList<>();
        friends.add("Pony Ma");
        friends.add("Jack Ma");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Person clone(){
        try {
            Person p = (Person) super.clone();
            p.setFriends(new ArrayList<>(p.friends));
            return p;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String toString() {
        return "{ name: "+this.name+", friends: " + friends + " }";
    }
}
