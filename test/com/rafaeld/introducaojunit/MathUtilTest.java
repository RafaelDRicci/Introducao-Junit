/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rafaeld.introducaojunit;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.rafaeld.introducaojunit.MathUtil.mdc;

/**
 *
 * @author rafaeld
 */
public class MathUtilTest {
    

    @Test
    public void testMdcAParP1() {
        final int a = 6;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testMdcAImparP1() {
        final int a = 9;
        final int b = 3;
        final int esperado = b;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testMdcParesP2(){
        final int a = 16;
        final int b = 8;
        final int divisor = 4;
        final int obtido = MathUtil.mdc(a, b);
        assertTrue(obtido % divisor == 0);
    }
    
    @Test
    public void testMdcAPositivoP3(){
        final int a = 15;
        final int b = 0;
        final int esperado = 15;
        final int obtido = MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testMdcANegativoP3(){
        final int a = -30;
        final int b = 0;
        final int esperado = 30;
        final int obtido = MathUtil.mdc(a, b); 
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testMdcMParP4(){
        final int a = 9;
        final int b = 3;
        final int m = 2;
        //mdc(a*m, b*m) == m * mdc(a, b)
        //mdc(18, 6)    == 2 * mdc(9, 3)
        //      6       == 2 * 3
        final int esperado = MathUtil.mdc(a*m, b*m);
        final int obtido = m*MathUtil.mdc(a, b);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testMdcP5(){
        //se mdc(a,b) == 1, então mdc(a*b, c) == mdc (b, c)
        final int a = 7;
        final int b = 3;
        final int c = 5;
        //                      7*3,  5
        //                      21,   5
        final int esperado = mdc(a*b, c);
        
        //                     3, 5
        final int obtido = mdc(b, c);
        assertEquals(esperado, obtido);
    }
    
    @Test
    public void testMdcResultadoUmP5(){
        //se mdc(a,b) == 1, então mdc(a*b, c) == mdc (b, c)
        final int a = 7;
        final int b = 3;
        final int c = 5;

        final int esperado = 1;
        
        //                     3, 5
        final int obtido = mdc(b, c);
        assertEquals(esperado, obtido);
    }
    
}
