import java.util.Scanner;

public class ebobEKOK2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k,i,first=1 ,second=1,ebob = 1,tempfirst=0,ekok;
        System.out.print("İlk Sayı: ");
        k = input.nextInt();
        System.out.print("İkinci Sayı: ");
        i = input.nextInt();
        while(first<=k){
            first++;
            if(k % first == 0 && i % first == 0){
                ebob = first;
            }
        }
        first = tempfirst;
        while(first <= k*i){
            first++;
            if(first % k == 0 && first % i ==0){
                ekok = first;

                break;


            }
        }
        System.out.print("ekok: "+first+"ebob: "+ebob);



    }
}
