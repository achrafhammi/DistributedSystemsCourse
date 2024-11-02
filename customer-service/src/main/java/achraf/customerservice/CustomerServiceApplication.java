package achraf.customerservice;

import achraf.customerservice.entities.Customer;
import achraf.customerservice.repos.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepo customerRepo, RepositoryRestConfiguration repositoryRestConfiguration) {
		return args -> {
			repositoryRestConfiguration.exposeIdsFor(Customer.class);
			customerRepo.save(new Customer(null, "Achraf", "achraf@gmail.com"));
			customerRepo.save(new Customer(null, "Rachid", "rachid@gmail.com"));
			customerRepo.save(new Customer(null, "Aantar", "aantar@gmail.com"));
		};
	}
}
