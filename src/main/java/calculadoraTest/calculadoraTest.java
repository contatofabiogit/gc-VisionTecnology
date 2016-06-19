/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraTest;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author paulo
 */
public class calculadoraTest {
    @Test
    public void somaTest(){
        Calculadora calculadora = new Calculadora();
        
        int a = 5;
        int b = 6;
        
        int soma = calculadora.soma(a,b);
        
        Assert.assertEquals(11, soma);
    }
}
