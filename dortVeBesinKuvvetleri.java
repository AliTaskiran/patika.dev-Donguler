import java.util.Scanner;

public class dortVeBesinKuvvetleri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the a number: ");
        int number = input.nextInt();
        for(int i = 1; i <= number;i++){
            if(i%4==0||i%5==0){
                System.out.print(i+" ");
            }
        }
    }
}
