package achraf.billingservice.repos;

import achraf.billingservice.entities.ProductItem;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@RepositoryRestResource
public interface ProductItemRepo extends JpaRepository<ProductItem, Long> {
    List<ProductItem> findByBillId(Long id);
}
