package com.bridgelabz.userregistrationusinglambda;
@FunctionalInterface
interface UserDetailsValidationIF{
	public boolean validate(String x) throws UserValidationException;
}
public class UserValidation {
		UserDetailsValidationIF validateFirstName = name->{
			try {
				if(name.length()==0) {
					throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid First Name. EMPTY First Name Entered.");
				}
				String firstNameRegex = "^[A-Z]{1}[a-z]{2,}$";
				return name.matches(firstNameRegex);
			}
			catch(NullPointerException e) {
				throw new UserValidationException(ExceptionType.ENTERED_NULL,"Please Enter Valid First  Name. NULL First Name Entered.");
			}
		};
		UserDetailsValidationIF validateLastName = name->{
			try {
				if(name.length()==0) {
					throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid Last Name. EMPTY Last Name Entered.");
				}
				String lastNameRegex = "^[A-Z]{1}[a-z]{2,}$";
				return name.matches(lastNameRegex);
			}
			catch(NullPointerException e) {
				throw new UserValidationException(ExceptionType.ENTERED_NULL,"Please Enter Valid Last Name. NULL Last Name Entered.");
			}
		};
		
		UserDetailsValidationIF validateEmail = email->{
			try {
				if(email.length()==0) {
					throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid Email Address. EMPTY Email Address Entered.");
				}
				String emailRegex = "^[a-zA-Z]+[a-zA-Z0-9]*[- . + _ *]?[a-zA-Z0-9]+[@]{1}[a-z0-9]+[.]{1}[a-z]+[.]?[a-z]+$";
				return email.matches(emailRegex);
			}
			catch(NullPointerException e) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid Email Address. EMPTY Email Address Entered.");
			}
		};
		UserDetailsValidationIF validateMobileNumber = mobileNumber->{
			try {
				if(mobileNumber.length()==0) {
					throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid mobile Number. EMPTY mobile Number Entered.");
				}
				String mobileNumberRegex = "^[0-9]{2}\\s[0-9]{10}$";
				return mobileNumber.matches(mobileNumberRegex);
			}
			catch(NullPointerException e) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid mobile Number. EMPTY mobile Number Entered.");
			}
		};
		UserDetailsValidationIF validatePassword = password->{
			try {
				if(password.length()==0) {
					throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid mobile Number. EMPTY mobile Number Entered.");
				}
				String passwordRegex = "^(?=.*[A-Z])(?=.*[0-9])(?=.{8,}$)[a-zA-Z0-9]*[@#$%^&-+=()][a-zA-Z0-9]*$";
				return password.matches(passwordRegex);
			}
			catch(NullPointerException e) {
				throw new UserValidationException(ExceptionType.ENTERED_EMPTY,"Please Enter Valid mobile Number. EMPTY mobile Number Entered.");
			}
		};
}
