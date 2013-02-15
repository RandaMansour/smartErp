package edu.espritCs.smartErpWeb.ctr;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/pages/*")
public class LoginFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(" url = "
				+ ((HttpServletRequest) servletRequest).getRequestURL());

		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;

		AuthenticationCtr loginBean = (AuthenticationCtr) request.getSession()
				.getAttribute("authenticationCtr");
		if (loginBean != null && loginBean.isLoggedIn()) {
			chain.doFilter(request, response);
		} else if (request.getRequestURL().toString().contains("login.jsf")) {
			chain.doFilter(request, response);

		} else {
			response.sendRedirect(request.getContextPath()
					+ "/pages/login.jsf");
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
