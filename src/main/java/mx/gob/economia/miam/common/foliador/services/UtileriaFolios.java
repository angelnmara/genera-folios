/**
 * UtileriaFolios.java Fecha de creación: Apr 24, 2018, 5:16:31 PM Copyright (c) 2018
 * XXXXXXXXXXXXXX. Todos los derechos reservados. Este software es información confidencial,
 * propiedad de ######. Esta información confidencial no deberá ser divulgada y solo se podrá
 * utilizar de acuerdo a los términos que determine la propia empresa.
 */
package mx.gob.economia.miam.common.foliador.services;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * TODO [Agregar documentacion de la clase]
 * @author Omar Rebollo (orebollo@syesoftware.com)
 * @version 1.0
 * @since
 */
public class UtileriaFolios {

	public static List<String> listaFolios = new ArrayList<String>();

	static {
		listaFolios.add("DM/2018/00001");
		listaFolios.add("DM/2018/00002");
		listaFolios.add("DM/2018/00003");
		listaFolios.add("DM/2018/00004");
		listaFolios.add("DM/2018/00005");
		listaFolios.add("DM/2018/00006");
		listaFolios.add("DM/2018/00007");
		listaFolios.add("DM/2018/00008");
		listaFolios.add("DM/2018/00009");
		listaFolios.add("DM/2018/00010");
		listaFolios.add("DM/2018/00011");
		listaFolios.add("DM/2018/00012");
		listaFolios.add("DM/2018/00013");
		listaFolios.add("DM/2018/00014");
		listaFolios.add("DM/2018/00015");
		listaFolios.add("DM/2018/00017");
		listaFolios.add("DM/2018/00018");
		listaFolios.add("DM/2018/00019");
		listaFolios.add("DM/2018/00020");
		listaFolios.add("DM/2018/00021");
		listaFolios.add("DM/2018/00022");
		listaFolios.add("DM/2018/00023");
		listaFolios.add("DM/2018/00024");
		listaFolios.add("DM/2018/00025");
		listaFolios.add("DM/2018/00026");
		listaFolios.add("DM/2018/00027");
		listaFolios.add("DM/2018/00028");
		listaFolios.add("DM/2018/00029");
		listaFolios.add("DM/2018/00030");
	}

	public String generaFolio() {
		String direccion = "DM";
		String anio = "2018";
		Random random = new Random();
		int randomInt = random.nextInt(10000);
		String consecutivo = Integer.toString(randomInt);
		String folio = direccion.concat("/").concat(anio).concat("/").concat(consecutivo);
		System.out.println("folio: " + folio);
		return folio;
	}

	public boolean validaExistencia(String folioEnviado) {
		if (folioEnviado != null && !folioEnviado.equals(""))
			for (String folio : listaFolios)
				if (folio.equals(folioEnviado)) {
					System.out.println("Existe Folio");
					return true;
				}
		return false;
	}

	public void cancelaFolio(String folioEnviado) {
		Iterator<String> iterator = listaFolios.iterator();
		while(iterator.hasNext()) {
			String folio = iterator.next();
			if (folio.equals(folioEnviado)) {
				System.out.println("Cancela Folio");
				iterator.remove();
			}
		}
	}

}
