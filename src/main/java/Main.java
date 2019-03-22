package main.java;

import java.util.Arrays;

public class Main {
    static int compare = 1 ;
    public static int[] removeOtiose(int[] s) {
        //Remove duplicates from array
        int[] result = new int[s.length];
        int j = 0;
        for (int i : s) {

            if (!isExists(result, i)) {
                result[j++] = i;
                if (0 < i) {

                    if (compare == i) {
                        compare++;
                    }
                }

            }
        }

        return result;
    }

    //Check for existing duplicates
    private static boolean isExists(int[] array, int value) {
        for (int i : array) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] numArray = {3,4,-1,1};
        Arrays.sort(numArray);
        removeOtiose(numArray);
        //System.out.println("Output: " + compare);

    }
}
