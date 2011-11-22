package com.chinarewards.test.eclipselink;

import java.util.Dictionary;
import java.util.Hashtable;

import javax.persistence.spi.PersistenceProvider;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

/**
 * @author kmtong
 */
public class Activator implements BundleActivator {
	private static final String JAVAX_PERSISTENCE_PROVIDER_PROP = "javax.persistence.provider";
	private ServiceRegistration serviceRegistration;

	public void start(BundleContext context) throws Exception {
		org.eclipse.persistence.jpa.PersistenceProvider persistence = new org.eclipse.persistence.jpa.PersistenceProvider();
		Dictionary<String, String> props = new Hashtable<String, String>();
		props.put(JAVAX_PERSISTENCE_PROVIDER_PROP, persistence.getClass()
				.getName());
		serviceRegistration = context.registerService(
				PersistenceProvider.class.getName(), persistence, props);
	}

	public void stop(BundleContext context) throws Exception {
		serviceRegistration.unregister();
	}
}
