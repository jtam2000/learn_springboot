package com.github.jtam2000.support.financialentities;

import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Component
@Entity
public class InvestmentUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userID;

    private String userName;
    private LocalDate userCreationDate;
    private String referringAgency;

    public InvestmentUser(String name, LocalDate createDate, String referringAgency ){

        this.userCreationDate = createDate;
        this.userName = name;
        this.referringAgency = referringAgency;
    }

    protected InvestmentUser(){}

    @Override
    public String toString() {

        return "InvestmentUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", userCreationDate=" + userCreationDate +
                ", referringAgency='" + referringAgency + '\'' +
                '}';
    }
}
