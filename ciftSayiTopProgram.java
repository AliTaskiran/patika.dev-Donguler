import java.util.Scanner;

public class ciftSayiTopProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter The Number: ");
        int k = input.nextInt(),result=0;
        for(int i = 1; i<= k; i++){
            if(i%2==0){
                result+=i;
            }
        }
        System.out.println(result);
    }
}
