import java.util.Scanner;

public class Lottery
{
    public static void main(String[] args)
    {
        int goldenNumber = (int)(Math.random() * 90 + 10);
        System.out.println("The golden number is " + goldenNumber);
        int goldenTensDigit = goldenNumber / 10;
        int goldenUnitsDigit = goldenNumber % 10;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a two-digits number: ");
        int guessNumber = scanner.nextInt();
        int guessTensDigit = guessNumber / 10;
        int guessUnitsDigit = guessNumber % 10;

        if (goldenNumber == guessNumber)
        {
            System.out.println("Congrats!!! You got $10000!!!");
        }
        else if (goldenTensDigit == guessUnitsDigit && goldenUnitsDigit == guessTensDigit)
        {
            System.out.println("Congrats!! You got $3000!!");
        }
        else if (goldenTensDigit == guessTensDigit || goldenUnitsDigit == guessUnitsDigit)
        {
            System.out.println("Congrats! You got $1000!");
        }
        else if (goldenTensDigit == guessUnitsDigit || goldenUnitsDigit == guessTensDigit)
        {
            System.out.println("Congrats, you got $500.");
        }
        else
        {
            System.out.println("Sorry, you are not the chosen one.");
        }
    }
}
