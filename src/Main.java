import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        char isContinueAnswer;
        boolean isContinue = true;
        int userNumber, guessNumber , score = 0;
        System.out.println("Our Guess Number Game is starting");
        System.out.println("Your Current Score is: " + score);
        while (isContinue) {
            guessNumber = rand.nextInt(100) + 1;
            System.out.println(guessNumber);
            System.out.println("Write your Guess: ");
            userNumber = sc.nextInt();
            if (guessNumber == userNumber)
            {
                System.out.println("Congratulations! You win!");
                System.out.println("Your Guess is: " + userNumber + "\tRandom Number is: " + guessNumber);
                score += 5;
            }
            else
            {
                System.out.println("Wrong Guess!");
                System.out.println("Your Guess is: " + userNumber + "\tRandom Number is: " + guessNumber);
            }
            System.out.println("Do you want to continue? (Y/N)");
            isContinueAnswer = sc.next().charAt(0);
            if (isContinueAnswer == 'Y' || isContinueAnswer == 'y')
            {
                isContinue = true;
                System.out.println("Okay the game is starting again! Good Luck!");
            }
            else if (isContinueAnswer == 'N' || isContinueAnswer == 'n')
            {
                isContinue = false;
                System.out.println("Your new score is: " + score);
            }
        }
    }
}