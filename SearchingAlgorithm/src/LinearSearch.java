public class LinearSearch {
    public static void main(String[] args) {
        int[] a={12,4,5,231,34,54,3,2};
        int target=2;
        int result=LinearSearch(a,target);
        System.out.println(result);

    }
    static int LinearSearch(int [] ar,int target){
        if(ar.length==0){
            return -1;
        }
        for (int i = 0; i < ar.length; i++) {
            if(ar[i]==target){
                return  i;
            }

        }
        return -1;
    }
}
