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
 
           return (sub);
       } catch (NumberFormatException nfe) {
           throw new BadRequestException("Operador inválido.");
       }
   }
}
 
