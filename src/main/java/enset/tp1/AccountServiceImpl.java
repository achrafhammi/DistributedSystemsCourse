package enset.tp1;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
@Transactional
@AllArgsConstructor
public class AccountServiceImpl implements AccountService {
    private AccountRepo accountRepo;
    private AccountMapper accountMapper;
    @Override
    public AccountResponseDTO addAccount(AccountRequestDTO accountDTO) {
        Account account = Account.builder()
                .id(UUID.randomUUID().toString())
                .createdAt(new Date())
                .balance(accountDTO.getBalance())
                .accountType(accountDTO.getAccountType())
                .currency(accountDTO.getCurrency())
                .build();
        Account savedAccount = accountRepo.save(account);
        return accountMapper.fromAccount(savedAccount);

    }

    @Override
    public AccountResponseDTO updateAccount(String id, AccountRequestDTO accountDTO) {
        Account account = Account.builder()
                .id(id)
                .createdAt(new Date())
                .balance(accountDTO.getBalance())
                .accountType(accountDTO.getAccountType())
                .currency(accountDTO.getCurrency())
                .build();
        Account savedAccount = accountRepo.save(account);
        return accountMapper.fromAccount(savedAccount);

    }
}
