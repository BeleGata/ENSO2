package app;

import io.jooby.annotations.*;

@Path("/")
public class Index {

  @GET
  @Path("/")
  public String index() {
    return "Bem-vindos/as a API calculadora";
  }
}
