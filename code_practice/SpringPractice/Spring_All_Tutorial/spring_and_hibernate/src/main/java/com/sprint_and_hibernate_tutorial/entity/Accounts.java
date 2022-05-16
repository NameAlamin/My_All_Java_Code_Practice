package com.sprint_and_hibernate_tutorial.entity;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class Accounts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "accountId")
    private long accontsId;

    public long getAccontsId() {
        return accontsId;
    }

    public void setAccontsId(long accontsId) {
        this.accontsId = accontsId;
    }

    @Column(name = "accountType")
    private String accountType;

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }
}
