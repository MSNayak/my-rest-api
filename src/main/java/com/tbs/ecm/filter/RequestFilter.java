package com.tbs.ecm.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

import com.tbs.ecm.util.PropertyReaderUtil;

@Controller
public class RequestFilter implements Filter {

	@Override
	public void destroy() {

	}

	@Value("${db2.urls}")
	public String dbu;

	@Override
	public void doFilter(ServletRequest servletRequest,
			ServletResponse servletResponse, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request;
		HttpServletResponse response;
		if (servletRequest instanceof HttpServletRequest) {
			request = (HttpServletRequest) servletRequest;
			response = (HttpServletResponse) servletResponse;
			try {
				String key = request.getHeader("Authorization");
				String secureKey = PropertyReaderUtil
						.getProperty("app.secure.key");
				if (StringUtils.isNotBlank(secureKey) && key.equals(secureKey)) {
					chain.doFilter(servletRequest, servletResponse);
				} else {
					response.sendError(HttpServletResponse.SC_BAD_REQUEST,
							"Unauthorized Request.");
				}
			} catch (Exception ex) {
				response.sendError(
						HttpServletResponse.SC_INTERNAL_SERVER_ERROR,
						ex.getMessage());
			}
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {

	}

}
