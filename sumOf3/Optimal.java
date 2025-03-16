package sumOf3;

import java.util.*;

public class Optimal {
    public static void main(String[] args) {
        int[] arr={-2,-2,-2,-1,-1,-1,0,0,0,2,2,2,2};

        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
           if(i!=0 && arr[i]==arr[i-1])
           {
              continue;
           }
           int j=i+1;
           int k=arr.length-1;

           while (j<k) 
           {
              int sum=arr[i]+arr[j]+arr[k];
              if(sum<0)
              {
                j++;
              }
              else if(sum>0)
              {
                k--;
              }
              else
              {
                List<Integer> temp=Arrays.asList(arr[i],arr[j],arr[k]);
                ans.add(temp);
                j++;
                k--;
                while (j<k &&arr[j]==arr[j-1]) 
                {
                    j++;
                }

                while (j<k &&arr[k]==arr[k+1]) 
                {
                    k--;
                }

              }
           }
        }

        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
