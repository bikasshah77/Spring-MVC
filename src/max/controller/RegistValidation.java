package max.controller;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class RegistValidation implements Validator{

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public void validate(Object ob, Errors e) {
		// TODO Auto-generated method stub
		RegisterBean r=(RegisterBean) ob;
		String pass = r.getPass();
		String phone = r.getPhone();
		
		if(pass.length()<8) 
			e.rejectValue("pass","r.pass");
		if(phone.length()!=10)
			e.rejectValue("phone","r.phone");
	}

}
