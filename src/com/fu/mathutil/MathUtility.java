/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fu.mathutil;

/**
 *
 * @author nguye
 */
public class MathUtility {
    //n! = 1 * 2 * 3 * 4 .....n
    //0! = 1
    //not calculate for negative integer 
    // long limit with 20! 

    public static long getFactorial(int n) {
        // if input negative integer or > 20! throw exception 
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument");
        }else if( n == 0 || n == 1){
            return 1;
        }
        long product = 1;
        for (int i = 2; i <= n; i++) {
            product *= i;
        }
       
        return product;
    }

}
