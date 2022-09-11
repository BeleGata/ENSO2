package app;
 
import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;
 
@Path("/adicao/{op}/{op2}")
public class Adicao {
 
   @GET
   public double calcula(@PathParam("op") String opStr, @PathParam("op2") String opStr2) {
 
    try {
        double op = Double.parseDouble(opStr);
        double op2 = Double.parseDouble(opStr2);
        double adi = op + op2;
 
        if (op == 0) {
            throw new BadRequestException("Se a parcela 1 for 0, o resultado final terá como valor final a própria parcela 2.");  
        }
        if (op2 == 0) {
            throw new BadRequestException("Se a parcela 2 for 0, o resultado final terá como valor final a própria parcela 1.");  
        }
        return (adi);
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
       }
   }
}

