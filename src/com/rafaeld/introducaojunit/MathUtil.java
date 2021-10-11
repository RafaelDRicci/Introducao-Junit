/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafaeld.introducaojunit;

/**
 *
 * @author rafaeld
 */
public class MathUtil {
 
    public static int mdc(int a, int b){
        
        if(b > 0 && a % b == 0) return b;
        
        if(b == 0) return Math.abs(a);
        
        if(a % b != 0) return 1;
        
        return -1;
    }
    
}
