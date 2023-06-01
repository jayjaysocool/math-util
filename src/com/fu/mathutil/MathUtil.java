
package com.fu.mathutil;

/**
 *
 * @author jayjaysocool
 */
public class MathUtil {

    public static void main(String[] args) {
       
        long result = MathUtility.getFactorial(5);
        System.out.println("expected:  5! = 120; actual: " + result);
        System.out.println("expected:  6! = 720; actual: " + MathUtility.getFactorial(6));
        System.out.println("expected:  0! = 720; actual: " + MathUtility.getFactorial(0));
        
    }
    
}
