import java.util.Scanner;

public class Task2 {
    public static void main (String args[]) throws NumberFormatException{

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Введите ваш возраст: ");
            String userInput = sc.nextLine();
            int age = Integer.parseInt(userInput);
            if (age >= 0) {
                System.out.println("Ваш возраст: " + age);
                break;
            } else {
                System.out.println("Введите положительное число!");
            }
        }
        System.out.println();
        sc.close();
    }

}
