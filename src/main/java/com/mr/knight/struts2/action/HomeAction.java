package com.mr.knight.struts2.action;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Actions;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Namespaces;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.ResultPath;

import com.opensymphony.xwork2.ActionSupport;
/**
 * An empty class for default Action implementation for:
 * 
 *  <action name="home">
 *      <result>/login.jsp</result>
 *  </action>
 * HomeAction class will be automatically mapped for home.action
 * Default page is login.jsp which will be served to client
 * @author jf
 *
 */

@Namespaces(value={@Namespace("/User")})
@Result(location="login.jsp")
@Actions(value={@Action(""),@Action("home")})
public class HomeAction extends ActionSupport{

}
