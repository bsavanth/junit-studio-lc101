package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BonusBinarySearch {

    int[] arr = new int[]{1, 2, 3, 4, 5};

    //TODO: add tests here
    @Test
    public void test1() {



        assertEquals(main.BonusBinarySearch.binarySearch(arr, 4), 3);
    }

    @Test
    public void test2() {

        assertEquals(main.BonusBinarySearch.binarySearch(arr, 2), 0);
    }

}
