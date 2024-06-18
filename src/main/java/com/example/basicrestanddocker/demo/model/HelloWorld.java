/**
 * This package contains the main application classes.
 */

package com.example.basicrestanddocker.demo.model;


public class HelloWorld {
    private int id;
    private String helloworld;


    public HelloWorld(int id, String helloworld) {
        this.id = id;
        this.helloworld = helloworld;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getHelloworld() {
        return helloworld;
    }

    public void setHelloworld(String helloworld) {
        this.helloworld = helloworld;
    }
}
