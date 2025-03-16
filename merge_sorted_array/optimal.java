package merge_sorted_array;

import java.util.Arrays;

public class optimal 
{
    static void swap(int[] arr1,int[] arr2,int i,int j){
        int temp=arr1[i];
        arr1[i]=arr2[j];
        arr2[j]=temp;
     }

     static void printSArray(int[] arr)
    {
        for (int i : arr) 
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) 
    {
        int[] arr1={1,3,5,7};
        int[] arr2={0,2,6,8,9};

        int l=arr1.length-1;
        int r=0;

        while (l>=0 && r<arr2.length) 
        {
            if(arr1[l]>arr2[r])
            {
               swap(arr1,arr2, l, r);
               l--;
               r++;
            }
            else
            {
                break;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        printSArray(arr1);
        System.out.println();
        printSArray(arr2);
    }
}
