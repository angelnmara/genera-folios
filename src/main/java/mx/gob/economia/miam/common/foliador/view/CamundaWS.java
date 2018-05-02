package mx.gob.economia.miam.common.foliador.view;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import mx.gob.economia.miam.common.foliador.exceptions.LogicException;
import mx.gob.economia.miam.common.foliador.logic.FoliadoLogic;
import mx.gob.economia.miam.common.foliador.model.FoliadoEntity;

public class CamundaWS {

	/**
	 * TODO [Agregar documentación del atributo]
	 */

	private FoliadoLogic fl;

	@POST
	@Path("/tipoPonderado/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response generaFolio(@PathParam("direccion") String direccion,
		@PathParam("oficina") int oficina) {
		try {
			List<FoliadoEntity> list = fl.generaFolio(direccion, oficina);
			return Response.serverError().entity(list).build();
		} catch(LogicException e) {
			return Response.serverError().entity("{\"error:\":\"" + e.getMessage() + "\"}").build();
		}
	}
}
