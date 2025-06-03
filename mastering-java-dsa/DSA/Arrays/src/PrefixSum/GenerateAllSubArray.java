package PrefixSum;

import java.util.ArrayList;
import java.util.Arrays;

public class GenerateAllSubArray {
    public static ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0; i < A.size(); i++){
            for(int j = i; j < A.size(); j++){
                //create subarray
                ArrayList<Integer> al = new ArrayList<>();
                for(int k = i; k <= j; k++){
                    al.add(A.get(k));
                }
                res.add(al);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 8, 9));
        solve( A);
    }

    //sub array in a range
    public int[] solve(int[] A, int B, int C) {
        int[] arr = new int[C-B+1];
        for(int i = B,  j = 0; i <= C; i++, j++){
            arr[j] = A[i];
        }
        return arr;
    }
}
