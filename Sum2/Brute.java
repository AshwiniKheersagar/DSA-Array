package Sum2;

import java.util.*;

public class Brute 
{
    public static void main(String[] args) {
        int[] arr={2,6,5,8,11};
        int target=10;
        int n=arr.length;

        List<Integer> ls=new ArrayList<>();
        for (int i = 0; i < n; i++) 
        {
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    ls.add(i);
                    ls.add(j);
                }
            }
        }
        System.out.println(ls);

    }
}
