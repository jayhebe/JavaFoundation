public class Narcissistic
{
    public static void main(String[] args)
    {
        for (int num = 100; num < 1000; num++)
        {
            int hundredsDigit = num / 100;
            int tensDigit = num % 100 / 10;
            int unitsDigit = num % 10;

            if (Math.pow(hundredsDigit, 3) + Math.pow(tensDigit, 3) + Math.pow(unitsDigit, 3) == num)
            {
                System.out.println(num);
            }
        }
    }
}
