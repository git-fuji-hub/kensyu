package jp.co.aforce.beans;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginBean implements Serializable {

	private String username;
	private String password;
	private String msg;
	private String emsg;


	public LoginBean() {
	}


	public String getUsername(){
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword(){
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg=msg;
	}

	public String getEmsg() {
		return emsg;
	}

	public void setEmsg(String emsg) {
		this.emsg=emsg;
	}



}
