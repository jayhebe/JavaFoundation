import java.util.Scanner;

public class DogAge
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the age of dog: ");
        int dogAge = scanner.nextInt();
        double humanAge = 0.0;

        if (dogAge < 0)
        {
            System.out.println("Please enter a positive number.");
        }
        else if (dogAge < 3)
        {
            humanAge = dogAge * 10.5;
        }
        else
        {
            humanAge = 2 * 10.5 + (dogAge - 2) * 4;
        }

        System.out.print("The human age is " + humanAge);
    }
}
