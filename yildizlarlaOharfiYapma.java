import java.util.Scanner;

public class yildizlarlaOharfiYapma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k;
        System.out.print("Sayıyı Giriniz: ");
        k = input.nextInt();
        for(int i = 1; i<=k;i++){
            for(int m = 1;m<=(k-i);m++){
                System.out.print(" ");
            }
            for(int s = 1;s<=1;s++){
                System.out.print("*");
            }for(int e = 1;e<=i;e++){
                System.out.print("  ");
            }for(int g = 1;g<=1;g++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i =k-1;i>0;i--){
            for(int m = 1;m<=(k-i);m++){
            System.out.print(" ");
        }
            for(int s = 1;s<=1;s++){
                System.out.print("*");
            }for(int e = 1;e<=i;e++){
                System.out.print("  ");
            }for(int g = 1;g<=1;g++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
