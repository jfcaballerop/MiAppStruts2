package com.mr.knight.struts2.action;

import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;
import org.apache.struts2.convention.annotation.Results;

import com.mr.knight.beans.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;

@org.apache.struts2.convention.annotation.Action("loginModelDriven")
@Namespace("/User")
@ResultPath("/")
@Results({ @Result(name = "success", location = "homeModelDriven.jsp"),
        @Result(name = "input", location = "loginModelDriven.jsp") })
public class LoginModelDrivenAction implements Action, ModelDriven<User> {
 
    @Override
    public String execute() throws Exception {
        if("jose".equals(user.getUserID()) && "admin".equals(user.getPassword())){
            user.setUserName("Jose Caballero");
            return SUCCESS;
        }else{
            return INPUT;
        }
    }
 
    @Override
    public User getModel() {
        return user;
    }
     
    private User user = new User();
 
}