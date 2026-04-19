package mustefaandeyob.product_service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import mustefaandeyob.product_service.model.Product;
import mustefaandeyob.product_service.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "Product Service API",
		version = "1.0.0",
		description = "RESTful Product Catalogue — Lab 2"
))
public class ProductServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(ProductServiceApplication.class, args);

	}

	@Bean
	CommandLineRunner seedData(ProductRepository repo) {
		return args -> {
			repo.save(new Product("Laptop", 1200.0, 10, "Electronics"));
			repo.save(new Product("Keyboard", 85.0, 50, "Accessories"));
		};
	}

}
