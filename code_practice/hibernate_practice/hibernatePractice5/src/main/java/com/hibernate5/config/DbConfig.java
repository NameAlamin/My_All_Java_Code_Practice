package com.hibernate5.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DbConfig {
    @Autowired
    private ApplicationContext context;


    // nicher bin ey error ase getSessionFactory() hobe getSessionFactoryBean() hobe na...
//    @Bean
//    @Qualifier("sessionFactory")
//    public LocalSessionFactoryBean getSessionFactoryBean() {
//        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
//        factoryBean.setConfigLocation(context.getResource("classpath:hbm.cfg.xml"));
//        factoryBean.setPackagesToScan("com.sprint_and_hibernate_tutorial.entity");
//        return factoryBean;
//    }

    @Bean
    @Qualifier("sessionFactory")
    public LocalSessionFactoryBean getSessionFactory(){
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        factoryBean.setConfigLocation(context.getResource("classpath:hbm.cfg.xml"));
        factoryBean.setPackagesToScan("com.hibernate5.entity");
        return factoryBean;
    }

    @Bean
    public HibernateTransactionManager getTransactionManager(){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }

}
