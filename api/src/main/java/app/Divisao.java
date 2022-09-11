package app;

import io.jooby.annotations.*;

import io.jooby.exception.BadRequestException;

@Path("/divisao/{op}/{op2}")
public class Divisao {
   @GET
   public double calcula(@PathParam("op") String opStr, @PathParam("op2") String opStr2) {
      try {
         double op = Double.parseDouble(opStr);
         double op2 = Double.parseDouble(opStr2);
         double div = op / op2;
         
         if (op2== 0) {
            throw new BadRequestException("Não é possível dividir por 0.");
         }
         
         return (div);
      } catch (NumberFormatException nfe) {
         throw new BadRequestException("Operador inválido.");
      }
   }
}
