import java.util.Scanner;

public class ScannerTest
{
    public static void main(String[] args)
    {
        System.out.print("Please enter your score: ");
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if (score == 100)
        {
            System.out.println("You get a new BMW.");
        }
        else if (score > 80 && score <= 99)
        {
            System.out.println("You get a new iPhone 11 Pro Max.");
        }
        else if (score >= 60 && score <= 80)
        {
            System.out.println("You get a new iPad.");
        }
        else
        {
            System.out.println("You get nothing.");
        }
    }
}
