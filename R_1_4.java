public class R_1_4 {
    public static void main(String[] args) {
        int num =10;
        System.out.println(isEven(num));

    }
    public static boolean isEven(int i){
        if ((i&1)==0){
            return  true;
        }
        return false;
    }
}
