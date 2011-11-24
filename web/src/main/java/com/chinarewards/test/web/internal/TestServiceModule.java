package com.chinarewards.test.web.internal;

import static org.ops4j.peaberry.Peaberry.service;

import com.chinarewards.test.client.ExampleService;
import com.google.inject.AbstractModule;

public class TestServiceModule extends AbstractModule {

	@Override
	protected void configure() {
		/* Import */
		bind(ExampleService.class).toProvider(
				service(ExampleService.class).single());

	}

}
