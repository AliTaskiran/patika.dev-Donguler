import java.util.Scanner;

public class basamakSayiTop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the a Number:");
        int number = input.nextInt();
        int result= 0;
        while(number!=0){
            int tempNumber= number%10;
            result+=tempNumber;
            number/=10;

        }
        System.out.println(result);
    }
}
