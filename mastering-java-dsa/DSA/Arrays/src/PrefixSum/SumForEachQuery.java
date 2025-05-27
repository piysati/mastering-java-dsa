package PrefixSum;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumForEachQuery {
    /*
    Given an array of N integers and Q queries. For each query calculate the sum of elements in the range [L,R]
     */
    public static void main(String[] args) {
        int[] arr = {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};
                //  [-3, 3, 5, 9, 14, 16, 24, 15, 18, 19]
        int[][] Q = {
                {4, 8},
                {3, 7},
                {1, 3},
                {0, 4},
                {7, 7}
        };
        int[] sum = new int[Q.length];

        //find prefix sum as it will avaid multiple iteration while calculating the sum
        int[] psum = new int[arr.length];
        psum[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            psum[i] = psum[i-1] + arr[i];
        }

        for(int i = 0; i < Q.length; i++){
            int l = Q[i][0];
            int r = Q[i][1];

            if(l == 0) sum[i] = psum[r];
            else sum[i] = psum[r] - psum[l-1];
        }

        System.out.println(Arrays.toString(sum));
        System.out.println(Arrays.toString(psum));
    }
}
