import java.util.ArrayList;
import java.util.Collection;

import co.edu.uptc.models.ComparatorPerson;
import co.edu.uptc.models.MySort;
import co.edu.uptc.models.Person;
import co.edu.uptc.utils.SimpleList;

public class App {
    public static void main(String[] args) throws Exception {
        
        SimpleList<Person> list =new SimpleList<Person>();
        Person p1 = new Person();
        p1.setName("Yaider");
        p1.setLastName("Becerra");
        p1.setAge(20);
        list.add(p1);
        Person p2 = new Person();
        p2.setName("Ian");
        p2.setLastName("Martinez");
        p2.setAge(30);
        list.add(p2);
        Person p3 = new Person();
        p3.setName("Manuel");
        p3.setLastName("Cruz");
        p3.setAge(25);
        list.add(p3);
        MySort mySort = new MySort();
        mySort.sort(list, ComparatorPerson.compName);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }
    }
}
