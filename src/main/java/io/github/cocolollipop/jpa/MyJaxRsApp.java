package io.github.cocolollipop.jpa;

import java.time.Instant;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("v1")
public class MyJaxRsApp extends Application {
	/** Empty. The server will then discover all resource classes automatically. */
	
}
