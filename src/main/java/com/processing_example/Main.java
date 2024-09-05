package com.processing_example;

import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("com.processing_example.Main");
        System.out.println("Hello world!");
    }

    public void settings()
    {
        size(500,500);
    }

    public void setup()
    {
        background(0);
    }

    public void draw()
    {
        ellipse(width/2, height/2, width/2, height/2);
    }
}