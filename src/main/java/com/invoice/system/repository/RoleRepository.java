package com.invoice.system.repository;

import com.invoice.system.entity.Role;
import com.invoice.system.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

}
