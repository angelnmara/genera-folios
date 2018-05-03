package mx.gob.economia.miam.common.foliador.logic;

import java.util.List;
import mx.gob.economia.miam.common.foliador.exceptions.LogicException;
import mx.gob.economia.miam.common.foliador.model.FoliadoEntity;

public interface FoliadoLogic {

	List<FoliadoEntity> generaFolioList(String direccion) throws LogicException;

	List<FoliadoEntity> validaFolioList(String folio) throws LogicException;

	List<FoliadoEntity> cancelaFolioList(String folio) throws LogicException;

}
