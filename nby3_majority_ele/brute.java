package nby3_majority_ele;

import java.util.ArrayList;
import java.util.List;

public class brute {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 3, 3, 2, 2, 2};
        int n = arr.length;

        List<Integer> ls = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (ls.contains(arr[i])) {
                continue; // Skip if already in the result list
            }

            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    cnt++;
                }
            }

            if (cnt > n / 3) {
                ls.add(arr[i]); // Add to the result list
            }

            if (ls.size() == 2) {
                break; // Exit if we already have two elements
            }
        }

        System.out.println("Elements appearing more than n/3 times: " + ls);
    }
}
