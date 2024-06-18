/**
 * Model class for HelloWorld.
 */

package com.example.basicrestanddocker.demo.model;


public class HelloWorld {

    /**
     * The ID of the HelloWorld object.
     */
    private int id;
    /**
     * The message of the HelloWorld object.
     */
    private String helloworld;

    /**
     * Constructor for HelloWorld.
     *
     * @param id the id of the HelloWorld object.
     * @param helloworld the message of the HelloWorld object.
     */
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
