package ArrayQuestionsBasic;

public class MinTimeToEqual {
    public static void main(String[] args) {
        int[] A = {1, 5, 7, 19, 23, 9, 81};

        int max = A[0];
        int sum = 0;
        for(int i = 0; i < A.length; i++){
            if(A[i] > max)
                max = A[i];
        }


        for(int a : A){
            sum += (max - a);
        }


        System.out.println(sum);
    }
}
