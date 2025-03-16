package set_matrix_zero;
public class Function {
    public static void printArray(int[][] arr) 
    {
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

    public static void printSArray(int[] arr)
    {
        System.out.println("The matrix is :");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
