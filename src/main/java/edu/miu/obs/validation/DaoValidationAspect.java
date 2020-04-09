package edu.miu.obs.validation;

import java.util.List;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.Validator;

/**
 * The Class DaoValidationAspect.
 * 
 * @author Elias Rurangwa
 * @version 1.0
 */
@Aspect
@Component
public class DaoValidationAspect {

	/** The validator. */
	@Autowired
	private Validator validator;

	/** The message accessor. */
	@Autowired
	MessageSourceAccessor messageAccessor;

	@Pointcut("execution(* edu.miu.obs.dao..*save(..))")
	public void applicationSave() {
	}

	@Pointcut("execution(* edu.miu.obs.dao..*update(..))")
	public void applicationUpdate() {
	}

	@Pointcut("args(object)")
	public void argsMethod(Object object) {
	}

	@Before("(applicationSave() || applicationUpdate()) && argsMethod(object)")
	public void doValidate(Object object) throws Throwable {

		System.out.println();
		System.out.println("DOING VALIDATION!");

		// Spring : BeanPropertyBindingResult- Default implementation of the Errors and
		// BindingResult interfaces
		Errors errors = new BeanPropertyBindingResult(object, object.getClass().getName());

		validator.validate(object, errors);

		if (errors.hasErrors()) {
			List<FieldError> fieldErrors = errors.getFieldErrors();
			for (FieldError fieldError : fieldErrors) {

				System.out.println(messageAccessor.getMessage(fieldError));
			}
			// "Caught" by MemberController - displays errors
			throw new ValidationException(errors);
		}

		return;
	}
}
