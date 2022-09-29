package app;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplicarTeste {
    
    @Test
    public void verificacaoPrimeiroteste(){
        Multiplicar multiplicar = new Multiplicar();
        double resultado = multiplicar.calcula ("5.7", "2.4");
        assertEquals(13.68, resultado);
    }
    @Test
    public void verificacaoSegundoteste(){
        Multiplicar multiplicar = new Multiplicar();
        double resultado = multiplicar.calcula ("19", "-5");
        assertEquals(-95, resultado);
    }
}
