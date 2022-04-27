import java.util.Scanner;

public class SearchinRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]={12,34,56,7,8,98,80,67};
        int start=sc.nextInt();
        int end=sc.nextInt();
        int target=sc.nextInt();
        int result=searchrange(a,start,end,target);
        System.out.println(result);
    }
    static int searchrange(int[] a,int s,int e,int t){
        if(a.length==0){
            return -1;
        }
        for (int i = s; i <e ; i++) {
            if(a[i]==t){
                return i;
            }

        }
        return -1;
    }

}
