import java.util.*;

public class Collect {
    public static void main(String[] args) {
//        Queue<Integer> q=new LinkedList<>();
//        q.offer(10);
//        q.offer(20);
//        q.offer(30);
//        q.offer(40);
//        q.offer(50);
//        System.out.println(q);
//        System.out.println(q.peek());
//        q.poll();
//        System.out.println(q);
        //add,remove,peek,,,,,,,,
//        Integer[] a={-1,90,-12,1234,0,-45,987,-34,8945};
//       // Arrays.sort(a, Collections.reverseOrder());
//        Arrays.sort(a);
////        for (int i = 0; i <a.length ; i++) {
////            System.out.print(a[i]+" ");
////
////        }
//        System.out.println(Arrays.toString(a));
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < k / 2; i++) {
            if (k % i == 0) {
                flag = 1;

            }
        }
            if (flag == 0) {
                System.out.println(k +" "+"is a prime Number");
            } else {
                System.out.println(k +  " "+"is not  a prime number");
            }
        }
    }
