package duplicate_number;

import java.util.*;

public class brute 
{
    public static void main(String[] args) 
    {
       int arr[]={2,5,9,6,9,3,8,9,7,1};
       Arrays.sort(arr);

       for(int i=0;i<arr.length-1;i++)
       {
            if(arr[i]==arr[i+1])
            {
                System.out.println("The duplicate is "+ arr[i]);
                break;
            }
       }
    }
}
