package app;

import io.jooby.annotations.*;

import io.jooby.exception.BadRequestException;
 
@Path("/multiplicacao/{op}/{op2}")
public class Multiplicacao {
  
   @GET
   public double calcula(@PathParam("op") String opStr, @PathParam("op2") String opStr2) {
  
       try {
           double op = Double.parseDouble(opStr);
           double op2 = Double.parseDouble(opStr2);
           double mul = op *op2;
           return (mul);
           
       } catch (NumberFormatException nfe) {
           throw new BadRequestException("Operador inválido.");
       }
   }
}
