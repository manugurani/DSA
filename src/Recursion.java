import java.util.Scanner;

public class Recursion {
    public static void  rec( int n) {
        if (n == 1) {
            System.out.print(n);
            return ;
        }
        //System.out.print(n);
        rec(n - 1);
        System.out.print(" "+n);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        rec(n);

        }
    }

