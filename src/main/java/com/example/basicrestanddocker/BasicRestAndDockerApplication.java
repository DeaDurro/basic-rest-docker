/**
 * This package contains the main application classes.
 */
package com.example.basicrestanddocker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class.
 */
@SpringBootApplication

public class BasicRestAndDockerApplication {

    private BasicRestAndDockerApplication() {
        // private constructor to prevent instantiation
    }

    /**
     * Main method.
     * @param args Command line arguments.
     */

    public static void main(final String[] args) {
        SpringApplication.run(BasicRestAndDockerApplication.class, args);
    }

}
