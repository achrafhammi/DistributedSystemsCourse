package enset.tp1;

import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

import static jakarta.persistence.EnumType.STRING;

@Data
@NoArgsConstructor @AllArgsConstructor @Builder
public class AccountResponseDTO {
    private String id;
    private Date createdAt;
    private Double balance;
    private String currency;
    private AccountType accountType;
}
