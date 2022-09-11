package app;
 
import io.jooby.annotations.*;

import io.jooby.exception.BadRequestException;
 
@Path("/subtracao/{op}/{op2}")
public class Subtracao {
  
   @GET
   public double calcula(@PathParam("op") String opStr, @PathParam("op2") String opStr2) {
  
       try {
           double op = Double.parseDouble(opStr);
           double op2 = Double.parseDouble(opStr2);
           double sub = op - op2;

           if (op == 0) {
            throw new BadRequestException("Não é possivel subtrair um numero de zero, logo, o resultado será o primeiro numero digitado.");   
        }

           if (op2 == 0) {
            throw new BadRequestException("Não é possivel subtrair zero de um numero, logo, o resultado será o oposto do segundo numero digitado. ");  
        }
 
           return (sub);
       } catch (NumberFormatException nfe) {
           throw new BadRequestException("Operador inválido.");
       }
   }
}
 
