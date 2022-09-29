package com.bridgelab.practice;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface ValidateUserRegistration{
	boolean validate(String input);
}
public class UserRegistrationWithLambdaFunction {

	//lambda function to validate firstName
	static ValidateUserRegistration firstname = (input) -> {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	};
	//lambda function to validate lastName
	static ValidateUserRegistration lastname = (input) -> {
		Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	};
	//lambda function to validate email
	static ValidateUserRegistration email = (input) -> {
		Pattern pattern = Pattern.compile("^(abc)[.]?[a-z]*@(bl.co)[.]?[a-z]{0,2}$");
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	};
	//lambda function to validate phoneNumber
	static ValidateUserRegistration phonenumber = (input) -> {
		Pattern pattern = Pattern.compile("[0-9]{2} [0-9]{10}");
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	};
	//lambda function to validate password
	static ValidateUserRegistration password = (input) -> {
		Pattern pattern = Pattern.compile("[A-Z]+[0-9]+[@$&#]{1}\\w{5,}");
		Matcher matcher = pattern.matcher(input);
		return matcher.matches();
	};
	public static void main(String[] args) {
		
		System.out.println(firstname.validate("Sunil"));
		System.out.println(lastname.validate("Kumar"));
		System.out.println(email.validate("abc.xyz@bl.co.in"));
		System.out.println(phonenumber.validate("91 9164144279"));
		System.out.println(password.validate("A1@s7Yft"));
	}
}
