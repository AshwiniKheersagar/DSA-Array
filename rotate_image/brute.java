package rotate_image;

class brute {

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        int[][] ans=new int[arr.length][arr[0].length];

        int n=arr.length;

         for(int i=0;i<n;i++)
         {
            for(int j=0;j<n;j++)
            {
                ans[j][n-1-i]=arr[i][j];
            }
         }

         System.out.println("The matrix is :");
         for (int i = 0; i < ans.length; i++) 
         {
             for (int j = 0; j < ans[0].length; j++) 
             {
                 System.out.print(ans[i][j] + " ");
             }
             System.out.println();
         }
    }
    
}