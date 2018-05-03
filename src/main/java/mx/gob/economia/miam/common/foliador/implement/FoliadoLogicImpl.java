/**
 * FoliadoLogicImpl.java Fecha de creación: 03/05/2018, 06:22:21 Copyright (c) 2018. Todos los
 * derechos reservados. Este software es información confidencial, propiedad de Secretaria de
 * Economia Picacho. Esta información confidencial no deberá ser divulgada y solo se podrá
 * utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.economia.miam.common.foliador.implement;

import java.util.ArrayList;
import java.util.List;
import mx.gob.economia.miam.common.foliador.exceptions.LogicException;
import mx.gob.economia.miam.common.foliador.logic.FoliadoLogic;
import mx.gob.economia.miam.common.foliador.model.FoliadoEntity;
import mx.gob.economia.miam.common.foliador.services.UtileriaFolios;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (orebollo@syesoftware.com)
 * @version 1.0
 * @since
 */
public class FoliadoLogicImpl implements FoliadoLogic {

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.economia.miam.common.foliador.logic.FoliadoLogic#generaFolio(java.lang.String)
	 */

	UtileriaFolios uf = new UtileriaFolios();

	@Override
	public List<FoliadoEntity> generaFolioList(String direccion) throws LogicException {
		List<FoliadoEntity> list = new ArrayList<>();
		FoliadoEntity foliadoEntity = new FoliadoEntity();
		foliadoEntity = uf.generaFolio(direccion);
		list.add(foliadoEntity);
		return list;
		// TODO se manda llamar funcion para generar el folio
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.economia.miam.common.foliador.logic.FoliadoLogic#validaFolioList(java.lang.String)
	 */
	@Override
	public List<FoliadoEntity> validaFolioList(String folio) throws LogicException {
		List<FoliadoEntity> list = new ArrayList<>();
		FoliadoEntity foliadoEntity = new FoliadoEntity();
		foliadoEntity = uf.validaExistencia(folio);
		list.add(foliadoEntity);
		return list;
		// TODO se manda llamar funcion que verifica si existe el codigo
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see
	 * mx.gob.economia.miam.common.foliador.logic.FoliadoLogic#cancelaFolioList(java.lang.String)
	 */
	@Override
	public List<FoliadoEntity> cancelaFolioList(String folio) throws LogicException {
		List<FoliadoEntity> list = new ArrayList<>();
		FoliadoEntity foliadoEntity = new FoliadoEntity();
		foliadoEntity = uf.cancelaFolio(folio);
		list.add(foliadoEntity);
		return list;
		// TODO se manda llamar funcion que cancela folio
	}

}
