/**
 * UtileriaFolios.java Fecha de creación: Apr 24, 2018, 5:16:31 PM Copyright (c) 2018
 * XXXXXXXXXXXXXX. Todos los derechos reservados. Este software es información confidencial,
 * propiedad de ######. Esta información confidencial no deberá ser divulgada y solo se podrá
 * utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.economia.miam.common.foliador.services;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import mx.gob.economia.miam.common.foliador.model.FoliadoEntity;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (orebollo@syesoftware.com)
 * @version 1.0
 * @since
 */
public class UtileriaFolios {

	FoliadoEntity foliadoEntity = new FoliadoEntity();

	public static List<String> listaDirecciones = new ArrayList<String>();
	static {
		listaDirecciones.add("DGL");
		listaDirecciones.add("DRP");
		listaDirecciones.add("DEC");
		listaDirecciones.add("DCR");
		listaDirecciones.add("DCO");
	}

	public static List<FoliadoEntity> listaFolios = new ArrayList<>();

	public FoliadoEntity generaFolio(String direccion) {

		boolean existeDireccion = false;

		for (String validaDireccion : listaDirecciones)
			if (validaDireccion.equals(direccion))
				existeDireccion = true;

		if (!existeDireccion) {
			foliadoEntity.setFcIdFolio("");
			foliadoEntity.setFnFolioExiste(false);
			foliadoEntity.setFcFolioError("No existe direccion");
			System.out.println("No existe direccion");
			return foliadoEntity;
		}

		Formatter fmtm = new Formatter();
		Formatter fmtd = new Formatter();
		Formatter fmtc = new Formatter();
		java.util.Date date = new Date();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		String anio = String.valueOf(calendar.get(Calendar.YEAR));
		String mes = String.valueOf(fmtm.format("%02d", calendar.get(Calendar.MONTH)));
		String dia = String.valueOf(fmtd.format("%02d", calendar.get(Calendar.DAY_OF_MONTH)));
		String consecutivo = String.valueOf(fmtc.format("%05d", listaFolios.size() + 1));
		String folio =
			direccion.concat(anio).concat(mes).concat(dia).concat("-").concat(consecutivo);
		foliadoEntity.setFcIdFolio(folio);
		foliadoEntity.setFnFolioExiste(true);
		foliadoEntity.setFcFolioError("");
		listaFolios.add(foliadoEntity);
		System.out.println("folio: " + folio);
		return foliadoEntity;

	}

	public FoliadoEntity validaExistencia(String folioEnviado) {

		foliadoEntity.setFcIdFolio(folioEnviado);
		foliadoEntity.setFcFolioError("");

		if (folioEnviado != null && !folioEnviado.equals(""))
			for (FoliadoEntity folio : listaFolios)
				if (folio.getFcIdFolio().equals(folioEnviado)) {
					foliadoEntity.setFnFolioExiste(true);
					System.out.println("Existe Folio");
					return foliadoEntity;
				}

		foliadoEntity.setFnFolioExiste(false);
		System.out.println("No existe Folio");
		return foliadoEntity;
	}

	public FoliadoEntity cancelaFolio(String folioEnviado) {

		foliadoEntity.setFcIdFolio(folioEnviado);
		foliadoEntity.setFcFolioError("");

		Iterator<FoliadoEntity> iterator = listaFolios.iterator();
		while(iterator.hasNext()) {
			String folio = iterator.next().getFcIdFolio();
			if (folio.equals(folioEnviado)) {
				foliadoEntity.setFnFolioExiste(false);
				System.out.println("folio cancelado");
				// iterator.remove();
				return foliadoEntity;
			}
		}
		System.out.println("No se encontro folio a cancelar");
		foliadoEntity.setFnFolioExiste(true);
		foliadoEntity.setFcFolioError("No se encontro folio a cancelar");
		return foliadoEntity;
	}
}
