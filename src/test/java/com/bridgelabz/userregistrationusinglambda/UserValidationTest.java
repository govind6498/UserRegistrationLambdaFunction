package com.bridgelabz.userregistrationusinglambda;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
	//	For First Name Testing
	@Test
	public void givenFirstName_WhenProper_ShouldReturnTrue() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateFirstName.validate("Govind");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenFirstName_WhenFirstLeterSmall_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateFirstName.validate("govind");
		Assert.assertFalse(isNotValid);
	}
	@Test
	public void givenFirstName_WhenCharacterLessThan2_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateFirstName.validate("Go");
		Assert.assertFalse(isNotValid);
	}
	//	for Last name Testing
	@Test
	public void givenLastName_WhenProper_ShouldReturnTrue() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateLastName.validate("Kumar");
		Assert.assertTrue(isValid);
	}

	@Test
	public void givenLastName_WhenFirstLeterSmall_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateLastName.validate("kumar");
		Assert.assertFalse(isNotValid);
	}
	@Test
	public void givenLastName_WhenCharacterLessThan2_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateLastName.validate("Ku");
		Assert.assertFalse(isNotValid);
	}
	//for Email testing
	public void givenEmailAddress_WhenProper_ShouldReturnTrue() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateEmail.validate("govindsingh6498@gmail.com");
		Assert.assertTrue(isValid);
	}
	public void givenEmail_WhenEmailNotProper_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateEmail.validate("govind6498gmail.com");
		Assert.assertTrue(isNotValid);
	}

	//for Email Mobile Number Testing
	public void givenMobileNumber_WhenProper_ShouldReturnTrue() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validateMobileNumber.validate("91 9798364309");
		Assert.assertTrue(isValid);
	}

	public void givenMobileNumber_WhenLessThanTenNumber_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid= userValidator.validateMobileNumber.validate("91 979364309");
		Assert.assertFalse(isNotValid);
	}
	public void givenMobileNumber_WhengreaterThanTenNumber_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateMobileNumber.validate("91 9793643090");
		Assert.assertFalse(isNotValid);
	}
	public void givenMobileNumber_WhenNotEnterCountryCode_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validateMobileNumber.validate("979364309");
		Assert.assertFalse(isNotValid);
	}

	//	for password Testing
	public void givenPassword_WhenProper_ShouldReturnTrue() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isValid = userValidator.validatePassword.validate("Govind@123");
		Assert.assertTrue(isValid);
	}
	public void givenPassword_WhenPasswordLengthlessThanEightCharacter_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword.validate("Govind@");
		Assert.assertFalse(isNotValid);
	}
	public void givenPassword_WhenNotPresentCapitalLetter_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword.validate("govind@1234");
		Assert.assertFalse(isNotValid);
	}
	public void givenPassword_WhenNotPresentSpecaiilCharacter_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword.validate("govind341234");
		Assert.assertFalse(isNotValid);
	}
	public void givenPassword_WhenNotPresentNumericCharacter_ShouldReturnFalse() throws UserValidationException {
		UserValidation userValidator = new UserValidation();
		boolean isNotValid = userValidator.validatePassword.validate("govind@ljsdfjslg");
		Assert.assertFalse(isNotValid);
	}
}
