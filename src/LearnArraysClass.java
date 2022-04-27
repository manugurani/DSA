import java.util.Arrays;

public class LearnArraysClass {
    public static void main(String[] args) {
        int[] m={23,45,6,7,834,78};
        Arrays.sort(m);
        Arrays.fill(m,9);
        for (int i:m) {
            System.out.print(i+" ");

        }

        System.out.println();
        int index=Arrays.binarySearch(m,78);
        System.out.println("The 78 is present in this index"+" "+index);

    }
}

/* Arrays class is very important..
it provide the various functionlality with respect to Arrays..
 */