public class ForTest
{
    public static void main(String[] args)
    {
//        int sum = 0;
//        for (int i = 0; i <= 100; i++)
//        {
//            System.out.println(i);
//            sum += i;
//        }
//        System.out.println("Total: " + sum);
        for (int i = 1; i <= 150; i++)
        {
            System.out.print(i + " ");
            if (i % 3 == 0)
            {
                System.out.print("foo ");
            }
            if (i % 5 == 0)
            {
                System.out.print("biz ");
            }
            if (i % 7 == 0)
            {
                System.out.print("baz ");
            }
            System.out.println();
        }
    }
}
