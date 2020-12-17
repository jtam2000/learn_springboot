package com.github.jtam2000;

import com.github.jtam2000.support.financialentities.InvestmentUser;
import com.github.jtam2000.support.jparepository.InvestmentUserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class InitializrApplication {

    private static final Logger log = LoggerFactory.getLogger(InitializrApplication.class);


    public static void main(String[] args) {

        SpringApplication.run(InitializrApplication.class, args);

        System.out.println("Jason's first Spring Boot Application");
    }

    @Bean
    public CommandLineRunner demo(InvestmentUserRepository repository) {

        return (args) -> {
            repository.save(new InvestmentUser("Jason Tam",
                    LocalDate.of(2019, 6, 25),
                    "JPM"));
            repository.save(new InvestmentUser("Linda Tam",
                    LocalDate.of(2017, 6, 15),
                    "GS"));

            repository.findAll().forEach(
                    user -> log.info("investmentUser is: " + user));
        };
    }

}
