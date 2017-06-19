package com.mr.knight.struts2.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.mr.knight.beans.User;
import com.opensymphony.xwork2.Action;

@org.apache.struts2.convention.annotation.Action("loginObject")
@Namespace("/User")
@ResultPath("/")
@Results({ @Result(name = "success", location = "homeObject.jsp"),
		@Result(name = "input", location = "loginObject.jsp") })
public class LoginObjectBackedAction implements Action {

	@Override
	public String execute() throws Exception {
		if ("jose".equals(getUser().getUserID()) && "admin".equals(getUser().getPassword())) {
			getUser().setUserName("Jose Caballero");
			return SUCCESS;
		} else {
			return INPUT;
		}
	}

	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}