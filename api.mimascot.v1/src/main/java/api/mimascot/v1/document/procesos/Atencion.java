package api.mimascot.v1.document.procesos;

import java.io.Serializable;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import api.mimascot.v1.document.gestion.Mascota;
import api.mimascot.v1.document.gestion.Medico;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Entidad para la gestion de atenciones
 *
 * @author Aristedes Novoa
 * @version 1.0
 * @since 25 Sep, 2021
 */

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Atencion")
public class Atencion implements Serializable{
	
	@Id
	@Builder.Default
    private String id = UUID.randomUUID().toString();

	@Field(name = "fecha")
	private String fecha;
	
	@Field(name = "horaInicio")
	private String horaInicio;

	@Field(name = "horaTermino")
	private String horaTermino;

	//private Mascota masctota;

	//private Medico medico;
	
	@Field(name = "detalleAtencion")
	private String detalleAtencion;
	
	@Field(name = "estado")
	private String estado;

}
