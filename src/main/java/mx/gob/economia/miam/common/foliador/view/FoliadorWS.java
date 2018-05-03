package mx.gob.economia.miam.common.foliador.view;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import mx.gob.economia.miam.common.foliador.exceptions.LogicException;
import mx.gob.economia.miam.common.foliador.logic.FoliadoLogic;
import mx.gob.economia.miam.common.foliador.model.FoliadoEntity;

public class FoliadorWS {

	/**
	 * TODO [Agregar documentación del atributo]
	 */

	private FoliadoLogic foliadoLogic;

	@POST
	@Path("/folio/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response generaFolio(@PathParam("direccion") String direccion) {
		try {
			List<FoliadoEntity> list = foliadoLogic.generaFolioList(direccion);
			return Response.serverError().entity(list).build();
		} catch(LogicException e) {
			return Response.serverError().entity("{\"error:\":\"" + e.getMessage() + "\"}").build();
		}
	}

	@GET
	@Path("/folio/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response validaFolio(@PathParam("folio") String folio) {
		try {
			List<FoliadoEntity> list = foliadoLogic.validaFolioList(folio);
			return Response.ok().entity(list).build();
		} catch(LogicException e) {
			return Response.serverError().entity("{\"error:\":\"" + e.getMessage() + "\"}").build();
		}
	}

	@PUT
	@Path("/folio/{id}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response cancelaFolio(@PathParam("folio") String folio) {
		try {
			List<FoliadoEntity> list = foliadoLogic.cancelaFolioList(folio);
			return Response.ok().entity(list).build();
		} catch(LogicException e) {
			return Response.serverError().entity("{\"error:\":\"" + e.getMessage() + "\"}").build();
		}
	}

}
