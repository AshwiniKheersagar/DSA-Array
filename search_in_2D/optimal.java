package search_in_2D;

public class optimal {
    
    static boolean binarySearch(int[][] arr,int target)
    {
        int n=arr.length;
        int m=arr[0].length;

        int l=0,h=n*m-1;

        while (l<=h) 
        {
            int mid=(l+h)/2;

            int row=mid/n,col=mid%n;

            if (arr[row][col]==target) 
            {
                return true;
            }
            else if(arr[row][col]>target)
            {
                h=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) 
    {
        int[][] arr={{3,4,7,9},{12,13,16,18},{20,21,23,29}};
        
        int target=23;

        System.out.println(binarySearch(arr, target));
    }
}
