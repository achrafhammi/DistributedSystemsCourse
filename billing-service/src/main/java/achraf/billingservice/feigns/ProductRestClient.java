package achraf.billingservice.feigns;

import achraf.billingservice.models.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "INVENTORY-SERVICE")
public interface ProductRestClient {
    @GetMapping("/products/{id}?projection=fullProduct")
    Product findProductById(@PathVariable(value = "id") Long id);

    @GetMapping("/products?projection=fullProduct")
    PagedModel<Product> findAllProducts(@RequestParam(value="page") int page,
                                        @RequestParam(value="size") int size);

}
