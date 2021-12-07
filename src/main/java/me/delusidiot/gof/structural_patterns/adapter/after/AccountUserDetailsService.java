package me.delusidiot.gof.structural_patterns.adapter.after;

import me.delusidiot.gof.structural_patterns.adapter.after.security.UserDetails;
import me.delusidiot.gof.structural_patterns.adapter.after.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }
}
