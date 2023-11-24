public class R_1_6 {
   public static int sum(int x){
       int s=0;
       for (int i=1;i<=x;i+=2){
           s +=i;
       }
       return s;
   }

    public static void main(String[] args) {
        int number=10;
        System.out.println(sum(number));
    }
}
