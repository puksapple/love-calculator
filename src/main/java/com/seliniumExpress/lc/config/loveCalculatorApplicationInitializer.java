package com.seliniumExpress.lc.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class loveCalculatorApplicationInitializer {

	public void onStartup(ServletContext servletContext) throws ServletException {
		//confifuring location for config file which is serached by dispatcher servlet at first
		AnnotationConfigWebApplicationContext con=new AnnotationConfigWebApplicationContext();
		con.register(loveCalcConfig.class);
		
		//creating dispatcher servlet object
		DispatcherServlet dis=new DispatcherServlet(con);
		ServletRegistration.Dynamic myCustomServlet=servletContext.addServlet("mydispatcher-servlet",dis);
		myCustomServlet.setLoadOnStartup(1);
		myCustomServlet.addMapping("/mywebsite.com/*");
		
		
	}

}
