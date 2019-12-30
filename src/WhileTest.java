import java.util.Scanner;

public class WhileTest
{
    public static void main(String[] args)
    {
//        int i = 0;
//        while (i <= 100)
//        {
//            if (i % 2 == 0)
//            {
//                System.out.println(i);
//            }
//            i++;
//        }
        Scanner scanner = new Scanner(System.in);
        int countPositive = 0;
        int countNegative = 0;

        while (true)
        {
            System.out.print("Please enter an integer(0 to quit): ");
            int num = scanner.nextInt();
            if (num > 0)
            {
                countPositive++;
            }
            if (num < 0)
            {
                countNegative++;
            }
            if (num == 0)
            {
                break;
            }
        }

        System.out.println("Positive count: " + countPositive);
        System.out.println("Negative count: " + countNegative);
    }
}
