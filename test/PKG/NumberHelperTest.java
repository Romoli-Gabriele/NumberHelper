/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PKG;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author informatica
 */
public class NumberHelperTest {
    
    public NumberHelperTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEvenF() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = false;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of isEven method, of class NumberHelper.
     */
    @Test
    public void testIsEvenT() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
@Test
    public void testIsEven0() {
        System.out.println("isEven");
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = true;
        boolean result = instance.isEven();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOdd0() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(0);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("Errore, impossibie divdere per 0");
    }

    /**
     * Test of isOdd method, of class NumberHelper.
     */
    @Test
    public void testIsOddF() {
        System.out.println("isOdd");
        NumberHelper instance = new NumberHelper(6);
        boolean expResult = false;
        boolean result = instance.isOdd();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of sum method, of class NumberHelper.
     */
    @Test
    public void testSum() {
        System.out.println("sum");
        int n = 1;
        NumberHelper instance = new NumberHelper(2);
        int expResult = 3;
        int result = instance.sum(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrimeT() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(7);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrimeF() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(8);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime2() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(-3);
        boolean expResult = false;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    /**
     * Test of isPrime method, of class NumberHelper.
     */
    @Test
    public void testIsPrime3() {
        System.out.println("isPrime");
        NumberHelper instance = new NumberHelper(3);
        boolean expResult = true;
        boolean result = instance.isPrime();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleByT() {
        System.out.println("isDivisibleBy");
        int n = 2;
        NumberHelper instance = new NumberHelper(4);
        boolean expResult = true;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    /**
     * Test of isDivisibleBy method, of class NumberHelper.
     */
    @Test
    public void testIsDivisibleByF() {
        System.out.println("isDivisibleBy");
        int n = 2;
        NumberHelper instance = new NumberHelper(5);
        boolean expResult = false;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testIsDivisibleBy0() {
        System.out.println("isDivisibleBy");
        int n = 0;
        NumberHelper instance = new NumberHelper(5);
        if(n == 0){
        fail("Error, impossibile dividere per 0");
        }
        boolean expResult = false;
        boolean result = instance.isDivisibleBy(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
