import java.util.HashMap;
import java.util.Scanner;

public class Hashmap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count;
        char ch;
        HashMap<Character,Integer> h=new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            ch=s.charAt(i);
            if(h.containsKey(ch)){
                count=h.get(ch);
                count++;
                h.replace(ch,count);

            }
            else{
                h.put(ch,1);
            }

        }
        System.out.println(h);
//        for (Character key:h.keySet()) {
//            if(h.get(key)>2){
//                System.out.println(key);
//            }
//
//        }
        int k=Integer.MIN_VALUE;
    }
}
