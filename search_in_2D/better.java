package search_in_2D;

public class better 
{
    static boolean binarySearch(int[] arr,int target)
    {
       
        int l=0,h=arr.length-1;

        while (l<=h) 
        {
            int mid=(l+h)/2;
            if(arr[mid]==target)
            {
                return true;
            }
            else if(arr[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                h=mid-1;
            }
        }
        return false;
    }

    static boolean search_in_2D(int[][] arr,int target)
    {
        int n=arr.length;
         int m=arr[0].length-1;

         for(int i=0;i<arr.length;i++)
         {
             if(arr[i][0]<=target && target<=arr[i][m])
             {
                return binarySearch(arr[i],target);
             }
         }
         return false;
    }
    public static void main(String[] args) 
    {
        int[][] arr={{3,4,7,9},{12,13,16,18},{20,21,23,29}};
        
         int target=23;
          
         boolean result=search_in_2D(arr, target);
         
         System.out.println(result);
    }
    
}
