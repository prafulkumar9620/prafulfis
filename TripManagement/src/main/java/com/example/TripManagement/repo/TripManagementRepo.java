package com.example.TripManagement.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.TripManagement.model.Trip;

import antlr.collections.List;

@Repository
@Transactional

public interface TripManagementRepo extends JpaRepository<Trip,String>{
//	@Query("select c from Trip c where c.pid=?1")
//	public List<Trip> searchCommentsByPid(Integer pid);
}
