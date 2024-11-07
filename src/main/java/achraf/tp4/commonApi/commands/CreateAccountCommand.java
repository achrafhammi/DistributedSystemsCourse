package achraf.tp4.commonApi.commands;


import lombok.Getter;

public class CreateAccountCommand extends BaseCommand<String> {
    @Getter private double accountBalance;
    @Getter private String currency;

    public CreateAccountCommand(String id, double accountBalance, String currency) {
        super(id);
        this.accountBalance = accountBalance;
        this.currency = currency;
    }
}
