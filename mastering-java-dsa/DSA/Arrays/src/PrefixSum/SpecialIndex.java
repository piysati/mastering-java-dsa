package PrefixSum;

public class SpecialIndex {
    /* PYQ
    Google's Favourite
    Given an array A[] of size N. Find count of array indices such that removing an element from the array makes the sum of even and odd indexed elements equal.

     -> for each element check if sum is equal. After removing an element ith
     S_odd = S_odd(0 - i-1) + S_even(i+1 - n-1);
     S_even = S_even(0 - i-1) + S_odd(i+1 - n-1);
     */
    public static void main(String[] args) {
        int[] A = {4, 3, 2, 7, 6, -2};
        //{2, 1, 6, 4};
        //{4, 3, 2, 7, 6, -2}
        int n = A.length;
        int ans = 0;

        int[] evenSum = new int[n];
        int[] oddSum = new int[n];

        evenSum[0] = A[0];
        oddSum[0] = 0;//

        for(int i = 1; i < n; i++){
            if(i%2 == 0){
                evenSum[i] = evenSum[i-1] + A[i];
                oddSum[i] = oddSum[i-1];
            }
            else{
                evenSum[i] = evenSum[i-1];
                oddSum[i] = oddSum[i-1] + A[i];
            }
        }

        for(int i = 0; i < n; i++){
//            S_odd = S_odd(0 - i-1) + S_even(i+1 - n-1);
//            S_even = S_even(0 - i-1) + S_odd(i+1 - n-1);
            int so = query(oddSum, 0, i-1) + query(evenSum, i+1, n-1);
            int se = query(evenSum, 0, i-1) + query(oddSum, i+1, n-1);

            if(so == se) ans++;
        }
        System.out.println(ans);
    }

    public static int query(int[] arr, int s, int e){
        if(s>e) return 0;
        if(s == 0) return arr[e];
        return arr[e] - arr[s-1];
    }
}
