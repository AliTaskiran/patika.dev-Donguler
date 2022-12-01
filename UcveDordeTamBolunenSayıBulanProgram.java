import java.util.Scanner;

public class UcveDordeTamBolunenSayıBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k,sayac=0;
        double result=0;
        System.out.print("Sayı Giriniz: ");
        k = inp.nextInt();
        for (int i = 1 ; i <= k; i++) {
            if((i % 3 == 0)||(i % 4 == 0)){
                System.out.println(i);
                    result+=i;
                    sayac++;

            }


        }
        System.out.println(result/(sayac));
    }
}
