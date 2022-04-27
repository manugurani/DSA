import java.util.Scanner;

public class frequenceofCH {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s.toLowerCase();
        for(char i='a';i<'z';i++){
            int c=0;
            for (char j = 0; j <s.length() ; j++) {
                if (s.charAt(j) == i) {
                    c++;
                }


                System.out.println(i + "      " + j);
            }

        }
    }
}
