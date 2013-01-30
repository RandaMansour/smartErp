package edu.espritCs.smartErpEJB.services;

import javax.ejb.Local;

@Local
public interface UserAuthenticationServiceLocal {

	public boolean signIn(String login, String password);
}
