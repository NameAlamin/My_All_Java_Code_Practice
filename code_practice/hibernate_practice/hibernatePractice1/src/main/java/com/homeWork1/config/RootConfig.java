package com.homeWork1.config;


import com.homeWork1.service.Account;
import com.homeWork1.service.AccountService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(DbConfig.class)
@Configuration
//@ComponentScan(basePackages = {"com.homeWork1.controllers"})
public class RootConfig {
    @Bean
    public AccountService accountService(){
        Account account = new Account();
        account.setAccountId("1234");
        account.setAccountType("business");
        account.setAccountHolderName("alamin");
        return new AccountService(account);
    }
}