package api.mimascot.v1.repostitory.gestion;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import api.mimascot.v1.document.Taller;
import api.mimascot.v1.document.procesos.Atencion;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface AtencionRespository extends ReactiveMongoRepository<Atencion, String>{
	
	Flux<Taller> findByEstado(String estado);
		
	Mono<Taller> findByTallerId(Long tallerId);

}
