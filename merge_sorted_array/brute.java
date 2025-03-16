package merge_sorted_array;

public class brute {
    static void printSArray(int[] arr)
    {
        for (int i : arr) 
        {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr1={1,3,5,7};
        int[] arr2={0,2,6,8,9};

        int n=arr1.length+arr2.length;
        int[] ans=new int[n];

        int l=0;
        int r=0;
        int index=0;

        while (l<arr1.length && r<arr2.length) 
        {
            if(arr1[l]<=arr2[r])
            {
                ans[index]=arr1[l];
                index++;
                l++;
            }       
            else
            {
                ans[index]=arr2[r];
                index++;
                r++;
            }     
        }

        for(;l<arr1.length;l++)
        {
            ans[index++]=arr1[l];
        }

        for(;r<arr2.length;r++)
        {
            ans[index++]=arr2[r];
        }

        for (int i = 0; i < ans.length; i++) 
        {
            if (i<arr1.length) 
            {
                arr1[i]=ans[i];    
            }
            else
            {
                arr2[i-arr1.length]=ans[i];
            }
        }
        
        printSArray(arr1);
        System.out.println();
        printSArray(arr2);

    }
}
