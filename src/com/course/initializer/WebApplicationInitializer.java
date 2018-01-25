package com.course.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.course.config.MVCConfig;
import com.course.config.RootConfig;

public class WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		
		return new Class<?>[]{RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {MVCConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[]{"*.do"};
	}

}
