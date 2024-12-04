package com.anurag.cleanindiabackend.repositories;

import com.anurag.cleanindiabackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {
}
