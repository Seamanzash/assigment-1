import java.util.Scanner;

public class R_1_1 {
    public static  void inputAllBaseType(){
        Scanner scanner= new Scanner(System.in);

        System.out.println("enter an integer ");
        int intValue = scanner.nextInt();
        System.out.println("integer"+intValue);

        System.out.println("enter an double ");
        double dValue = scanner.nextDouble();
        System.out.println("double"+dValue);

        System.out.println("enter a character ");
        char cValue = scanner.next().charAt(0);
        System.out.println("char"+cValue);

        System.out.println("enter boolean value (true or false) ");
        boolean bValue = scanner.nextBoolean();
        System.out.println("boolean"+bValue);



    }

    public static void main(String[] args) {
        inputAllBaseType();
    }

}
