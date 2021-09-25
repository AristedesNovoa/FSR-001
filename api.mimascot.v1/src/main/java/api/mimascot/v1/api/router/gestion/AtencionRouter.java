package api.mimascot.v1.api.router.gestion;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;
import static api.mimascot.v1.api.constantes.Routes.ROUTE_ATENCION;
import api.mimascot.v1.api.handler.gestion.AtencionHandler;

@Configuration
public class AtencionRouter {

	@Bean
	public RouterFunction<ServerResponse> routes(AtencionHandler atencionHandler) {
		return RouterFunctions
				.route(GET(ROUTE_ATENCION).and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
						atencionHandler::findById)
				.andRoute(GET(ROUTE_ATENCION + "/by-fecha").and(RequestPredicates.accept(MediaType.APPLICATION_JSON)),
						atencionHandler::findByFecha);
	}

}
