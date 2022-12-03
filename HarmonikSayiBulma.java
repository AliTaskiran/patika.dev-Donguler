import java.util.Scanner;

public class HarmonikSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        double total = 0,numb;
        System.out.print("Sayıyı Giriniz: ");
        number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            numb = (1.0 / i);
            total += numb;


        }
        System.out.println(total);
    }
}
