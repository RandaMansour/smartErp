package edu.espritCs.smartErpWeb.ctr;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import edu.espritCs.smartErpEJB.services.UserAuthenticationServiceLocal;
@ManagedBean
@SessionScoped
public class AuthenticationCtr {

	private String userLogin;
	private String userPassword;

	/**
	 * Proxy injection
	 */
	@EJB
	
	private UserAuthenticationServiceLocal userAuthenticationServiceLocal;

	public String doSignIn() {
		String strResult = "KO";
		if (userAuthenticationServiceLocal.signIn(userLogin, userPassword)) {
			strResult = "OK";
		}
		return strResult;
	}

	public String getUserLogin() {
		return userLogin;
	}

	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public UserAuthenticationServiceLocal getUserAuthenticationServiceLocal() {
		return userAuthenticationServiceLocal;
	}

	public void setUserAuthenticationServiceLocal(
			UserAuthenticationServiceLocal userAuthenticationServiceLocal) {
		this.userAuthenticationServiceLocal = userAuthenticationServiceLocal;
	}
	
	

}
