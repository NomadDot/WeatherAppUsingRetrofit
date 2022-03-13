package com.example.retrofitrxjavatestproject.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class WeatherData {

    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("current")
    @Expose
    private Current current;

    private boolean state = false;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public WeatherData withLocation(Location location) {
        this.location = location;
        return this;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public WeatherData withCurrent(Current current) {
        this.current = current;
        return this;
    }

    public boolean getState() {
        if(getLocation().getName() == null) {
            return state;
        }
        else {
            state = true;
            return state;
        }
    }

}