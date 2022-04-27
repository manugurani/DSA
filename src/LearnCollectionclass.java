import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LearnCollectionclass {
    public static void main(String[] args) {
        ArrayList<Integer> b=new ArrayList<>();
        b.add(20);
        b.add(30);
        b.add(40);
        b.add(20);
        b.add(50);
        b.add(90);
        b.add(20);
//        System.out.println(Collections.min(b));
//        System.out.println(Collections.max(b));
//        System.out.println(Collections.frequency(b,20));
        Collections.sort(b, Comparator.reverseOrder());
        System.out.println(b);
        }
}
