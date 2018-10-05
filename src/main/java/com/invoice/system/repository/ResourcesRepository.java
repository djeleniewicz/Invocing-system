package com.invoice.system.repository;

import com.invoice.system.entity.Resources;
import com.invoice.system.entity.Seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourcesRepository extends JpaRepository<Resources, Integer> {

}
