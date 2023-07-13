public class RandomInt
{
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[1]);
        int n = Integer.parseInt(args[2]);
        if (m > n) {
            int temp = m;
            m = n;
            n = temp;
        }
        double r = Math.random();
        int result = (int) (r * n) + m;
        System.out.println(result);
    }
}