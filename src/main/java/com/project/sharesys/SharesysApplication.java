package com.project.sharesys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * @author GS
 */
@EnableCaching
@SpringBootApplication
public class SharesysApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharesysApplication.class, args);
    }

}
