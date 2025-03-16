package merge_overlapping_subinterval;

import java.util.*;
public class brute 
{
    static List<List<Integer>> merge_overlapping_subinterval(int[][] arr)
    {
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        List<List<Integer>> mergedInterval =new ArrayList<>();

        int start=arr[0][0];
        int end=arr[0][1];

        for(int i=1;i<arr.length;i++)
        {
            if(arr[i][0]<=end)
            {
                end=Math.max(end, arr[i][1]);
            }
            else
            {
               mergedInterval.add(Arrays.asList(start,end));
               start=arr[i][0];
               end=arr[i][1];
            }
        }
        mergedInterval.add(Arrays.asList(start,end));
        return mergedInterval;
    }
    public static void main(String[] args) 
    {
        int[][] arr={{1,3},{2,4},{2,6},{8,9},{9,11},{8,10},{15,18},{16,17}};

        List<List<Integer>> ans = merge_overlapping_subinterval(arr);
        
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();
    }
}
