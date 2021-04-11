package webservice;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/calculadora")
public class CalculadoraRest {   

	@GET
	@Path("/somarInt/{a}/{b})")
	@Produces(MediaType.APPLICATION_JSON)
	public int somarInt(@PathParam("a") int a, @PathParam("b") int b) {
		Calculadora c = new Calculadora(a, b, "+");

		return c.getResultado();
	}

	@GET
	@Path("/multiplicarInt/{a}/{b})")
	@Produces(MediaType.APPLICATION_JSON)
	public int multiplicarInt(@PathParam("a") int a, @PathParam("b") int b) {
		Calculadora c = new Calculadora(a, b, "*");

		return c.getResultado();
	}
}
