package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisaoTest {

    @Test
    public void verificarNumNegativos(){
        Divisao divisao = new Divisao();
        double resultado = divisao.calcula("7", "-2");
        assertEquals(-3.5, resultado);
    }

    @Test
    public void verificarNumComVirgulas(){
        Divisao divisao = new Divisao();
        double resultado = divisao.calcula("5", "0.5");
        assertEquals(10, resultado);
    }

    
}
