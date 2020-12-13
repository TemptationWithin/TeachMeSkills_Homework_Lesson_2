import java.util.Scanner;

/*
    Программа, которая выводит название дня недели по введенному номеру.
 */
 class HomeWork_2_Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        switch (number){
            case (1) : {
                System.out.println("Понедельник");
                break;
            }
            case (2) : {
                System.out.println("Вторник");
                break;
            }
            case (3) : {
                System.out.println("Среда");
                break;
            }
            case (4) : {
                System.out.println("Четверг");
                break;
            }
            case (5) : {
                System.out.println("Пятница");
                break;
            }
            case (6) : {
                System.out.println("Суббота");
                break;
            }
            case (7) : {
                System.out.println("Воскресенье");
                break;
            }
            default:
                System.out.println("Такого дня недели не существует.");
        }
    }
}
