package powerXn;

public class bruteNegative 
{
    public static void main(String[] args) 
    {
        int x=2,n=-10;
        double ans=1.0;

        int pow=Math.abs(n);

        for (int i = 0; i < pow; i++) 
        {
            ans=ans*x;
        }

        if(n<0)
        {
            ans=1.0/ans;
        }
        System.out.println(ans);
    }
}
