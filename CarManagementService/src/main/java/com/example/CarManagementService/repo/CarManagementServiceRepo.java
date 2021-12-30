package com.example.CarManagementService.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CarManagementService.model.CarManagement;
@Repository
@Transactional
public interface CarManagementServiceRepo extends JpaRepository<CarManagement,String> {

}
