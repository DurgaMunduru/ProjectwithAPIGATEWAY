package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.exception.ProfileNotExistsException;
import com.dxc.model.JobSeekerProfile;
import com.dxc.service.JobSeekerProfileService;

@RestController
@RequestMapping("/jobseekerprofile")
public class JobSeekerProfileController {
	
	@Autowired
	private JobSeekerProfileService service;
	
	
	@PostMapping("/addprofile")
	public JobSeekerProfile create(@RequestBody JobSeekerProfile jsp) {
		return service.create(jsp);	
     }
	
	@PutMapping("/updateprofile/{firstname}")
	public JobSeekerProfile updateProfileByFirstName(@PathVariable("firstname") String firstname,@RequestBody JobSeekerProfile jsp1) throws ProfileNotExistsException{
		JobSeekerProfile updatedprofile = service.updateProfileByFirstname(jsp1,firstname);
		return updatedprofile;
	}
	
	@GetMapping("/showallprofiles")
	public List<JobSeekerProfile>getAllProfiles(@RequestBody JobSeekerProfile jsp){
		return service.getAllJobSeekerProfiles();
	}
	
}
