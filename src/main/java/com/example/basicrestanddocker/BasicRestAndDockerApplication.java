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

    /**
     * Main method.
     * @param args Command line arguments.
     */

    public static void main(String[] args) {
        SpringApplication.run(BasicRestAndDockerApplication.class, args);
    }

}
