package com.akhil.tutorEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

@Entity
public class TutorEntity 
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Integer id;
	 
	 @NotEmpty(message = "First Name should not be null")
	 @Size(min = 3 , max = 50 , message = "First name contains 3 to 50 characters only")
	 @Pattern(regexp = "^[a-zA-Z\\]+$", message = "Name must contain only letters, spaces, hyphens, and apostrophes")
	 private String firstName;
	 
	 @NotEmpty(message = "Last Name should not be null")
	 @Size(min = 3 , max = 50 , message = "Last name contains 3 to 50 characters only")
	 @Pattern(regexp = "^[a-zA-Z\\]+$", message = "Name must contain only letters, spaces, hyphens, and apostrophes")
	 private String lastName;
	 
	 @NotEmpty(message = "Email cannot be empty")
//	 @Email(message = "Email should be valid")
//	 @Pattern(regexp = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$", message = "Email must be a valid email address")
	 @Size(max = 100, message = "Email must be up to 100 characters")
	 @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9._%+-]*@email\\.(com|in)$",
	 			message = "Email must start with a letter and end with 'email.com' or 'email.in'")
	 private String email;
	 
	 @NotEmpty(message = "Password cannot be empty")
	 @Size(min = 8, message = "Password must be at least 8 characters long")
	 @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$",
	        message = "Password must contain at least one uppercase letter, one lowercase letter, one number, and one special character")
	 private String password;

	 @NotEmpty(message = "Address cannot be empty")
	 @Size(max = 255, message = "Address cannot be more than 255 characters")
	 @Pattern(regexp = "^[a-zA-Z0-9\\s,.'-]+$", 
	        message = "Address must contain only letters, numbers, spaces, commas, periods, apostrophes, and hyphens")
	 private String address;

	 @NotEmpty(message = "Phone number cannot be empty")
	 @Pattern(regexp = "^[6-9]\\d{9}$", 
	        message = "Phone number must be 10 digits long and start with a digit between 6 and 9")
	 private String phoneNumber;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public TutorEntity(Integer id,
			@NotEmpty(message = "First Name should not be null") @Size(min = 3, max = 50, message = "First name contains 3 to 50 characters only") @Pattern(regexp = "^[a-zA-Z\\]+$", message = "Name must contain only letters, spaces, hyphens, and apostrophes") String firstName,
			@NotEmpty(message = "Last Name should not be null") @Size(min = 3, max = 50, message = "Last name contains 3 to 50 characters only") @Pattern(regexp = "^[a-zA-Z\\]+$", message = "Name must contain only letters, spaces, hyphens, and apostrophes") String lastName,
			@NotEmpty(message = "Email cannot be empty") @Size(max = 100, message = "Email must be up to 100 characters") @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9._%+-]*@email\\.(com|in)$", message = "Email must start with a letter and end with 'email.com' or 'email.in'") String email,
			@NotEmpty(message = "Password cannot be empty") @Size(min = 8, message = "Password must be at least 8 characters long") @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$", message = "Password must contain at least one uppercase letter, one lowercase letter, one number, and one special character") String password,
			@NotEmpty(message = "Address cannot be empty") @Size(max = 255, message = "Address cannot be more than 255 characters") @Pattern(regexp = "^[a-zA-Z0-9\\s,.'-]+$", message = "Address must contain only letters, numbers, spaces, commas, periods, apostrophes, and hyphens") String address,
			@NotEmpty(message = "Phone number cannot be empty") @Pattern(regexp = "^[6-9]\\d{9}$", message = "Phone number must be 10 digits long and start with a digit between 6 and 9") String phoneNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}

	
}
