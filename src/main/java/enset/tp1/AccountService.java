package enset.tp1;

public interface AccountService {
    public AccountResponseDTO addAccount(AccountRequestDTO accountDTO);
    public AccountResponseDTO updateAccount(String id, AccountRequestDTO accountDTO);
}
