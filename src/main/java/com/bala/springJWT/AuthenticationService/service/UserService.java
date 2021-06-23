package com.bala.springJWT.AuthenticationService.service;

import com.bala.springJWT.AuthenticationService.model.UserAccount;
import com.bala.springJWT.AuthenticationService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserService implements UserDetailsService {
    @Autowired
    private UserRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //Logic to get the user form the Database
       UserAccount u= repo.findByUsername(username);
        return new User(u.getUsername(),u.getPassword(),new ArrayList<>());
    }
}
