package com.example.demo;

import java.lang.annotation.Documented;


import javax.validation.Constraint;
import javax.validation.Payload;





@Constraint(validatedBy = AuthorValidator.class)
@Documented
public @interface Author {
	
	String message() default "Author is not allowed";
	
	Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}


	