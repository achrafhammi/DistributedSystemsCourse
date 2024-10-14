package enset.tp1;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {
    public AccountResponseDTO fromAccount(Account account){
        AccountResponseDTO accountResponseDTO = new AccountResponseDTO();
        BeanUtils.copyProperties(account, accountResponseDTO);
        return accountResponseDTO;
    }
}
