package main.java;

import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.assertArrayEquals;

public class MainTest {

    private Main main;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before MainTest.class");
    }

    @AfterClass
    public  static void afterClass() {
        System.out.println("After MainTest.class");
    }




    @org.junit.Test
    public void removeNegativeNumbers() {
        int[] input = {1, -1};
        int[] out = Main.removeNegativeNumbers(input);
        int[] exp = {1};

        assertArrayEquals(exp, out);
    }

    @org.junit.Test
    public void removeDuplicates() {



    }

    @org.junit.Test
    public void main() {
    }
}