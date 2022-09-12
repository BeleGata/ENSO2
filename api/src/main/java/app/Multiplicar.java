package app;

import io.jooby.annotations.*;

import io.jooby.exception.BadRequestException;
 
@Path("/multiplicacao/{op}/{op2}")
public class Multiplicar {
  
   @GET
   public double calcula(@PathParam("op") String opStr, @PathParam("op2") String opStr2) {
    System.out.println("Lembresse quando um dos valores for 0, o produto também será 0.");
       try {
           double op = Double.parseDouble(opStr);
           double op2 = Double.parseDouble(opStr2);
           double mul = op *op2;
           
           if (op == 0) {
            throw new BadRequestException("Qualquer número multiplicado por 0 terá como resultado final 0");
           }
           if (op2 == 0) {
            throw new BadRequestException("Qualquer número multiplicado por 0 terá como resultado final 0");   
           }
        return (mul);
       } 
       catch (NumberFormatException nfe) {
       }
       throw new BadRequestException("Operador inválido.");
       }
   }
