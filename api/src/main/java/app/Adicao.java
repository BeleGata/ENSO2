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
 
           return (adi);
       } catch (NumberFormatException nfe) {
           throw new BadRequestException("Operador inválido.");
       }
   }
}

