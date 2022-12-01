import java.util.Scanner;

public class mukemmelSayiBulanProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz: ");
        int number = input.nextInt(),total=0;
        for(int i = 1;i<= number;i++){
            if(number%i==0){
                total+=i;
            }
        }
        total-=number;
        if(number==total){
            System.out.println(number+" Mükemmel Sayıdır.");
        }else
            System.out.println(number+" Mükemmel Sayı Değildir.");
    }
}
