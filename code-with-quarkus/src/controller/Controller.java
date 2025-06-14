package controller;

import jakarta.ws.rs.Path;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/cadastrar_produto")
public class Controller {
	
	
	@GET
	public String corsa() {
		return "deu certo!";
	}
	
}
