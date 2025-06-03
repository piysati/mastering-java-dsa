package ArrayQuestionsBasic;

public class AtleastOneGreater {
    public static void main(String[] args) {
        int[] A = {1, 5, 7, 19, 23, 9, 81};
        int max = A[0];
        int count = 0;
        for(int a : A){
            if(a > max)
                max = a;
        }


        for(int a : A){
            if(a == max)
                count++;
        }

        int res = (A.length - count);
        System.out.println(res);
    }
}
