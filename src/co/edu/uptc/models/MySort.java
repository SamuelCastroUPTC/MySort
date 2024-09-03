package co.edu.uptc.models;

import java.util.Comparator;
import java.util.List;

public class MySort {

    public void sort(List<Person> list, Comparator comparator) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if (comparator.compare(list.get(i),list.get(j))<0) {
                    Person aux = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, aux);
                    
                }   
            }
        }
    }
}
