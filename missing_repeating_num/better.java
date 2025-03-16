package missing_repeating_num;

public class better {
    public static void main(String[] args) 
    {
        int[] arr={4,3,6,2,1,1};
        int n=arr.length;

        int[] hash=new int[n+1];

        for (int i = 0; i < n; i++) {
            hash[arr[i]]++;
        }

        int repeating=-1,missing=-1;

        for (int i = 1; i <= n; i++) 
        {
           if(hash[i]==2)
           {
              repeating=i;
           }
           else if(hash[i]==0)
           {
              missing=i;
           }

           if(repeating !=-1 && missing !=-1) break;
        }

        int[] ans={repeating,missing};
        
        for (int i : ans) {
            System.out.print(i + " ");
        }
    }
}
