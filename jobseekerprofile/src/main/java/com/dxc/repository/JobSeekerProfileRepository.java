package com.dxc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dxc.model.JobSeekerProfile;


public interface JobSeekerProfileRepository extends JpaRepository<JobSeekerProfile, Integer> {
	
	@Query("select p from JobSeekerProfile p where p.firstname=?1")
	JobSeekerProfile findByFirstname(String firstname);
	
}
