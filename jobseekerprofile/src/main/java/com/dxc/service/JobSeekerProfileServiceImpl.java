package com.dxc.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.exception.ProfileNotExistsException;
import com.dxc.model.JobSeekerProfile;
import com.dxc.repository.JobSeekerProfileRepository;



@Service
public class JobSeekerProfileServiceImpl implements JobSeekerProfileService {

	@Autowired
	private JobSeekerProfileRepository repo;
	
	
	public JobSeekerProfile create(JobSeekerProfile jsp) {
		
		return repo.save(jsp);
	}

	@Override
	public List<JobSeekerProfile> getAllJobSeekerProfiles() {
		
		return repo.findAll();
	}

	@Override
	public JobSeekerProfile updateProfileByFirstname(JobSeekerProfile jsp, String firstname)
			throws ProfileNotExistsException {
		JobSeekerProfile jsp1 = repo.findByFirstname(firstname);
		jsp1.setAge(jsp.getAge());
		jsp1.setContactnumber(jsp.getContactnumber());
		jsp1.setEmail(jsp.getEmail());
		jsp1.setExperience(jsp.getExperience());
		jsp1.setFirstname(jsp.getFirstname());
		jsp1.setLastname(jsp.getLastname());
		jsp1.setLocation(jsp.getLocation());
		jsp1.setQualification(jsp.getQualification());
		jsp1.setSkill1(jsp.getSkill1());
		jsp1.setSkill2(jsp.getSkill2());
		repo.save(jsp1);
		return jsp1;
	}


}
