package com.anurag.cleanindiabackend.repositories;

import com.anurag.cleanindiabackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
