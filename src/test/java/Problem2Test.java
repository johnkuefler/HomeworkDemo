/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author johnk
 */
public class Problem2Test {
    
    public Problem2Test() {
    }


    @Test
    public void testAddNumber() {
        System.out.println("addNumber");
        int num1 = 1;
        int num2 = 2;
        int expResult = 3;
        int result = Problem2.addNumber(num1, num2);
        assertEquals(expResult, result);
    }
    
}
