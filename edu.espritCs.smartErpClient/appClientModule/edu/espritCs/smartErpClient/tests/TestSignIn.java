package edu.espritCs.smartErpClient.tests;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.espritCs.smartErpEJB.services.UserAuthenticationServiceRemote;

public class TestSignIn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Context context = new InitialContext();
			UserAuthenticationServiceRemote authenticationServiceRemote = (UserAuthenticationServiceRemote) context
					.lookup("edu.espritCs.smartErp/edu.espritCs.smartErpEJB/UserAuthenticationService!edu.espritCs.smartErpEJB.services.UserAuthenticationServiceRemote");
			boolean signinResult = authenticationServiceRemote.signIn("a", "a");
			System.out.println(signinResult);

		} catch (NamingException e) {

			e.printStackTrace();
		}

	}

}
