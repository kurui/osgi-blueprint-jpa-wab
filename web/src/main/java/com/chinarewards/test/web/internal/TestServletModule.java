package com.chinarewards.test.web.internal;

import com.chinarewards.test.web.ExampleServlet;
import com.google.inject.servlet.ServletModule;

public class TestServletModule extends ServletModule {

	@Override
	protected void configureServlets() {
		System.out.println("===============================");
		System.out.println("Configuring Servlet......");
		serve("/example").with(ExampleServlet.class);
		System.out.println("===============================");
	}
}