import java.util.Scanner;

public class ebobEKOK {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2, ebob = 1, ekok = 1;
        System.out.print("İlk Sayı: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayı: ");
        n2 = input.nextInt();
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {

                ebob = i;


            }
        }
        for (int k = 1; k <= n1 * n2; k++) {
            if (k % n1 == 0 && k % n2== 0) {

                ekok = k;
                break;

            }

        }
        System.out.print("Ekok: " + ekok + "," + "Ebob: " + ebob);
    }
}
