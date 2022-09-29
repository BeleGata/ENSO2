package app;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdicaoTest {
    @Test
    public void verificaCasoNegativo(){
        Adicao adicao= new Adicao();
        double resultado = adicao.calcula("2", "-3");
        assertEquals(-1.0, resultado);
    }
    @Test
    public void verificaCasoVirgula(){
        Adicao adicao= new Adicao();
        double resultado = adicao.calcula("1.5",  "1.5");
        assertEquals(3.0, resultado);
    }
}
