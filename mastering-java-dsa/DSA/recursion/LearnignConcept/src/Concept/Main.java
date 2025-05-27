package Concept;

public class Main {

    public static void main(String[] args) {
        //Q1. Find the sum of first N natural Nos
        int N = 10;
        System.out.println("Sum of " + N + " nos are : " + sum(N));

        //Q2. Find factorial of N numbers
        System.out.println("Factorial of " + N + " nos are : " + fact(N));

        //Q3. Print N nos in increasing order
        System.out.println("Printing nos in increasing order : ");
        increasingPrint(N);
    }

    public static int sum(int N){
        if(N == 0) return 0;
        return sum(N-1) + N;
    }

    public static int fact(int N){
        if(N == 1) return 1;
        return fact(N-1) * N;
    }

    public static void increasingPrint(int N){
        if(N == 0) return;

        increasingPrint(N-1);

        System.out.print(N + " ");
    }
}