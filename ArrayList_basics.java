import java.util.ArrayList;
import java.util.Collections;
public class ArrayList_basics {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<Integer>();
        // Add elements
        list.add(0);
        list.add(9);
        list.add(10);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get elements== compulsory to put in another variable
        int element=list.get(3);
        System.out.println(element);

        //add elements in between 
        list.add(3,5);
        System.out.println(list);
        
        //set element-----already value ko change karna
        list.set(3,9);
        System.out.println(list);

        //delete element ----use .remove
        list.remove(3);
        System.out.println(list);

        //size -----compulsory to store in another varisble
       int size= list.size();
        System.out.println(size);

        //sorting --
        Collections.sort(list);
        System.out.println(list);

    }
}
