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
        
        int a = 6;
        int b = 5;
        
        int soma = calculadora.soma(a,b);
        int subtrai = calculadora.subtrai(a,b);
        int multiplica = calculadora.multiplica(a,b);
        int divide = calculadora.divide(a,b);
        
        Assert.assertEquals(1, subtrai);
    }
}
