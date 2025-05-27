package PrefixSum;

public class SumEvenIndexed {
    /*
    Given an array A[N] and Q[start][end]. Print sum of all even indexed elements from start to end
     */
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 4, 5};
        int[][] Q = {
                {1, 3},
                {2, 5},
                {0, 4},
                {3, 3}
        };

        int[] sumEven = new int[Q.length];
        int[] sumOdd = new int[Q.length];

        int[] psumEven = new int[arr.length];
        int[] psumOdd = new int[arr.length];
        psumEven[0] = arr[0];
        psumOdd[0] = 0;//

        for(int i = 1; i < arr.length; i++){
            if(i%2 == 0){
                psumEven[i] = psumEven[i-1] + arr[i];
                psumOdd[i] = psumOdd[i-1];
            }
            else{
                psumEven[i] = psumEven[i-1];
                psumOdd[i] = psumOdd[i-1] + arr[i];
            }
        }

        for(int i = 0; i < Q.length; i++){
            int l = Q[i][0];
            int r = Q[i][1];

            if(l == 0) {
                sumEven[i] = psumEven[r];
                sumOdd[i] = psumOdd[r];
            }
            else {
                sumEven[i] = psumEven[r] - psumEven[l-1];
                sumOdd[i] = psumOdd[r] - psumOdd[l-1];
            }
        }


    }
}
