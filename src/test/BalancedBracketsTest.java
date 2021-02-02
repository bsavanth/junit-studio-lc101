package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {


    //TODO: add tests here


    @Test
    public void test1() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(true, BB.hasBalancedBrackets("[LaunchCode]"));

    }

    @Test
    public void test2() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(true, BB.hasBalancedBrackets("Launch[Code]"));

    }

    @Test
    public void test3() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(true, BB.hasBalancedBrackets("[]LaunchCode"));

    }

    @Test
    public void test4() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(true, BB.hasBalancedBrackets(""));

    }

    @Test
    public void test5() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(true, BB.hasBalancedBrackets("[[]]"));

    }

    @Test
    public void test6() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(false, BB.hasBalancedBrackets("[LaunchCode"));

    }

    @Test
    public void test7() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(false, BB.hasBalancedBrackets("Launch]Code["));

    }

    @Test
    public void test8() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(false, BB.hasBalancedBrackets("["));

    }

    @Test
    public void test9() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(false, BB.hasBalancedBrackets("]["));

    }

    @Test
    public void test10() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(false, BB.hasBalancedBrackets("][]["));

    }

    @Test
    public void test11() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(false, BB.hasBalancedBrackets("Launch]Code["));

    }


    @Test
    public void test12() {

        BalancedBrackets BB = new BalancedBrackets();

        assertEquals(true, BB.hasBalancedBrackets("[]"));

    }

}
