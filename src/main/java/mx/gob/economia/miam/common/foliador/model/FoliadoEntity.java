package mx.gob.economia.miam.common.foliador.model;

public class FoliadoEntity extends AbstractEntity {

	/* lista de campos de foliado */

	private String fcIdFolio;

	private boolean fnFolioExiste;

	private String fcFolioError;

	/* generacion de geters and seters */

	public boolean isFnFolioExiste() {
		return fnFolioExiste;
	}

	public String getFcFolioError() {
		return fcFolioError;
	}

	public void setFcFolioError(String fcFolioError) {
		this.fcFolioError = fcFolioError;
	}

	public void setFnFolioExiste(boolean fnFolioExiste) {
		this.fnFolioExiste = fnFolioExiste;
	}

	public String getFcIdFolio() {
		return fcIdFolio;
	}

	public void setFcIdFolio(String fcIdFolio) {
		this.fcIdFolio = fcIdFolio;
	}

}