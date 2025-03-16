package missing_repeating_num;

public class optimal {
    public static void main(String[] args) 
    {
        int[] arr={4,3,6,2,1,1};
        int n=arr.length;
        
        int sN=n*(n+1)/2;
        int s2N=n*(n+1)*(2*(n)+1)/6;

        int s=0,s2=0;
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
            s2+=arr[i]*arr[i];
        }
         
        int val1=s-sN;
        int val2=s2-s2N;

        val2=val2/val1;

        int x=(val1+val2)/2;
        int y=x-val1;

        int[] ans={x,y};
        
        for (int i : ans) {
            System.out.print(i + " ");
        }


    }
}
