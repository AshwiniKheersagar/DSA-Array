package sort012;

import java.util.Arrays;

public class brute {
    public static void main(String[] args) {
        int arr[] = {0, 2, 1, 0, 2, 2, 0, 1};
        Arrays.sort(arr);
        
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
