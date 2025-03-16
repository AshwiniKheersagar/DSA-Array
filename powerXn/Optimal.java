package powerXn;

public class Optimal {
    public static void main(String[] args) 
    {
        double x=2;
        int n=10;

        double ans=1.0;
        int nn=n;

        if(nn<0)
        {
            nn=-1*nn;
        }

        while (nn>0) 
        {
            if (nn%2==1) 
            {
                ans=ans*x;
                nn=nn-1;
            }
            else
            {
                x=x*x;
                nn=nn/2;
            }
        }

        if(n<0)
        {
            ans=1.0/ans;
            System.out.println(ans);
        }
        else
        {
            System.out.println(ans);
        }
    }
}
