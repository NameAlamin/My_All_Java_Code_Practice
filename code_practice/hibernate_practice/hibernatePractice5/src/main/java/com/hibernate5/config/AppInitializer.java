package com.hibernate5.config;

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
        AnnotationConfigWebApplicationContext rootConfigRegister = new AnnotationConfigWebApplicationContext();
        rootConfigRegister.register(RootConfig.class);
        rootConfigRegister.refresh();
        servletContext.addListener(new ContextLoaderListener(rootConfigRegister));

        // servlet config
        AnnotationConfigWebApplicationContext servletConfigRegister = new AnnotationConfigWebApplicationContext();
        servletConfigRegister.register(ServletConfig.class);
        ServletRegistration.Dynamic registration = servletContext
                .addServlet("servlet",new DispatcherServlet(servletConfigRegister));

        // set load on start up
        registration.setLoadOnStartup(1);

        // mapping
        registration.addMapping("/");
    }
}
