public class Oppimple {
    public static class ram{
        public  void s(){
            System.out.println("hii i am ansister");
        }}
        public static class beem extends  ram{
            public void k(){
                System.out.println("hi a am parent");
            }
        }
        public static   class shaa extends  beem{
            public void y(){
                k();
                s();
                System.out.println("hi a am child");
            }
        }

    public static void main(String[] args) {
        shaa a=new shaa();
//        a.s();
//        a.k();
        a.y();

    }
}
