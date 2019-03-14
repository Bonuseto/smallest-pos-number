package main.java;

import static org.junit.Assert.assertArrayEquals;

public class MainTest {

    @org.junit.Test
    public void removeNegativeNumbers() {
        int[] input = {1, -1};
        int[] out = Main.removeNegativeNumbers(input);
        int[] exp = {1};

        assertArrayEquals(exp, out);
    }

   @org.junit.Test
    public void removeDuplicates() {
        int[] input = {1,1};
        int[] out = Main.removeDuplicates(input);
        int[] exp = {1,0};

        assertArrayEquals(exp, out);
    }

}