package com.example.daher928.bmw_display_system;

import java.util.HashMap;
import java.util.Map;

public class SensorConfiguration {

    private int color;
    private double maxY;
    private double resolution;

    public SensorConfiguration(int color, double maxY, double resolution) {
        this.color = color;
        this.maxY = maxY;
        this.resolution = resolution;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public double getMaxY() {
        return maxY;
    }

    public void setMaxY(double maxY) {
        this.maxY = maxY;
    }

    public double getResolution() {
        return resolution;
    }

    public void setResolution(double resolution) {
        this.resolution = resolution;
    }

    public Map<String, Object> sensorConfigMap(){
        Map<String, Object> map = new HashMap<>();
        map.put("maxY", maxY);
        map.put("color", color);
        map.put("resolution", resolution);
        return map;
    }

}
