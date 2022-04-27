import java.lang.reflect.Array;
import java.util.*;

public class NLE {
    public static void main(String[] args) {
        StringBuilder A=new StringBuilder();
        Stack<Integer> S=new Stack<>();
        int[] Arr={1,3,2,4};
        for (int i = Arr.length-1; i >=0 ; i--)
        //for(int i=0;i<Arr.length;i++)
        {
            if(S.empty()){
                A.append(-1);

            }
            if(S.size()>0 && S.peek()>Arr[i]){
                A.append(" ");
                A.append(S.peek());
            }
            if(S.size()>0 && S.peek()<=Arr[i]){
                while(S.size()>0 && S.peek()<=Arr[i]){
                    S.pop();
                }
                if(S.empty()){
                    A.append(" ");
                    A.append(-1);
                }
                else {
                    A.append(" ");
                    A.append(S.peek());
                }
            }
            S.push(Arr[i]);

        }
        System.out.print(A.reverse());

    }
}
