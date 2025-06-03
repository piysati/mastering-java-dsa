package PrefixSum;

public class EquilibriumIndex {
    /*
    sum of elements at lower indexes is equal to the sum of elements at higher indexes
     */
    public static void main(String[] args) {
        int[] A = {1, 5, 7, 19, 23, 9, 81};
        int ans = solve(A);

        System.out.println(ans);
    }

    public static int solve(int[] A) {
        int N = A.length;


        int[] psum = new int[N];
        int[] ssum = new int[N];


        psum[0] = A[0];
        ssum[N-1] = A[N-1];


        for(int i = 1; i < N; i++){
            psum[i] = psum[i-1] + A[i];
        }


        for(int i = N-2; i >= 0; i--){
            ssum[i] = ssum[i+1] + A[i];
        }


        if(N == 1) return 0;


        for(int i = 0; i < N; i++){
            if(i == 0){
                if(ssum[1] == 0)
                    return i;
            }
            else if(i == N-1){
                if(psum[N-2] == 0)
                    return i;
            }
            else{
                if(psum[i-1] == ssum[i+1])
                    return i;
            }
        }
        return -1;
    }
}
