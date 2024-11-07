package achraf.tp4.commonApi.events;

import achraf.tp4.commonApi.enums.AccountStatus;
import lombok.Getter;

public class AccountActivatedEvent extends BaseEvent<String> {
    @Getter private AccountStatus status;

    public AccountActivatedEvent(String id,AccountStatus status) {
        super(id);
        this.status = status;
    }
}
