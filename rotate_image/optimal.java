 package rotate_image;

class optimal {

    static void rotate_image(int[][] arr){
        int N=arr.length;

        for(int i=0;i<N;i++)
        {
            for(int j=0;j<=i;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<N;i++)
        {
            int left=0;
            int right=N-1;

            while (left<right) 
            {
               int temp=arr[i][left];
               arr[i][left]=arr[i][right];
               arr[i][right]=temp;
               left++;
               right--;
            }
        }
    }
    public static void main(String[] args)
    {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};

        rotate_image(arr);

        System.out.println("The matrix is :");
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[0].length; j++) 
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}