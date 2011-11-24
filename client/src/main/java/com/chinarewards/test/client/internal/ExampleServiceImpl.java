package com.chinarewards.test.client.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityManagerFactory;

import com.chinarewards.test.client.ExampleService;
import com.chinarewards.test.domain.Example;

/**
 * Internal implementation of our example OSGi service
 */
public final class ExampleServiceImpl implements ExampleService {
	EntityManagerFactory emf;

	// implementation methods go here...

	public EntityManagerFactory getEmf() {
		return emf;
	}

	public void setEmf(EntityManagerFactory emf) {
		System.out.println("Setting EMF: " + emf);
		this.emf = emf;
	}

	public String scramble(String text) {
		Example ex = new Example();
		emf.createEntityManager().persist(ex);
		System.out.println("Example ID: " + ex.getId());

		List charList = new ArrayList();

		char[] textChars = text.toCharArray();
		for (int i = 0; i < textChars.length; i++) {
			charList.add(new Character(textChars[i]));
		}

		Collections.shuffle(charList);

		char[] mixedChars = new char[text.length()];
		for (int i = 0; i < mixedChars.length; i++) {
			mixedChars[i] = ((Character) charList.get(i)).charValue();
		}

		return new String(mixedChars);
	}
}
