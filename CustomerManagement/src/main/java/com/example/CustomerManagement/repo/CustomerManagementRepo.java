package com.example.CustomerManagement.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.CustomerManagement.model.customer;
@Repository
@Transactional

public interface CustomerManagementRepo extends JpaRepository<customer,String>{

}
