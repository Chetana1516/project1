import java.util.LinkedHashSet;
import java.util.LinkedList;

public class likedlist1 {
    public static void main(String[] args) {
        LinkedHashSet<Integer> n = new LinkedHashSet<>();

        n.add(4);
        n.add(8);
        n.add(3);
        n.add(1);
        System.out.println(n);
        n.remove(3);  // it will remove the data
        System.out.println(n);

    }
}

