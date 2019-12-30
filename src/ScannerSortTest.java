import java.util.Scanner;

public class ScannerSortTest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number: ");
        int firstNum = scanner.nextInt();
        System.out.print("Please enter the second number: ");
        int secondNum = scanner.nextInt();
        System.out.print("Please enter the third number: ");
        int thirdNum = scanner.nextInt();

        if (firstNum > secondNum)
        {
            if (thirdNum > firstNum)
            {
                System.out.println(secondNum + ", " + firstNum + ", " + thirdNum);
            }
            else if (thirdNum < secondNum)
            {
                System.out.println(thirdNum + ", " + secondNum + ", " + firstNum);
            }
            else
            {
                System.out.println(secondNum + ", " + thirdNum + ", " + firstNum);
            }
        }
        else
        {
            if (thirdNum > secondNum)
            {
                System.out.println(firstNum + ", " + secondNum + ", " + thirdNum);
            }
            else if (thirdNum < firstNum)
            {
                System.out.println(thirdNum + ", " + firstNum + ", " + secondNum);
            }
            else
            {
                System.out.println(firstNum + ", " + thirdNum + ", " + secondNum);
            }
        }
    }
}
