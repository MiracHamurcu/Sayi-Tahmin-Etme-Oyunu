import java.util.Random; // random kutuphanesini ekledık
import java.util.Scanner; // scanner ile değer alacagız
public class Main {
    public static void main(String[] args) {
        char istiyor; // tekrar oynatmak veya oynatmamak için bir değer oluşturduk. bu değere göre döngü devam edecek.
        do {
            Random random = new Random(); // random nesnenmizi oluşturduk.
            Scanner scanner = new Scanner(System.in); // scanner nesneimizi oluşturduk.
            System.out.println("Sayı tahmin etme oyununa hoşgeldiniz.");
            System.out.println("Zorluk seçiniz: \n 1 : 1-10 arası sayılar \n 2 : 1-50 arası sayılar \n 3 : 1-100 arası sayılar");
            int secim = scanner.nextInt(); // secim değerine hangi zorlukta oynamak istediğini sorduk.
            if (secim == 1){
                kolayMod(random,scanner); // 1 i seçtiği zaman kolaymod metodumuz çalışacak. ve random ile scanner nesneleri gönderilecek.
            }
            else if (secim == 2){
                ortaMod(random,scanner); // 2 yi seçtiği zaman ordamod metodumuz çalışacak. ve random ile scanner nesneleri gönderilecek.
            }
            else if(secim == 3){
                zorMod(random,scanner); // 3 ü seçtiği zaman zormod metodumuz çalışacak. ve random ile scanner nesneleri gönderilecek.
            }
            else {
                System.out.println("Yanlış seçim yaptın lütfen 1-2-3 düzeyindeki modları seç."); // eğer seçim 1 2 3 değilse bir hata mesajı alacak.
            }
            System.out.println("Tekrar oynamak istiyor musunuz? : \n İstiyorsanız (E tuşuna basın)"); // tekrar oynamak isterse seçim yapacak
            istiyor = scanner.next().charAt(0); // oluşturduğumuz char değerini kullanıcıdan alıyoruz ve değere göre işlem yapacağız.
        }while(istiyor == 'E'); // eğer aldığımız değer E harfi ise döngü devam edecek eğer e dışında bir değer girerse döngü bitecek.
    }
    public static void kolayMod(Random random, Scanner scanner) // random ve scanner nesnelerini aldık
    {
        int randomnumber = random.nextInt(10) + 1; // 10 ile 1 arasında sayı üretecek ve bunu randomnumber' a atacak
        System.out.println("Kolay mod seçildi");
        System.out.println("Toplam 3 deneme hakkınız var.");
        int kalanhak = 0; // deneme hakkı için girdik toplam 3 hakkı olacak bu yüzden 0 dan başlatıık ve bu değer artacak.
        int kachakkaldi = 2; // kaç hakkının kaldığını göstermek için girdik.
        while(kalanhak <= 2) // eğer 2 ye kadar bir deneme yaparsa bu döngü bitecek
        {
            System.out.println("1-10 arasında tahmin yapın.");
            int tahmin = scanner.nextInt(); // kullanıcıdan int değerinde bir tahmin aldık

            if (tahmin == randomnumber){ // eğer tahmini doğruysa tebrik mesajı verilecek
                System.out.println("Sayıyı doğru buldunuz tebrikler.");
                kalanhak = 3; // döngü kapanacak
            } else if (kalanhak == 2) {
                System.out.println("Hakkınız bitti. Birdahaki sefere. \n Sayı:"+randomnumber);
                kalanhak = 3; // hakları bitecek ve döngü kapanacak
            } else {
                kalanhak++;
                System.out.println("Yanlış tahmin. Kalan hakkınız: "+ kachakkaldi--);
            // her yanlış tahmin yaptığında kaç hakkının kaldığını göstereceğiz ve kalanhak artacak bu sayede döngü devam edecek
            }
        }
    }
    public static void ortaMod(Random random, Scanner scanner){
        int randomnumber = random.nextInt(50) + 1;
        System.out.println("Orta düzey mod seçildi");
        System.out.println("Toplam 3 deneme hakkınız var.");
        int kalanhak = 0;
        int kachakkaldi = 2;
        while(kalanhak <= 2)
        {
            System.out.println("1-50 arasında tahmin yapın.");
            int tahmin = scanner.nextInt();

            if (tahmin == randomnumber){
                System.out.println("Sayıyı doğru buldunuz tebrikler.");
                kalanhak = 3;
            }
            else if (kalanhak == 2) {
                System.out.println("Hakkınız bitti. Birdahaki sefere. \n Sayı:" + randomnumber);
                kalanhak = 3;
            }
            else {
                kalanhak++;
                System.out.println("Yanlış tahmin. Kalan hakkınız: "+ kachakkaldi--);
            }
        }
    }
    public static void zorMod(Random random, Scanner scanner){
        int randomnumber = random.nextInt(100) + 1;
        System.out.println("Zor mod seçildi");
        System.out.println("Toplam 3 deneme hakkınız var.");
        int kalanhak = 0;
        int kachakkaldi = 2;
        while(kalanhak <=2)
        {
            System.out.println("1-100 arasında tahmin yapın.");
            int tahmin = scanner.nextInt();

            if (tahmin == randomnumber){
                System.out.println("Sayıyı doğru buldunuz tebrikler.");
                kalanhak = 3;
            }
            else if (kalanhak == 2) {
                System.out.println("Hakkınız bitti. Birdahaki sefere. \n Sayı:" + randomnumber);
                kalanhak = 3;
            }
            else {
                kalanhak++;
                System.out.println("Yanlış tahmin. Kalan hakkınız: "+ kachakkaldi--);
            }
        }
    }
}