package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubtracaoTest {
    
    @Test
    public void teste1(){
        Subtracao subtracao = new Subtracao();
        double resultado = subtracao.calcula("7", "-3");
        assertEquals(10, resultado);
    }
    @Test
    public void teste2(){
        Subtracao subtracao = new Subtracao();
        double resultado = subtracao.calcula("-5", "-1.5");
        assertEquals(-3.5, resultado);
    }
}

