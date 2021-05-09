package com.seliniumExpress.lc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.seliniumExpress.lc.Annotation.Age;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

public class AgeValidator implements ConstraintValidator<Age, Integer>{
	
	Integer upper;
	Integer Lower;
	public void initialize(Age age) {
		this.Lower=age.lower();
		this.upper=age.upper();
	}

	public boolean isValid(Integer age, ConstraintValidatorContext context) {
		if(age==null) {
			return false;
		}
		if(age<Lower || age>upper) {
		return false;
	}
		return true;

}
}
