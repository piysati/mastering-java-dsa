package Questions;

public class Fibinacci {
    public static void main(String[] args) {
        int N = 10;

        System.out.println(fibonacci(N));
    }

    private static int fibonacci(int n) {
        if(n < 2) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
//        System.out.print(a + " ");
//        return a;
    }
}
