package com.homeWork2.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class AppInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        // rootConfig
        AnnotationConfigWebApplicationContext objRootContext = new AnnotationConfigWebApplicationContext();
        objRootContext.register(RootConfig.class);
        objRootContext.refresh();
        servletContext.addListener(new ContextLoaderListener((WebApplicationContext) objRootContext));

        // servletConfig
        AnnotationConfigWebApplicationContext objServletRegister = new AnnotationConfigWebApplicationContext();
        objServletRegister.register(ServletConfig.class);
        ServletRegistration.Dynamic objServletRegistration =
                servletContext.addServlet("servlet",new DispatcherServlet(objServletRegister));

        // loadOnStartUp
        objServletRegistration.setLoadOnStartup(1);

        // mapping
        objServletRegistration.addMapping("/");
    }
}
