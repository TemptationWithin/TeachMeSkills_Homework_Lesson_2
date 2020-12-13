/*
    Программа, которая выводит по введенному месяцу пору года.
 */

import java.util.Scanner;

public class HomeWork_2_Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        boolean monthExist = number > 0 && number < 13;
        if (monthExist) {
            if (number == 12 || number == 1 || number == 2) {
                System.out.println("Зима");
            }
            if (number == 3 || number == 4 || number == 5) {
                System.out.println("Весна");
            }
            if (number == 6 || number == 7 || number == 8) {
                System.out.println("Лето");
            }
            if (number == 9 || number == 10 || number == 11) {
                System.out.println("Осень");
            }
        } else {
            System.out.println("Такого месяца не сушествует");
        }
    }
}
