package search_in_2D;

public class brute {

    public static void main(String[] args) 
    {
        int[][] arr={{3,4,7,9},{12,13,16,18},{20,21,23,29}};
        
        int target=23;

        for (int i = 0; i < arr.length; i++) 
        {
             for (int j = 0; j < arr[0].length; j++) 
             {
                if(arr[i][j]==target)
                {
                    System.out.println("true");
                    break;
                }
             }
        }
    }
}