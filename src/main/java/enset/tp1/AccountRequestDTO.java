package enset.tp1;

import jakarta.persistence.Enumerated;
import lombok.Data;

import java.util.Date;

import static jakarta.persistence.EnumType.STRING;

@Data
public class AccountRequestDTO {
    private Double balance;
    private String currency;
    private AccountType accountType;
}
