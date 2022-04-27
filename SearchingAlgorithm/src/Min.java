public class Min {
    public static void main(String[] args) {
        int[] a={6,8,93,90};
        int min=a[0];
        int max=a[1];
        for (int i = 1; i <a.length ; i++) {
            if(a[i]<min){
                min=a[i];
            }
            else {
                if(a[i]>max)
                max=a[i];
            }

        }
        System.out.print(max+" "+min);
    }
}
