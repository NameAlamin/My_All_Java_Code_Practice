package com.sprint_and_hibernate_tutorial.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // root config
        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
        rootContext.register(RootConfig.class);
        rootContext.refresh();
        servletContext.addListener(new ContextLoaderListener(rootContext));

        // servlet config
        AnnotationConfigWebApplicationContext servletContextRegister = new AnnotationConfigWebApplicationContext();
        servletContextRegister.register(ServletConfig.class);
        ServletRegistration.Dynamic registration = servletContext
                .addServlet("servlet",new DispatcherServlet(servletContextRegister));

        // load on start up
        registration.setLoadOnStartup(1);

        // mapping
        registration.addMapping("/");

    }
}
