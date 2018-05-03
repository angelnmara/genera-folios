/**
 * Foliado.java Fecha de creación: Apr 24, 2018, 12:24:51 PM Copyright (c) 2018 XXXXXXXXXXXXXX.
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * ######. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar de
 * acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.economia.miam.common.foliador.services;

import mx.gob.economia.miam.common.foliador.model.FoliadoEntity;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (orebollo@syesoftware.com)
 * @version 1.0
 * @since
 */
public class FoliadoServiceImpl implements FoliadoService {

	private UtileriaFolios utileriaFolios;

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.economia.miam.common.foliador.Foliado#generaFolio()
	 */
	@Override
	public FoliadoEntity generaFolio(String direccion) {
		utileriaFolios = new UtileriaFolios();
		return utileriaFolios.generaFolio(direccion);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.economia.miam.common.foliador.Foliado#validaExistencia(java.lang.String)
	 */
	@Override
	public FoliadoEntity validaExistencia(String folio) {
		utileriaFolios = new UtileriaFolios();
		return utileriaFolios.validaExistencia(folio);
	}

	/*
	 * La documentación de este método se encuentra en la clase o interface que lo declara
	 * (non-Javadoc)
	 * @see mx.gob.economia.miam.common.foliador.Foliado#cancelaFolio(java.lang.String)
	 */
	@Override
	public FoliadoEntity cancelaFolio(String folio) {
		utileriaFolios = new UtileriaFolios();
		return utileriaFolios.cancelaFolio(folio);
	}

	public static void main(String[] args) {
		FoliadoServiceImpl foliador = new FoliadoServiceImpl();
		foliador.generaFolio("DCR");
		foliador.validaExistencia("DCR20180403-00001");
		foliador.cancelaFolio("DCR20180403-00001");
	}

}
