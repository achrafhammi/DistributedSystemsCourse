package achraf.billingservice.entities;

import achraf.billingservice.models.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductItem {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private long productId;
    private double price;
    private double quantity;
    @ManyToOne
    private Bill bill;

    @Transient private Product product;
}
