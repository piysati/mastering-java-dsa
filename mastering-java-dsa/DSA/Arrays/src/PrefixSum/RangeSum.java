package PrefixSum;

public class RangeSum {
    public static void main(String[] args) {

    }

    public long[] rangeSum(int[] A, int[][] B) {
        int N = A.length;
        long[] psum = new long[N];
        psum[0] = A[0];


        for(int i = 1; i < A.length; i++){
            psum[i] = psum[i-1] + A[i];
        }


        long[] res = new long[B.length];


        for(int i  = 0; i < B.length; i++){
            int l = B[i][0];
            int r = B[i][1];


            if(l == 0) res[i] = psum[r];
            else res[i] = psum[r] - psum[l-1];
        }


        return res;
    }
}
