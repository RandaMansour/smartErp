package edu.espritCs.smartErpEJB.services;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.espritCs.smartErpEJB.entities.User;

/**
 * Session Bean implementation class UserAuthenticationService
 */
@Stateless
public class UserAuthenticationService implements
		UserAuthenticationServiceRemote, UserAuthenticationServiceLocal {

	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */

	public UserAuthenticationService() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean signIn(String login, String password) {

		String jpql = "SELECT u FROM User u WHERE u.login='" + login
				+ "' AND u.password='" + password + "'";
		System.out.println(jpql);

		Query query = entityManager.createQuery(jpql);
		Object object = null;
		try {
			object = query.getSingleResult();
		} catch (Exception e) {
			System.out.println("User not found !");
		}

		if (object instanceof User) {
			return true;
		} else {
			return false;
		}
	}

}
