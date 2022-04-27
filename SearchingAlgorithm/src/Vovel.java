import java.util.Scanner;

public class Vovel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String k=",";
        String k1=" ";
        String res=s.replaceAll("[a-z]",k);
        String res1=res.replaceAll("[!@#$%^&*;]",k);
        String res2=res1.replaceAll("[,]",k1);
        res2.trim();
       // String str3 = res2.replaceAll("\\s", ",");
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2.trim());
       //System.out.println(str3);




    }
}
//