import java.util.Scanner;
//Math.pow modunu aldın if eğer 10dan küçükse math pow alıp totale ekle değilse devamke
public class ArmstrongSayiBulma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number,sayac=0,value,result = 0;
        System.out.println("Bir sayı giriniz: ");
        number = input.nextInt();
        int tempnumber=number;
        while(tempnumber!=0){
            tempnumber/=10;
            sayac+=1;

        }
        tempnumber=number;
        while(tempnumber!=0){
            value= tempnumber%10;
            result+= (int) Math.pow(value,sayac);

            tempnumber/=10;
        }

        if(result==number){
            System.out.println(number+" Armstrong sayıdır");
        }else
            System.out.println(number+ " Armstrong sayı değildir.");
    }
}

