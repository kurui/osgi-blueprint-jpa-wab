package com.chinarewards.test.web.internal;

import com.google.inject.AbstractModule;

public class Module extends AbstractModule {

	@Override
	protected void configure() {
		install(new TestServiceModule());
		install(new TestServletModule());
	}

}
