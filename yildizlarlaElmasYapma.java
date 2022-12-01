import java.util.Scanner;

public class yildizlarlaElmasYapma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k, tempK;
        System.out.print("Bir Sayı Giriniz");
        k = input.nextInt();
        tempK = k;
        for (int i = 1; i <= tempK; i++) {
            for (int f = 1; f <= tempK - i; f++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");

            }

            System.out.println();
        }
        for(int i = k -1;i>0;i--){
            for(int s = 1;s<=k-i;s++){
                System.out.print(" ");
            }for(int j = 1; j<= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
