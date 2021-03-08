package test;

import main.BonusBinarySearch;
import org.junit.Test;
import static org.junit.Assert.*;

public class BonusBinarySearchTest {

    @Test
    public void Test1()
    {
        int[] testing = new int[]{2,4,5,7,8,9,10};
        assertEquals(-1,BonusBinarySearch.binarySearch(testing, 11));

    }

    @Test
    public void Test2()
    {
        int[] testing = new int[]{2,4,5,7,8,9,10};
        assertEquals(0,BonusBinarySearch.binarySearch(testing, 2));

    }

    @Test
    public void Test3()
    {
        int[] testing = new int[]{2,4,5,7,8,9,10};
        assertEquals(-1,BonusBinarySearch.binarySearch(testing, 0));

    }


}
