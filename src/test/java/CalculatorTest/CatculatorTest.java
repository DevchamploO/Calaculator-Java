package CalculatorTest;

import Calculator.Operations;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by tiffany on 3/4/17.
 */
public class CatculatorTest {

    @Test
    public void shouldAddNumbers() {
        Operations equate = new Operations();
        equate.equations(1, 2, 2);
            assertEquals(4.0, equate.getAnswer(), 0.01);
        equate.equations(1,-5, 4);
            assertEquals(-1.0, equate.getAnswer(), 0.01);
        equate.equations(1,6.4, 5.22);
            assertEquals(11.62, equate.getAnswer(), 0.01);
    }

    @Test
    public void shouldSubtractNumbers() {
        Operations equate = new Operations();
        equate.equations(2,5,2);
            assertEquals(3.0, equate.getAnswer(), 0.01);
        equate.equations(2,8, -2);
            assertEquals(10, equate.getAnswer(), 0.01);
        equate.equations(2,4.2, 7.4);
            assertEquals(-3.2, equate.getAnswer(), 0.01);
    }

    @Test
    public void shouldMultiplyNumbers() {
        Operations equate = new Operations();
        equate.equations(3,2, 5);
            assertEquals(10, equate.getAnswer(), 0.01);
        equate.equations(3,4, -8);
            assertEquals(-32, equate.getAnswer(), 0.01);
        equate.equations(3,0.3, 9.4);
            assertEquals(2.82, equate.getAnswer(), 0.01);
    }

    @Test
    public void shouldDivideNumbers() {
        Operations equate = new Operations();
        equate.equations(4,6, 2);
            assertEquals(3, equate.getAnswer(), 0.01);
        equate.equations(4,-10, 2);
            assertEquals(-5.0, equate.getAnswer(), 0.01);
        equate.equations(4,7, 3);
            assertEquals(2.33, equate.getAnswer(), 0.01);
    }

    @Test
    public void shouldSquareNumbers() {
        Operations equate = new Operations();
        equate.equations(5,5, 0);
            assertEquals(25, equate.getAnswer(), 0.01);
        equate.equations(5,-10, 0);
            assertEquals(100, equate.getAnswer(), 0.01);
        equate.equations(5,7.9, 0);
            assertEquals(62.41, equate.getAnswer(), 0.01);
    }

    @Test
    public void findSquareRoots() {
        Operations equate = new Operations();
        equate.equations(6,9, 0);
            assertEquals(3, equate.getAnswer(), 0.01);
        equate.equations(6,50, 0);
            assertEquals(7.0710678118654755, equate.getAnswer(), 0.01);
    }

    @Test
    public void findExponents() {
        Operations equate = new Operations();
        equate.equations(7,7, -2);
            assertEquals(0.02, equate.getAnswer(), 0.01);
        equate.equations(7, -16, 8);
            assertEquals(4.294967296E9, equate.getAnswer(), 0.01);
        equate.equations(7,3.4, 3);
            assertEquals(39.304, equate.getAnswer(), 0.01);
    }

    @Test
    public void shouldGetSine() {
        Operations equate = new Operations();
        equate.equations(8,40, 0);
            assertEquals(0.6427861, equate.getAnswer(), 0.01);
        equate.equations(8, -2, 8);
            assertEquals(-0.0348995, equate.getAnswer(), 0.01);
        equate.equations(8,3.4, 3);
            assertEquals(0.05930637, equate.getAnswer(), 0.01);
    }

    @Test
    public void shouldGetCosine() {
        Operations equate = new Operations();
        equate.equations(9,499, 0);
        assertEquals(-0.75470958, equate.getAnswer(), 0.01);
        equate.equations(9, 14, 0);
        assertEquals(0.97029573, equate.getAnswer(), 0.01);
        equate.equations(9,-1.5, 0);
        assertEquals(0.99965732, equate.getAnswer(), 0.01);
    }

    @Test
    public void shouldGetTangent() {
        Operations equate = new Operations();
        equate.equations(10,68, 0);
            assertEquals(2.47508685, equate.getAnswer(), 0.01);
        equate.equations(10, 9, 0);
            assertEquals(0.15838444, equate.getAnswer(), 0.01);
        equate.equations(10,-153, 0);
            assertEquals(0.50952545, equate.getAnswer(), 0.01);
    }

    @Test
    public void shouldGetInverseSine() {
        Operations equate = new Operations();
        equate.equations(11,0.065, 0);
            assertEquals(0.06504586, equate.getAnswer(), 0.01);
        equate.equations(11, 0.254, 0);
            assertEquals(0.25681365, equate.getAnswer(), 0.01);
        equate.equations(11,0.0274, 0);
            assertEquals(0.027403429629465934, equate.getAnswer(), 0.01);
    }

    @Test
    public void shouldGetInverseCosine() {
        Operations equate = new Operations();
        equate.equations(12,0.7071, 0);
            assertEquals(0.785407753397449, equate.getAnswer(), 0.01);

    }

    @Test
    public void shouldGetInvereseTangent() {
        Operations equate = new Operations();
        equate.equations(13,0.7071, 0);
        assertEquals(33.009033960380634, equate.getAnswer(), 0.01);

    }

    @Test
    public void shouldGetLog() {
        Operations equate = new Operations();
        equate.equations(14,60984.1, 0);
            assertEquals(11.018368453441132, equate.getAnswer(), 0.01);

    }

    @Test
    public void shouldGetInverseLog() {
        Operations equate = new Operations();
        equate.equations(15,5, 0);
        assertEquals(4.99999999999999, equate.getAnswer(), 0.01);

    }

    @Test
    public void FindFactorial() {
        Operations equate = new Operations();
        equate.equations(16,4, 0);
        assertEquals(24, equate.getAnswer(), 0.01);

    }
}
