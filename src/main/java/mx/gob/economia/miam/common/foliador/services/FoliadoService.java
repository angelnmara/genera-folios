/**
 * Foliado.java Fecha de creación: Apr 24, 2018, 12:26:30 PM Copyright (c) 2018 XXXXXXXXXXXXXX.
 * Todos los derechos reservados. Este software es información confidencial, propiedad de
 * ######. Esta información confidencial no deberá ser divulgada y solo se podrá utilizar de
 * acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.economia.miam.common.foliador.services;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (orebollo@syesoftware.com)
 * @version 1.0
 * @since
 */
public interface FoliadoService {

	String generaFolio();

	boolean validaExistencia(String folio);

	void cancelaFolio(String folio);

}
