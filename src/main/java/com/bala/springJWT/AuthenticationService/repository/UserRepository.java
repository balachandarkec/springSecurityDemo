package com.bala.springJWT.AuthenticationService.repository;

import com.bala.springJWT.AuthenticationService.model.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserAccount,String> {
         public UserAccount findByUsername(String username);

}
