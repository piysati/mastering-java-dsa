package Concept;

import java.util.Scanner;

public class WhirlpoolTimer {
    /*
    Whirlpool Countdown Timer
    Design a timer for washing machine. When user sets a time, machine needs to show each minute passing until 0. WAP that takes an int A (time in minutes). And
    print each minute passing until 0.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("The timer for the machine is: ");
        int A = sc.nextInt();

        showTime(A);
    }

    private static void showTime(int a) {
        if(a == -1) return;
        System.out.println(a);
        showTime(a-1);
    }
}
