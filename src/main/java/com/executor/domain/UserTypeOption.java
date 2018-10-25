package com.executor.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="UserTypeOptions")
@XmlRootElement
public class UserTypeOption {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userTypeOptionId", columnDefinition="MEDIUMINT AUTO_INCREMENT")
	private Long userTypeOptionId;
	@Column(name="projectId", columnDefinition="MEDIUMINT NOT NULL")
	private Long projectId;
	@Column(name="userType", columnDefinition="VARCHAR(30)")
	private String userType;
	
	public UserTypeOption() {		
	}
	
	public UserTypeOption(Long userTypeOptionId, Long projectId, String userType) {
		this.userTypeOptionId = userTypeOptionId;
		this.projectId = projectId;
		this.userType = userType;
	}
	
	public UserTypeOption(Long projectId, String userType) {
		this.projectId = projectId;
		this.userType = userType;
	}	
	
	public Long getuserTypeOptionId() {
		return userTypeOptionId;
	}
	public void setUserTypeId(Long userTypeOptionId) {
		this.userTypeOptionId = userTypeOptionId;
	}
	public Long getProjectId() {
		return projectId;
	}
	public void setProjectId(Long projectId) {
		this.projectId = projectId;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}

}
