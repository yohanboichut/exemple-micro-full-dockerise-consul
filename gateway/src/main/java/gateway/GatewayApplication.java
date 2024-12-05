package gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@SpringBootApplication
public class GatewayApplication {
	/*@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
		return builder.routes()
				.route( r-> {
							System.out.println(r);
							return r.path("/api/pileouface/**")
									.filters(f ->

											f.rewritePath("/api/pileouface/(?<remains>.*)", "/${remains}")
													.preserveHostHeader()
									)
									.uri("http://localhost:8082/jeu");
						}
				)
				.route(r -> {
							System.out.println(r);
							return r.path("/api/auth/**")
									.filters(f -> f.rewritePath("/api/auth/(?<remains>.*)",
											"/${remains}")             .preserveHostHeader()                   )
									.uri("http://localhost:8081/authent");
						}
				)
				.build();
	}
*/

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}
