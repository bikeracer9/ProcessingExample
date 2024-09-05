package com.processing_example;
/*
 * Prescott Lau
 * "Hello World, Processing with Java in VSCode" Assignment
 * September 5th, 2024
 * This project uses Java to code and create a drawing in Processing.
 */
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