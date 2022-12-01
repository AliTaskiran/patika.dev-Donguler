import java.util.Scanner;

public class KombinasyonProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, r,nfak = 1 ,rfak = 1 ,nekrfak=1;
        System.out.print("n değeri: ");
        n = input.nextInt();
        System.out.print("r değeri: ");
        r = input.nextInt();
        for (int i = 1; i <= n; i++){
            nfak *= i;

        }for (int a = 1; a <= r; a++){
            rfak *= a;

        }for (int b = 1; b <= (n-r); b++){
            nekrfak *= b;

        }
        double sonuc = nfak/(rfak*nekrfak);
        System.out.print("Cevap: "+ (int)sonuc);


    }
}
