package nby3_majority_ele;


public class optimal 
{
    public static void main(String[] args) 
    {
        int[] arr={2,2,3,3,1,2,2,3,3};
        int n=arr.length;

        int ele1 = -1,ele2=-1; // Initialize ele1 with a default value
        int cnt1=0,cnt2=0;

        for (int i = 0; i <n; i++) 
        {
            if(cnt1==0 && arr[i]!=ele2)
            {
                ele1=arr[i];
                cnt1++;
            }
           else if(cnt2==0 && arr[i]!=ele2)
            {
                ele2=arr[i];
                cnt2++;
            }
            else if(ele1==arr[i])
            {
                cnt1++;
            }
            else if(ele2==arr[i])
            {
                cnt2++;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
            
        }

        int cnt_1=0,cnt_2=0;
        for (int i = 0; i < n; i++) 
        {
           if(arr[i]==ele1)
           {
            cnt_1++;
           } 
           else if(arr[i]==ele2)
           {
            cnt_2++;
           }
        }
        if(cnt_1>=((n/3)+1) )
        {
            System.out.print("The majority element is: "+ele1+" ,");
        }
        if(cnt_2>=((n/3)+1) )
        {
            System.out.println(ele2);
        }
    }
}
