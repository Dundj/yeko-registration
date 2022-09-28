package com.nidservices.yekoregistration.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Table(name = "user", uniqueConstraints= @UniqueConstraint(columnNames= "email"))
public class User implements Serializable {
	@Id
	public UUID id;
	
	private String userIdentifier;
	private String userType;
	private String userName;
	
//	@ManyToMany(fetch= FetchType.EAGER, cascade= CascadeType.ALL)
//	@JoinTable(
//			name= "users_roles",
//			joinColumns= @JoinColumn(
//					name= "user_id",
//					referencedColumnName= "id"),
//			inverseJoinColumns= @JoinColumn(
//					name= "role_id",
//					referencedColumnName= "id")
//			)
//	private Collection<Role> roles;
	
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String[] phones;
	private String[] adresses;
	private String companyRegistrationNumber;
	
	
	
	/* Application user type constructor */
	
	public User(UUID id, String userIdentifier, String userType, String userName) {
		this.id = id;
	    this.userIdentifier= userIdentifier;
	    this.userType= userType;
	    this.userName= userName;
				
	}
	
	/* Admin user type constructor */
	
	public User(UUID id, String userIdentifier, String userType, String userName, String email) {
		this.id = id;
	    this.userIdentifier= userIdentifier;
	    this.userType= userType;
	    this.userName= userName;
	    this.email= email;
				
	}
	
	/* Customer user type constructor */
	
	public User(UUID id, 
			    String userIdentifier, 
			    String userType, 
			    String userName, 
			    String firstName, 
			    String lastName, 
			    String email,
			    String[] phones,
			    String[] adresses
			    
			) {
		this.id = id;
	    this.userIdentifier= userIdentifier;
	    this.userType= userType;
	    this.userName= userName;
	    this.firstName= firstName;
	    this.lastName= lastName;
	    this.email= email;
	    this.phones= phones;
	    this.adresses= adresses;
	}
	
/* Seller user type constructor */
	
	public User(UUID id, 
			    String userIdentifier, 
			    String userType, 
			    String userName, 
			    String firstName, 
			    String lastName, 
			    String email,
			    String[] phones,
			    String[] adresses,
			    String companyRegistrationNumber
			    
			) {
		this.id = id;
	    this.userIdentifier= userIdentifier;
	    this.userType= userType;
	    this.userName= userName;
	    this.firstName= firstName;
	    this.lastName= lastName;
	    this.email= email;
	    this.phones= phones;
	    this.adresses= adresses;
	    this.companyRegistrationNumber= companyRegistrationNumber;
	}
				
	
	/* Getter and Setter */
	
	public UUID getId() {
		return id;
	}
	
	
	public String getUserIdentifier() {
		return userIdentifier;
	}
	
	public void setUserIdentifier(String userIdentifier) {
		this.userIdentifier = userIdentifier;
	}
	
	public String getUserType() {
		return userType;
	}
	
	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", userIdentifier=" + userIdentifier + ", UserType=" + userType + "]";
		
	}

	public String getUsername() {
		return userName;
	}

	public void setUsername(String username) {
		this.userName = username;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String[] getPhones() {
		return phones;
	}

	public void setPhones(String[] telephones) {
		this.phones = telephones;
	}

	public String[] getAdresses() {
		return adresses;
	}

	public void setAdresses(String[] adresses) {
		this.adresses = adresses;
	}

	public String getCompanyRegistrationNumber() {
		return companyRegistrationNumber;
	}

	public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
		this.companyRegistrationNumber = companyRegistrationNumber;
	}

}
