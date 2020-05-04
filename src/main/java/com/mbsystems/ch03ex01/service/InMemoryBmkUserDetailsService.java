package com.mbsystems.ch03ex01.service;

import com.mbsystems.ch03ex01.domain.SecurityUser;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public class InMemoryBmkUserDetailsService implements UserDetailsService {

    private List<SecurityUser> userList;

    public InMemoryBmkUserDetailsService( List<SecurityUser> userList ) {
        this.userList = userList;
    }

    @Override
    public UserDetails loadUserByUsername( String username ) throws UsernameNotFoundException {
        return userList.stream()
                        .filter( aUser -> aUser.getUsername().equals( username ) )
                        .findFirst()
                        .orElseThrow( () -> new UsernameNotFoundException("User Not Found"));
    }
}
