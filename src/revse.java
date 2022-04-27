import java.util.ArrayList;
import java.util.Stack;

public class revse {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
       int[] a={23,4,56,7,898,34};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int temp;
                if(a[j]>a[i]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }


            }
        for (int k = 0; k <a.length ; k++) {
            System.out.print(a[k]+" ");
        }
        }








    }

