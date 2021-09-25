package api.mimascot.v1.service.generic;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface GenericService<T> {
	
	Flux<T> findByLike(T t);
	
	Mono<T> findById(T t);
	
	Mono<T> save(T t);
	
}
