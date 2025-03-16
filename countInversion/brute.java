package countInversion;

public class brute {

    public static void main(String[] args) {
        int[] arr={5,3,2,4,1};

        int cnt=0;
        for (int i = 0; i < arr.length-1; i++) 
        {
            for (int j = i; j < arr.length; j++) 
            {
                if(arr[i]>arr[j])
                {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}