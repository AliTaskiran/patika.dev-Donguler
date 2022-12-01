import java.util.Scanner;

public class ikininKuvvetleri {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int k;
        System.out.print("Sayıyıgir");
        k = inp.nextInt();
        for(int i = 1; i<=k;i*=4){

            System.out.println("4ün kuvvetleri: "+i);
        }
        for(int i = 1; i<=k;i*=5){

            System.out.println("5in kuvvetleri: "+i);
        }

    }
}
