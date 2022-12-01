import java.util.Scanner;

public class TekSayıTopProgram1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, total = 0;
        System.out.println("Enter the number: ");
        number = input.nextInt();
        for(int i = 1 ; i<=number;i++){
            if(i%2==1){
                total+=i;
            }
        }
        System.out.println(total);
    }

}
