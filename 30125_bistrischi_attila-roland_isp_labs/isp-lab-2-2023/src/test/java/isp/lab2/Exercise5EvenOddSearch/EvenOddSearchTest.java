package isp.lab2.Exercise5EvenOddSearch;

import static org.junit.Assert.*;
import org.junit.Test;

public class EvenOddSearchTest {

    @Test
    public void testEvenOddSearch() {
        String input = "5,2,4,7,3,8,1,6";
        //largest even, index, smallest odd, index
        int[] expected = {8, 5, 1, 6};
        int[] actual = Exercise5EvenOddSearch.findEvenOdd(input);
        assertArrayEquals(expected, actual);
    }

    public void testEvenOddSearch2() {
        String input = "1,3,5,-7,9,11,3,7";
        //largest even, index, smallest odd, index
        int[] expected = {-1,-1,-7,3};
        int[] actual = Exercise5EvenOddSearch.findEvenOdd(input);
        assertArrayEquals(expected, actual);
    }

    public void testEvenOddSearch3() {
        String input = "2,2,10,8,6";
        //largest even, index, smallest odd, index
        int[] expected = {10,2,-1,-1};
        int[] actual = Exercise5EvenOddSearch.findEvenOdd(input);
        assertArrayEquals(expected, actual);
    }
}
