package mx.gob.economia.miam.common.foliador.logic;

import java.util.List;

import mx.gob.economia.miam.common.foliador.exceptions.LogicException;
import mx.gob.economia.miam.common.foliador.model.FoliadoEntity;

public interface FoliadoLogic {
	List<FoliadoEntity> generaFolio(String direccion, int oficina) throws LogicException;
}
