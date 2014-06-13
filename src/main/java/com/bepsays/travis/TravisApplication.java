package com.bepsays.travis;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;

/**
 * Entry point app.
 *
 * @author bep
 * @since 2014-05-03
 */
public class TravisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravisConfig.class, args);
    }
}
