import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k,total= 1, i= 1;
        System.out.println("Faktoriyel hesaplaması için Bir Sayı Giriniz:");
        k = input.nextInt();

        while(i <=k){

            total *= i ;

            i ++;
        }
        System.out.println(k +". Faktoriyel: " + total );
    }
}
