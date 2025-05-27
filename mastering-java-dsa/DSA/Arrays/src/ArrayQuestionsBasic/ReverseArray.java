package ArrayQuestionsBasic;

import java.util.Arrays;


public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3, 7, 5, 9, 2, 8};
        int[] arr1 = {13, 7, 8, 4, 12, 9, 6, 5, 1, 18};
        int k = 4;


        //Q1. reverse an array
        reverseArray(arr);  //reference is passed and returned so no need to ave the array
        System.out.println(Arrays.toString(arr));

        //Q2. reverse part of an array
        int s = 3, e = 8;
        reversePartOfArray(arr1, s, e);
        System.out.println(Arrays.toString(arr1));

        //Q3. right rotate an array k times
        rightRotateArray(arr, k);
        System.out.println(Arrays.toString(arr));
    }

    private static void rightRotateArray(int[] arr, int k) {
        //reverse entire array 0 - n-1
        int n = arr.length;
        reversePartOfArray(arr, 0, n-1);

        //reverse first part 0 - k-1
        reversePartOfArray(arr, 0, k-1);

        //reverse second p[art k - n-1
        reversePartOfArray(arr, k, n-1);
    }

    private static void reversePartOfArray(int[] arr, int s, int e) {
        int i = s, j = e;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++; j--;
        }
    }

    private static void reverseArray(int[] arr) {
        int i = 0, j = arr.length - 1;

        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++; j--;
        }
    }
}
