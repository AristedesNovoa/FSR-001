package api.mimascot.v1.service.gestion;

import org.springframework.stereotype.Service;
import api.mimascot.v1.document.procesos.Atencion;
import api.mimascot.v1.repostitory.gestion.AtencionRespository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class AtencionServiceImpl implements AtencionService{
	
	
	private AtencionRespository atencionRespository;
	
	public AtencionServiceImpl(AtencionRespository atencionRespository) {
		this.atencionRespository=atencionRespository;
	}

	@Override
	public Flux<Atencion> findByLike(Atencion t) {
		return atencionRespository.findAll();
	}

	@Override
	public Mono<Atencion> findById(Atencion t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Atencion> save(Atencion t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flux<Atencion> findByFecha(String fecha) {
		// TODO Auto-generated method stub
		return null;
	}

}
