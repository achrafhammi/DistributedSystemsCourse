package enset.tp1;

import org.springframework.data.rest.core.config.Projection;

@Projection(types = Account.class, name="p1")
public interface AccountProjection {
    String getId();
    AccountType getType();
    Double getBalance();
}
