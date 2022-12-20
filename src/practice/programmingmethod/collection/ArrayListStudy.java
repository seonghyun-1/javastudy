package programmingmethod.collection;

import java.util.ArrayList;
import java.util.List;

class Human {
    String name;
    String gender;
    int age;

    public Human(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

}

public class ArrayListStudy {
    public static void main(String[] args) {
        List<Human> human = new ArrayList<Human>();
        human.add(new Human("성현1","남",33));
        human.add(new Human("성현2","남",31));
        human.add(new Human("성현3","남",29));
        human.add(new Human("성현4","남",20));
        human.add(new Human("성현5","남",25));

        for(int i=0;i<human.size();i++){
            System.out.println(human.get(i).name);
        }

    }
}
