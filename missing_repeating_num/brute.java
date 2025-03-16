package missing_repeating_num;

public class brute {
    public static void main(String[] args) {
        int[] arr={4,3,6,2,1,1};
        int n=arr.length;

        int repeating=-1,missing=-1;

        for (int i = 1; i <= n; i++) 
        {
           int cnt=0;
           for(int j=0;j<n;j++)
           {
            if(arr[j]==i)
               cnt++;
           }

           if(cnt==2) repeating=i;
           else if(cnt==0) missing=i;

           if(repeating !=-1 && missing !=-1) break;
        }

        int[] ans={repeating,missing};
        
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
