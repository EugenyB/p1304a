package main;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {

    public final static double EPS = 1e-9;

    Main main = new Main();

    @Test
    public void testMySin3() {
        double x = Math.PI/4;
        double expected = 1/Math.sqrt(2);
        double actual = main.mySin(x);
        assertEquals(actual, expected, EPS);
    }

    @Test
    public void testMySin1() {
        double x = Math.PI/6;
        double expected = 0.5;
        double actual = main.mySin(x);
        assertEquals(actual, expected, EPS);
    }

    @Test
    public void testMySin2() {
        double x = Math.PI/3;
        double expected = Math.sqrt(3)/2;
        double actual = main.mySin(x);
        assertEquals(actual, expected, EPS);
    }

    @Test
    public void testMyCos1() {
        double x = Math.PI/3;
        double expected = 0.5;
        double actual = main.myCos(x);
        assertEquals(actual, expected, EPS);
    }

    @Test
    public void testMyCos2() {
        double x = Math.PI/6;
        double expected = Math.sqrt(3)/2;
        double actual = main.myCos(x);
        assertEquals(actual, expected, EPS);
    }

    @Test
    public void testMyCos3() {
        double x = Math.PI/4;
        double expected = Math.sqrt(2)/2;
        double actual = main.myCos(x);
        assertEquals(actual, expected, EPS);
    }
}