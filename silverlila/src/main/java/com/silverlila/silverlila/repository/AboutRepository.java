package com.silverlila.silverlila.repository;

import com.silverlila.silverlila.model.About;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AboutRepository extends JpaRepository<About, Integer> {
	//That's all!
}
