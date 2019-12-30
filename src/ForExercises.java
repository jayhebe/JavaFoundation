import java.util.Scanner;

public class ForExercises
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first positive integer: ");
        int m = scanner.nextInt();
        System.out.print("Please enter another positive integer: ");
        int n = scanner.nextInt();

        for (int gcd = Math.min(m, n); gcd >= 2 ; gcd--)
        {
            if (m % gcd == 0 && n % gcd == 0)
            {
                System.out.println("The greatest common divisor of " + m + " and " + n + " is " + gcd);
                break;
            }
        }

        for (int lcm = Math.max(m, n); lcm <= (m * n); lcm++)
        {
            if (lcm % m == 0 && lcm % n == 0)
            {
                System.out.println("The lowest common multiple of " + m + " and " + n + " is " + lcm);
                break;
            }
        }
    }
}
