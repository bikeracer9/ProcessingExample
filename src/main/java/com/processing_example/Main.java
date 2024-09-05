/*
 * Prescott Lau
 * "Hello World, Processing with Java in VSCode" Assignment
 * September 5th, 2024
 * This project imports Processing into VSCode and uses Java to code a drawing of a house.
 * 
 * Click multiple times on the screen to change the background color to visualize a sunset.
 */

package com.processing_example;

import processing.core.PApplet;

public class Main extends PApplet {
    public static void main(String[] args) {
        PApplet.main("com.processing_example.Main");
        System.out.println("Hello world!");
    }

    public void settings()
    {
        size(800, 800);
    }

//--------------------------------
    int counter = 0; //counter to see which color for the background to use. 
    int backColor = color(29, 144, 245); //blue, sky background color

    /*
     * This is the setup function
     */
    public void setup()
    {
       
    } 

    /*
    * This is the main draw function.
    */
    public void draw()
    {
        backgroundDraw();
        house();
    }
    
    /*
     * This method has the bulk of the code to create a house.
     */
    public void house()
    {
        noStroke();

        fill(35, 156, 14); //green color for the grass
        rect(0, 550, 800, 400); //grass

        stroke(0);
        strokeWeight(2);
        fill(186, 117, 13); //brown color for the house
        rect(270, 275, 300, 300); //body of the house

        fill(255); //white color for the house's roof
        triangle(180, 280, 425, 100, 680, 280); //house roof

        fill(255,0,0); //red color for the door
        rect(370, 375, 100, 200); //red door

        fill(0); //black
        circle(445,470,15); //door handle
    }

    /*
     * This is the mouseClicked method. 
     * 
     * Whenever you click on the screen, the background color changes to simulate a sunset.
     */
    public void mouseClicked()
    {
        counter++;

        if(counter >= 6)
        {
            counter = 0;
        }
    }

    /*
     * This method changes the background of the screen, which changes depending on the "counter"
     * variable which changes when you click the mouse.  
     */
    public void backgroundDraw()
    {
        background(backColor); //blue background color
        
        if (counter == 0)  
        {
            backColor = color(29, 144, 245); //blue sky color
        } 
        if (counter == 1)  
        {
            backColor = color(238, 175, 97); //light orange sky color
        }    
        if (counter == 2)  
        {
            backColor = color(251, 144, 98); //darker orange sky color
        }   
        if (counter == 3)  
        {
            backColor = color(238, 93, 107); //red sky color
        }   
        if (counter == 4)  
        {
            backColor = color(206, 73, 146); //light purple sky color
        }   
        if (counter == 5)  
        {
            backColor = color(105, 13, 131); //darker purple sky color
        }      
    }
}