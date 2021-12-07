package me.delusidiot.gof.structural_patterns.adapter.after;

import me.delusidiot.gof.structural_patterns.adapter.after.security.LoginHandler;
import me.delusidiot.gof.structural_patterns.adapter.after.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("delusidiot", "delusidiot");
        System.out.println("login = " + login);
    }
}
