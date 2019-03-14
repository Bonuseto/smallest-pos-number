package main.java;

import java.util.*;

public class Main {



    public static int[] removeNegativeNumbers(int[] num) {
        int[] output = new int[num.length];
        int k = 0;
        for(int i = 0; i < num.length; i++) {
            if(num[i] > 0) {
                output[k++] = num[i];
            }
        }
        return Arrays.copyOfRange(output, 0, k);
    }

    public static int[] removeDuplicates(int[] s){
        int result[] = new int[s.length], j=0;
        for (int i : s) {
            if(!isExists(result, i))
                result[j++] = i;
        }
        return result;
    }

    private static boolean isExists(int[] array, int value){
        for (int i : array) {
            if(i==value)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numArray = {1,1,4,0,-1,-6,10,50,2,45,90,3};
        System.out.println("Input: " + Arrays.toString(numArray));
        Arrays.sort(numArray);
        int[] arrayNoDup = removeDuplicates(numArray);
        System.out.println(Arrays.toString(arrayNoDup));
        int[] clearArray = removeNegativeNumbers(arrayNoDup);
        int compare = 1;

        for (int i = 0; i < clearArray.length; i++) {
            if (compare >= clearArray[i]){
                compare++;
            }
        }

        System.out.println("Output: " + compare);
    }

}
