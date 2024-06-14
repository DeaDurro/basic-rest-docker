package com.example.basicrestanddocker.demo.model;


public class HelloWorld {
    private int Id;
    private String helloworld;


    public HelloWorld(int id, String helloworld) {
        this.Id = id;
        this.helloworld = helloworld;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }
    public String getHelloworld() {
        return helloworld;
    }

    public void setHelloworld(String helloworld) {
        this.helloworld = helloworld;
    }
}
