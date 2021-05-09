package com.seliniumExpress.lc.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class lcConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] arr= {loveCalcConfig.class};
		return arr;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arr= {"/"};
		return arr;
	}

}
