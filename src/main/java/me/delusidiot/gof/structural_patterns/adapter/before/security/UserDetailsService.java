package me.delusidiot.gof.structural_patterns.adapter.before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);
}
