package com.ninos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninos.model.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String roleName);

}
