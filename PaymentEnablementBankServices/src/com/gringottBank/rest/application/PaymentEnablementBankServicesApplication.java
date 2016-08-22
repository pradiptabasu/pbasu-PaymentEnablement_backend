package com.gringottBank.rest.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.linking.DeclarativeLinkingFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

import com.gringottBank.jaxws.PaymentValidationServices;
import com.pradipta.apics.backend.MyObjectMapperProvider;

public class PaymentEnablementBankServicesApplication extends Application {
	public PaymentEnablementBankServicesApplication() {
		final Application application = new ResourceConfig().packages(
				"com.gringottBank.jaxws").register(
				DeclarativeLinkingFeature.class).register(JacksonFeature.class).register(MyObjectMapperProvider.class);
	}
//	public Set<Class<?>> getClasses() {
//        final Set<Class<?>> resources = new HashSet<Class<?>>();
//
//        // Add your resources.
//        resources.add(DeclarativeLinkingFeature.class);
//        resources.add(JacksonFeature.class);
//        resources.add(MyObjectMapperProvider.class);
//        resources.add(PublicCalculatorServiceImpl.class);
//       
//        return resources;
//    }
}
