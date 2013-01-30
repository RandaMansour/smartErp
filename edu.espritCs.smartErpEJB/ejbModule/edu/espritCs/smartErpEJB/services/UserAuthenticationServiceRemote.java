package edu.espritCs.smartErpEJB.services;

import javax.ejb.Remote;

@Remote
public interface UserAuthenticationServiceRemote {
	public boolean signIn(String login, String password);
}
