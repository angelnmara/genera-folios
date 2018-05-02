package mx.gob.economia.miam.common.foliador.model;

public class FoliadoEntity extends AbstractEntity {
	
	/*	lista de campos de foliado	*/
	
	private String fiIdFolio;
	private String fcFolioDireccion; 
	private String fcFolioOficina;
	private String fcFolioConsecutivo;
	
	/*	generacion de geters and seters*/
	
	public String getFiIdFolio() {
		return fiIdFolio;
	}
	public void setFiIdFolio(String fiIdFolio) {
		this.fiIdFolio = fiIdFolio;
	}
	public String getFcFolioDireccion() {
		return fcFolioDireccion;
	}
	public void setFcFolioDireccion(String fcFolioDireccion) {
		this.fcFolioDireccion = fcFolioDireccion;
	}
	public String getFcFolioOficina() {
		return fcFolioOficina;
	}
	public void setFcFolioOficina(String fcFolioOficina) {
		this.fcFolioOficina = fcFolioOficina;
	}
	public String getFcFolioConsecutivo() {
		return fcFolioConsecutivo;
	}
	public void setFcFolioConsecutivo(String fcFolioConsecutivo) {
		this.fcFolioConsecutivo = fcFolioConsecutivo;
	}
	
}