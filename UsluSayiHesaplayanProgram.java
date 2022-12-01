import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, n,total= 1;
        System.out.print("Üssü Alıncak Sayı: ");
        k = input.nextInt();
        System.out.print("Üs: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            total *= k;

        }
        System.out.print("Cevap: "+ total);

    }
}
