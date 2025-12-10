import java.util.HashSet;  //random order
import java.util.Set;

public class set1 {
    public static void main(String[] args) {
        Set<Integer> n=new HashSet<>();
        n.add(4);
        n.add(8);
        n.add(3);
        n.add(1);
        System.out.println(n);
        n.remove(3);  // it will remove the data


        System.out.println( n.contains(8)); // it checks wheather its there r not
        n.iterator();   //to see the present list
        System.out.println(n);
        n.clear();
        System.out.println(n);
        System.out.println(n.isEmpty()); //it checks wheather its empty r not

    }

    }

