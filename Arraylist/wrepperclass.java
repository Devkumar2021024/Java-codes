package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class wrepperclass {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            Integer num = sc.nextInt();
            int x = 5;
            Integer p= 90;
            p.toString();

            ArrayList<Integer> a = new ArrayList<>();
            a.add(p);
            a.add(x); // Happening due to autoboxing

             a.add(12);
            a.add(2);
            a.add(num);
            for(Integer print: a){  
             System.out.print(print + " ");
            }
System.err.println();
            a.remove(num);

            for(Integer print: a){  
             System.out.print(print + " ");
            }
        }
       

    }
}
