import java.util.*;

public class Learnset {
    public static void main(String[] args) {
//        List<Integer> a=new ArrayList<>();
//        a.add(20);
//        a.add(45);
//        a.add(20);
//        a.add(23);
//        a.add(45);
//        a.add(20);
//        a.add(98);
//        a.add(89);
//        System.out.println(a);
//        Set<Integer> set=new HashSet<>();
//        Set<Integer> set=new LinkedHashSet<>();
        Set<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(90);
        set.add(34);
        set.add(98);
        set.add(35);
        set.add(23);
        System.out.println(set);
        System.out.println(set.remove(23));
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.size());
        System.out.println(set.contains(20));
        System.out.println(set.equals(23));

        //set.clear();
        System.out.println(set);
        for (Integer k:set) {
            System.out.print(k+" ");

        }
    }
}
/*
-->hashset and linkedhashset both are similar but  one difference is that linkedhashs set maintain the indexing in  a set  but hash set not maintian the indexixing it will
store  randomly
--> treeset also siminlar but it store the element in the sorted order as show in the above example..
 */
/*
 --->LIST                  ---->SET                  --->QUEUE
        ->ArratList           ->hashset                 ->Arrayqueue
        ->stack               ->LinkedHashset           ->LinkedLIst
        ->Likedlist           ->Treeset                 ->PriorityQueue.
 */