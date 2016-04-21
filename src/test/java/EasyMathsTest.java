/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author K00198581
 */
public class EasyMathsTest {

    public EasyMathsTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of equal method, of class EasyMaths.
     */
   

    /**
     * Test of scalarMultiplication method, of class EasyMaths.
     */
    @Test
    public void computeFactorial_Factorial5_Is120() {
        System.out.println("ComputeFactorial 5");
        assertEquals("120", UtilityClass.computeFactorial(5));
    }

    @Test(timeout = 1000)
    public void computeFactorial_ComputesFactorialOfRandomNo_CalculatesFactorialOrTimesOut() {

        System.out.println("ComputeFactorial with time out");
        final int factorialOf = 1 + (int) (30000 * Math.random());
        System.out.println("computing " + factorialOf + '!' + " =");
        System.out.println(UtilityClass.computeFactorial(factorialOf));
    }

}
