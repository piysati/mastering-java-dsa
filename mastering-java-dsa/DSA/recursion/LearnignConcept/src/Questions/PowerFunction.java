package Questions;

public class PowerFunction {
    /*
    Given a and n. Find a^n using recursion
     */

    public static void main(String[] args) {
//        int a = 10, n = 5;

//        int res = findPower(a,n);
//        System.out.println(res);
        
        int a1 = 2, a2 = 9;
        int ans = findBigPower(a1, a2);
        System.out.println(ans);
    }

    private static int findBigPower(int a1, int a2) {
        if(a2 == 0) return 1;

        if(a2%2 == 0) return findBigPower(a1, a2/2) * findBigPower(a1, a2/2);
        else return a1 * findBigPower(a1, a2/2) * findBigPower(a1, a2/2);
    }

    //more optimised
    private static int findBigPowerMO(int a1, int a2) {
        if(a2 == 0) return 1;
        int p = findBigPower(a1, a2/2);
        if(a2%2 == 0) return p * p;
        else return a1 * p * p;
    }

    private static int findPower(int a, int n) {
        if(n == 0) return 1;
        return a * findPower(a, n-1);
    }

}
