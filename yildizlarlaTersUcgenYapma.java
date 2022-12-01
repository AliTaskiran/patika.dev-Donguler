import java.util.Scanner;

public class yildizlarlaTersUcgenYapma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        for(int i = k ;i>0;i--){
            for(int s = 1;s<=k-i;s++){
                System.out.print(" ");
            }for(int j = 1; j<= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
