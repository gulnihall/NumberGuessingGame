package Game;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
//         Oyuncudan 1 ile 100 arasında bir sayı tahmini alarak rastgele bir sayıyı bulmaya çalışması istenir.
//        Oyuncuya her tahminde doğru sayıya yaklaşıp yaklaşmadığına dair ipuçları verilir ve oyuncuya 10 tahmin hakkı
//        tanınır.
//
//        -Oyuncuya "1-100 arası bir sayı tahmini giriniz" mesajı gösterilir.
//        -Oyuncu bir sayı girişi yapar.
//        -Oyuncunun tahmini, rastgele seçilen sayıya göre kontrol edilir:
//        -Tahmin doğru ise, "Tebrikler, X. tahminde sayıyı buldunuz!" mesajı gösterilir.
//        Ardından oyuncunun puanı hesaplanır ve "Puanınız: X" mesajı gösterilir (puan = kalan tekrar hakkı *10)ve
//        "Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın." mesajı gösterilir.
//        -Tahmin, sayıdan küçük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha büyük bir sayı giriniz:"
//        mesajı gösterilir.
//        -Tahmin, sayıdan büyük ise, "Bilemediniz, tahmin için X hakkınız kaldı! Daha küçük bir sayı giriniz:"
//        mesajı gösterilir.
//        -Oyuncuya 10 tahmin hakkı verilir.Oyuncu 10 tahmin hakkını da kullanırsa,
//        "Hakkınız bitti, oyunu kaybettiniz. Tekrar oynamak için 1'e, çıkmak için herhangi bir sayıya basın."
//        mesajı gösterilir.
//        -Oyuncu 1 'e basarsa, oyun yeniden başlatılır ve yeni bir rastgele sayı seçilir.
//                - Oyuncu herhangi bir sayıya basarsa, oyun sona erer ve program sonlanır.

        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int target = random.nextInt(100) + 1;
        int counter = 10;
        int guess;
        int playAgain;
        System.out.println("Please,enter a number between 1 and 100");

        do {
            guess = scan.nextInt();
            counter--;

            if (target == guess) {
                System.out.println("Congratulations! " + "You knew in the " +(10-counter) +"th attempt. Your score is " + (counter*10 )+"\n" +"If you want to play,please enter '1'. If you want to exit, please enter any number.");
                playAgain=scan.nextInt();

                if (playAgain == 1){
                    System.out.println("You continue the game.Please,enter a number between 1 and 100");
                    counter=10;

                }else {
                    break;
                }
            } else if (guess < target) {

                System.out.println("You don't know!\nYour remaining rights:" +counter+ " Please increase your number");

            } else if (guess > target) {

                System.out.println("You don't know!\nYour remaining rights:" +counter+ " Please decrease your number");

            } else if (counter == 0) {

                System.out.println("You lost the game... If you want to play please enter '1'. If you want to exit, please enter any number");

                playAgain = scan.nextInt();
                if (playAgain == 1){
                    System.out.println("You continue the game.Please,enter a number between 1 and 100");
                    counter=10;
                }else {
                    break;
                }
            }

        }while(true);
    }
}
