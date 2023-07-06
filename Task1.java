import java.util.*;

public class Task1{

    public static void main (String args[]) throws ArithmeticException{
        Scanner scan = new Scanner(System.in);
        System.out.println("Input num1: ");
        double num1 = scan.nextDouble();
        System.out.println("Input num2: ");
        double num2 = scan.nextDouble();

        try {
            divide(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }finally{
            scan.close();
        }
    }

    public static void divide(double num1, double num2)throws ArithmeticException {
        if(num2 == 0){
            throw new ArithmeticException ("Деление на ноль недопустимо");
        }
        System.out.println(num1/num2);
    }


}