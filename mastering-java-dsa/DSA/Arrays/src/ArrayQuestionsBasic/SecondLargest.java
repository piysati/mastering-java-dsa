package ArrayQuestionsBasic;

public class SecondLargest {
    public static void main(String[] args) {
        int[] A = {1, 5, 7, 19, 23, 9, 81};
        int maxEl = A[0];
        int secondMax = -1; //this is very important


        for(int a : A){
            if(a > maxEl)
                maxEl = a;
        }


        for(int a : A){
            if(a > secondMax){
                if(a == maxEl)
                    continue;
                else
                    secondMax = a;
            }
        }


        System.out.println(secondMax);
    }
}
