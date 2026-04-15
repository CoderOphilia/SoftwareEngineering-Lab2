package org.example.lab1_introductiontothymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.hibernate.autoconfigure.HibernateJpaAutoConfiguration;
import org.springframework.boot.jdbc.autoconfigure.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class
})
public class Lab1IntroductionToThymeLeafApplication {

    public static void main(String[] args) {
        SpringApplication.run(Lab1IntroductionToThymeLeafApplication.class, args);
    }

}
