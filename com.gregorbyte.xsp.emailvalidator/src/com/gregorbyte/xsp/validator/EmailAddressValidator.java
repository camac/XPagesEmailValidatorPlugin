package com.gregorbyte.xsp.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

import com.ibm.commons.util.StringUtil;

public class EmailAddressValidator implements Validator {

	private final static String EMAIL_PATTERN = "[^\\s@]+@[^\\s@]+\\.[^\\s@]+";
	private final static Pattern EMAIL_COMPILED_PATTERN = Pattern
			.compile(EMAIL_PATTERN);

	public void validate(FacesContext context, UIComponent component, Object o)
			throws ValidatorException {
		if (o == null || StringUtil.isEmpty((String) o)) {
			return;
		}
		String trimmed = ((String) o).trim();
		Matcher matcher = EMAIL_COMPILED_PATTERN.matcher(trimmed);
		if (!matcher.matches()) {
			FacesMessage msg = new FacesMessage("Invalid email value!",
					"Supplied Email address is not in a valid format");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
	}

}
