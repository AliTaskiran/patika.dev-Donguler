import java.util.Scanner;

public class maxminbulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç Tane Sayı Gireceksiniz ?: ");
        int sayi = input.nextInt(),sayi1,max=0,min=0;
        for(int i = 1; i <= sayi;i++){
            System.out.println(i+". Sayıyı Giriniz.");
            sayi1= input.nextInt();

            if(i==1){
                max=sayi1;
                min=sayi1;
            }
            if(sayi1<min){
                min=sayi1;
            }
            if(max<sayi1){
                max=sayi1;
            }
        }
        System.out.println("Maximum Sayı: "+max+" Minimum Sayı: "+min);
    }
}
