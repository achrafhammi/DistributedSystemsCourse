package achraf.billingservice.api;

import achraf.billingservice.entities.Bill;
import achraf.billingservice.feigns.CustomerRestClient;
import achraf.billingservice.feigns.ProductRestClient;
import achraf.billingservice.repos.BillRepo;
import achraf.billingservice.repos.ProductItemRepo;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class BillRestController {
    private BillRepo billRepo;
    private ProductItemRepo productItemRepo;
    private CustomerRestClient customerRestClient;
    private ProductRestClient productRestClient;


    @GetMapping("/bills/full/{id}")
    public Bill getBill(@PathVariable(name = "id") Long id) {
        Bill bill = billRepo.findById(id).get();
        bill.setCustomer(customerRestClient.findCustomerById(bill.getCustomerId()));
        bill.getProductItems().forEach(pi -> {
            pi.setProduct(productRestClient.findProductById(pi.getProductId()));
        });
        return bill;
    }
}
