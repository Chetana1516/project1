import java.util.Set;
import java.util.TreeSet;

public class treeset1 {

    public static void main(String[] args) {
        TreeSet<Integer> n = new TreeSet<>();
        n.add(9);
        n.add(8);
        n.add(3);
        n.add(1);
        System.out.println(n);
        n.remove(3);  // it will remove the data
        System.out.println(n);
        System.out.println(n.first());  // it give first number  data
        System.out.println(n.last());   // it gives the last number data
        System.out.println(n);
        System.out.println(n.ceiling(6));  // celling is used to chect the greater thn r equal number v shd take random no so tht it checks
        System.out.println(n.floor(5)); // floor is used to check the lesser thn are equal to  tht random no
        System.out.println(n);
        System.out.println(n.higher(2));  // hightest no to find
        System.out.println(n);
        System.out.println(n.lower(2));  // lowest no to find





    }
}
