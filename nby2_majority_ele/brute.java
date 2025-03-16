package nby2_majority_ele;

public class brute {

    public static void main(String[] args) 
    {
        int[] arr={2,2,3,3,1,2,2};
        int n=arr.length;
        for (int i = 0; i < n; i++) 
        {
            int cnt=0;
            for (int j = 0; j < n; j++) 
            {
                if(arr[j]==arr[i])
                {
                    cnt++;
                }
            }
            if (cnt>n/2) 
            {
                System.out.println("The majority element is: "+arr[i]);
                break;
            }
        }
    }
}
