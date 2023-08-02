package Arraylist;

import java.util.ArrayList;

public class arrlist1 {
    public static void main(String[] args) {
        // declaration with defining initial capacity
        ArrayList<Integer> name = new  ArrayList<>(12);
        name.add(69);
        name.add(909);
        name.add(67896);
        name.add(89);
        name.add(2,45);

        name.set(0, 12);

        System.out.println(name.get(0));
        // print elements
        for(Integer print: name){
            System.out.print(print + " ");
        }
    }
}
