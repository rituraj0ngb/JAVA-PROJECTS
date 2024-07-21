import java.util.Random;
import java.util.Scanner;

public class ROCK_PAPER_SCISSOR {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int pcChoice = random.nextInt(3);

        System.out.println("Lets! Play Rock,Paper & Scissors with computer ");

        System.out.println("Enter");
        System.out.println("0 for Rook");
        System.out.println("1 for Paper");
        System.out.println("2 for Scissors");

        System.out.println("Enter your choice :");
        int userChoice = sc.nextInt();

        if(userChoice> 2 || userChoice <0 ){
            System.out.println("Invalid Choice");
        }
        else {
            if ((userChoice == 0 && pcChoice == 2) || (userChoice == 2 && pcChoice == 1) || (userChoice == 1 && pcChoice == 0))
                System.out.println("You win ");
            else if ((userChoice == 2 && pcChoice == 0) || (userChoice == 1 && pcChoice == 2) || (userChoice == 0 && pcChoice == 1))
                System.out.println("Computer  win ");
            else
                System.out.println("I was a Draw ");
        }
    }
}
