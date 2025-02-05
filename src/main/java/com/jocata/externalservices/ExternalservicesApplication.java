package com.jocata.externalservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(exclude = {JpaRepositoriesAutoConfiguration.class})
@ComponentScan("com.jocata.externalservices")
public class ExternalservicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExternalservicesApplication.class, args);
    }
}
