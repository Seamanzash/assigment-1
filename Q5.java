import java.util.Scanner;

public class Q5 {
    static  String Element[]={"seaman","aya"};

    public static void main(String[]args){
      disPlayDetails(Element);
      input(Element);
      disPlayDetails(Element);

    }
    public static void disPlayDetails(String x[]){
        for (String s:x)
            System.out.println(s);
    }
    public static void input(String x[]){
        Scanner s = new Scanner(System.in);
        System.out.println("add 5 num");
        for (int i = 0; i < x.length; i++) {
            x[i] = s.next();
        }
    }
}
