package com.mbsystems.ch03ex01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.mbsystems"})
public class Ch03Ex01Application {

    public static void main( String[] args ) {
        SpringApplication.run( Ch03Ex01Application.class, args );
    }

}
