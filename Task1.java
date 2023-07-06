
// Простая задача 2: Обработка некорректного ввода

// Напишите программу, которая запрашивает у пользователя его возраст. Если введенное значение 
// не является числом, выбросите исключение NumberFormatException с сообщением "Некорректный ввод". Иначе выведите возраст на экран.

// По желанию*
// Сложная задача: Чтение файла и подсчет суммы чисел

// Напишите программу, которая считывает содержимое текстового файла, в котором каждая 
// строка содержит одно число. Программа должна подсчитать сумму всех чисел в файле. Если встретится строка, которая не
//  может быть преобразована в число, выбросите исключение NumberFormatException с сообщением "Некорректное значение числа в файле".

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