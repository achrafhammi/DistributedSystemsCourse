package achraf.billingservice;

import achraf.billingservice.feigns.CustomerRestClient;
import achraf.billingservice.models.Customer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class BillingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BillingServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRestClient customerRestClient){
        return args -> {
            Customer customer = customerRestClient.findCustomerById(1L);
            System.out.println(customer.getId());
            System.out.println(customer.getEmail());
        };
    }
}
