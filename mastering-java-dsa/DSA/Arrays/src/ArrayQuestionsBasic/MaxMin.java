package ArrayQuestionsBasic;

public class MaxMin {
    //find max and min in aan array
    public static void main(String[] args) {
            int[] A = {1,2,99,80,-5};
            int max = A[0], min = A[0];


            for(int a : A){
                if(a > max)
                    max = a;


                if(a < min)
                    min = a;
            }


        System.out.println(max + " " + min);

    }
}
