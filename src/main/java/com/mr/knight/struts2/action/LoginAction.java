package com.mr.knight.struts2.action;

import org.apache.log4j.Logger;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;

import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

/**
 * Notice the @Action annotation where action and result pages are declared Also
 * notice that we don't need to implement Action interface or extend
 * ActionSupport class, only we need is an execute() method with same signature
 * 
 * @author jf
 *
 */
@Action(value = "login", results = { @Result(name = "SUCCESS", location = "welcome.jsp"),
		@Result(name = "ERROR", location = "error.jsp"), @Result(name = "INPUT", location = "login.jsp") })
@Namespaces(value = { @Namespace("/User") })
public class LoginAction {
	final static Logger logger = Logger.getLogger(LoginAction.class);

	public String execute() throws Exception {
		logger.debug("Execute");
		if ("jose".equals(getName()) && "admin".equals(getPwd())) {
			logger.debug("Success");
			return "SUCCESS";
		} else {
			logger.debug("Error validating");
			return "INPUT";
		}
	}

	// Java Bean to hold the form parameters
	private String name;
	private String pwd;

	public String getName() {
		return name;
	}

	@RequiredStringValidator(message = "Please enter VALID NAME.")
	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	@RequiredStringValidator(message = "Please enter your PASS.")
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}