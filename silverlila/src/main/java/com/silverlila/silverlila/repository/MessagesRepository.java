package com.silverlila.silverlila.repository;

import com.silverlila.silverlila.model.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Messages, Integer> {

}
