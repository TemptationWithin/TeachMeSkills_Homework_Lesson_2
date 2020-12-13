/*
    Программа, которая выводит 10 первых чисел последовательности 0, -5, -10 ...
 */
public class HomeWork_2_Task4 {
    public static void main(String[] args) {
        int countNumbers = 0;
        for (int i = 0; i > -100; i=i-5) {
            if (countNumbers < 5) {
                System.out.println(i);
                countNumbers++;
            } else {
                break;
            }
        }
    }
}
