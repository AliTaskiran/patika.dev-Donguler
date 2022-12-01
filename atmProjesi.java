import java.util.Scanner;

public class atmProjesi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciadi, sifre;
        int sayac=3,select,balance=1500;
        System.out.println("X bankasına hoşgeldiniz!");
        System.out.println("Kullanıcı Adınız: ");
        kullaniciadi = input.nextLine();
        switch(kullaniciadi){
            case"patika":
            System.out.println("Kullanıcı Adınız sistemde kayıtlı.");
            break;
            default:
                System.out.println("Yanlış Kullanıcı Adı Girdiniz Tekrar Deneyiniz.");
                break;
        }
        if (!kullaniciadi.equals("patika")){
            System.exit(0);
        }



        System.out.println("Şifreniz: ");
        sifre = input.nextLine();


        switch(sifre){
            case "patika123":
                System.out.println("Tebrikler Başarıyla Giriş Yaptınız!");
                do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("Para miktarı : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz.");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                } while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            default:
                while (sayac!=0){
                    System.out.println("kalan hakkınız "+sayac+" Şifreniz Yanlış Lütfen Tekrar Deneyiniz.Şifreniz=");
                    sifre = input.nextLine();
                    switch (sifre){
                        case "Ali":
                            System.out.println("Tebrikler Başarıyla Giriş Yaptınız!");
                            break;
                        default:
                            sayac--;
                    }
                }
                System.out.println("Hesabınız Bloke Olmuştur Bankanızla İletişime Geçiniz.");
        }
    }
}
