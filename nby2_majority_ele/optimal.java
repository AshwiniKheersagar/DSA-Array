package nby2_majority_ele;

public class optimal {
    public static void main(String[] args) 
    {
        int[] arr={2,2,3,3,1,2,2};
        int n=arr.length;

        int ele = -1; // Initialize ele with a default value
        int cnt=0;

        for (int i = 0; i <n; i++) 
        {
            if(cnt==0)
            {
                ele=arr[i];
                cnt++;
            }
            else if(ele==arr[i])
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }

        int cnt1=0;
        for (int i = 0; i < n; i++) 
        {
           if(arr[i]==ele)
           {
            cnt1++;
           } 
        }
        if(cnt1>(n/2))
        {
            System.out.println("The majority element is: "+ele);
        }
    }
}
