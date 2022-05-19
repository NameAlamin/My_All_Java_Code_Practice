package com.hibernate6;

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
        // rootConfig
        AnnotationConfigWebApplicationContext rootConfig = new AnnotationConfigWebApplicationContext();
        rootConfig.register(RootConfig.class);
        rootConfig.refresh();
        servletContext.addListener(new ContextLoaderListener(rootConfig));

        // servletConfig
        AnnotationConfigWebApplicationContext servletRigister = new AnnotationConfigWebApplicationContext();
        servletRigister.register(ServletConfig.class);
        ServletRegistration.Dynamic registration = servletContext
                .addServlet("servlet",new DispatcherServlet(servletRigister));

        registration.setLoadOnStartup(1);

        registration.addMapping("/");
    }
}
