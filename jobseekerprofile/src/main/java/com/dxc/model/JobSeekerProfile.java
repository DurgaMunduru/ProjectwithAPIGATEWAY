package com.dxc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name="JOB_PROFILE")
public class JobSeekerProfile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String firstname;
	private String lastname;
	private int age;
	private String email;
	private String contactnumber;
	private String location;
	private String qualification;
	private String skill1;
	private String skill2;
	private String experience;
	public JobSeekerProfile() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobSeekerProfile(int id, String firstname, String lastname, int age, String email, String contactnumber,
			String location, String qualification, String skill1, String skill2, String experience) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
		this.email = email;
		this.contactnumber = contactnumber;
		this.location = location;
		this.qualification = qualification;
		this.skill1 = skill1;
		this.skill2 = skill2;
		this.experience = experience;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactnumber() {
		return contactnumber;
	}
	public void setContactnumber(String contactnumber) {
		this.contactnumber = contactnumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSkill1() {
		return skill1;
	}
	public void setSkill1(String skill1) {
		this.skill1 = skill1;
	}
	public String getSkill2() {
		return skill2;
	}
	public void setSkill2(String skill2) {
		this.skill2 = skill2;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "JobSeekerProfile [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", age=" + age
				+ ", email=" + email + ", contactnumber=" + contactnumber + ", location=" + location
				+ ", qualification=" + qualification + ", skill1=" + skill1 + ", skill2=" + skill2 + ", experience="
				+ experience + "]";
	}
	
	
	
}
