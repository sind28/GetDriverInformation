package com.sree.driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sree.driver.entity.DriverEntity;

public interface DriverRepository extends JpaRepository<DriverEntity,Long>{
	DriverEntity findByDriverId(int id);
}
