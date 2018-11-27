import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        //Guesser a = new Guesser(0, 1000);
        //a.start();

        Scanner sc = new Scanner(System.in);
        int answer1;
        int answer2;

        System.out.println("Enter the the lowest number of the interval: ");
        answer1 = sc.nextInt();

        System.out.println("Enter the highest number of the interval: ");
        answer2 = sc.nextInt();

        Guesser g = new Guesser(answer1, answer2);
        g.start();


    }
}
