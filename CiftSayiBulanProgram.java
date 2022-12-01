import java.util.Scanner;

public class CiftSayiBulanProgram {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k;


            int i= 1;
            System.out.print("Bir Sayı Giriniz:");
            k = inp.nextInt();
        System.out.println("0");
        while (i <= k) {
            i ++;
            if (i % 2 == 0){
                System.out.println(i);

            }

        }



    }

}
