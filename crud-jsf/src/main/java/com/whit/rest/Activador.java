package com.whit.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath(value = "api")
public class Activador extends Application{

	public Set<Class<?>> getClasses() {
        return new HashSet<Class<?>>(Arrays.asList(MessageRest.class));
    }
	
}
