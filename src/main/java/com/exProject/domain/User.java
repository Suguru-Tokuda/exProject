package com.exProject.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Users")
@XmlRootElement(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="userId", columnDefinition="MEDIUMINT AUTO_INCREMENT")
	private Long userId;
	@Column(name="firstName", columnDefinition="VARCHAR(30) NOT NULL")
	private String firstName;
	@Column(name="lastName", columnDefinition="VARCHAR(30) NOT NULL")
	private String lastName;
	@Column(name="email", columnDefinition="VARCHAR(50) NOT NULL")
	private String email;
	@Column(name="password", columnDefinition="VARCHAR(255) NOT NULL")
	private String password;
	@Column(name="picture", nullable=true, columnDefinition="BLOB")
	private String picture;
	@Column(name="confirmed", columnDefinition="TINYINT(1) NOT NULL DEFAULT 0")
	private boolean confirmed;
	@Column(name="archived", columnDefinition="TINYINT(1) NOT NULL DEFAULT 0")
	private boolean archived;
	@Column(name="lastLoginDateTime", nullable=true)
	private Date lastLoginDateTime;
	@Column(name="token", nullable=true, length=255)
	private String token;
	
	public User() {
    }

    public User(Long userId) {
        this.userId = userId;
    }
    
    public User(Long userId, String firstName, String lastName, String email, String password, String picture, boolean confirmed, boolean archived, Date lastLoginDate, String token) {
    	this.userId = userId;
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.email = email;
    	this.password = password;
    	this.picture = picture;
    	this.confirmed = confirmed;
    	this.archived = archived;
    	this.lastLoginDateTime = lastLoginDate;
    	this.token = token;
    }
    
    public User(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.confirmed = false;
        this.archived = false;
    }

    public User(Long userId, String firstName, String lastName, String email, String password, boolean confirmed, boolean archived) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.confirmed = confirmed;
        this.archived = archived;
    }
    
    public User(Long userId, String firstName, String lastName, String email, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.confirmed = false;
        this.archived = false;
    }
    
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    public User(String email, String password, String token) {
        this.email = email;
        this.password = password;
        this.token = token;
    }
    
    public User(String email, String password, boolean confirmed) {
        this.email = email;
        this.password = password;
        this.confirmed = confirmed;
    }
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public boolean isConfirmed() {
		return confirmed;
	}
	public void setConfirmed(boolean confirmed) {
		this.confirmed = confirmed;
	}
	public boolean isArchived() {
		return archived;
	}
	public void setArchived(boolean archived) {
		this.archived = archived;
	}
	public Date getLastLoginDateTime() {
		return lastLoginDateTime;
	}
	public void setLastLoginDateTime(Date lastLoginDateTime) {
		this.lastLoginDateTime = lastLoginDateTime;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}

}
