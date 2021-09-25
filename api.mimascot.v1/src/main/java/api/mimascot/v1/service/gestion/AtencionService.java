package api.mimascot.v1.service.gestion;

import api.mimascot.v1.document.procesos.Atencion;
import api.mimascot.v1.service.generic.GenericService;
import reactor.core.publisher.Flux;

public interface AtencionService extends GenericService<Atencion>{
	
	Flux<Atencion> findByFecha(String fecha);

}
