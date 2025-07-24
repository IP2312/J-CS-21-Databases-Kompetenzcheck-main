package org.example.model;


import org.example.util.Util;

public class PM {
    private int id;
    private String location;
    Util util = new Util();

    public PM(int id, String location) {
        this.id = id;
        setLocation(location);
    }

    public PM(String location) {
       setLocation(location);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        if (location == null || location.isBlank()){
            throw new IllegalArgumentException("Location can't be null or blank!");
        }
        this.location =  util.capitalize(location);
    }



}
