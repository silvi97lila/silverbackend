package com.silverlila.silverlila.repository;

import com.silverlila.silverlila.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Integer> {
	Users findByUsername(String username);
}
