/*
 * Prescott Lau
 * "Hello World, Processing with Java in VSCode" Assignment
 * September 5th, 2024
 * This project imports Processing into VSCode and uses Java to code a drawing of a sunflower.
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

    public void setup()
    {
       
    } 

    public void draw()
    {
        //backgroundDraw();
        flower();
    }
    
    /*
     * This method creates the flower.
     */
    public void flower()
    {
        noStroke();

        fill(11, 133, 59); //green fill
        beginShape(); //This shape is the right leaf of the flower.
        curveVertex(413, 543);
        curveVertex(425, 550);
        curveVertex(474, 508);
        curveVertex(557, 471);
        curveVertex(617, 491);
        curveVertex(608,536);
        curveVertex(550,594);
        curveVertex(483,645);
        curveVertex(422,690);
        curveVertex(483,645);
        endShape();

        fill(14,230,100); //green
        rect(350, 450, 75, 400); //base of the flower

        // fill(108, 235, 158); //lighter green
        // rect(355, 455, 25, 400, 20); //highlight of the base of the flower

        fill(3, 84, 35); //darker green
        rect(390, 485, 25, 375, 25); //shadow of the base of the flower
        
        //--
        fill(71, 42, 6); //dark brown color
        ellipse(395, 250, 250, 250); //dark brown big circle, in the very back

        fill(140, 78, 0); //lighter brown color
        ellipse(395, 250, 200, 200); //lighter brown middle circle, in the middle

        fill(71, 42, 6); //dark brown color
        ellipse(395, 250, 150, 150); //dark brown small middle circle 

        fill(51, 29, 1); //darker brown color
        ellipse(395, 250, 100, 100); //dark brown smaller middle circle (face of the sunflower)


        // beginShape();
        // curveVertex(483,645);
        // endShape();
    }

    /*
     * This is the mouseClicked method. 
     * I originally used this method, when I was trying to create the leaf and the flower petals.
     * So I used the line that is commented out with a "1" next to it to run the code and, when
     * clicking the mouse on the screen, it would tell me what the X and Y coordinates are, which
     * I then used to create the shapes - wherever you see "beginShape." 
     * 
     * I then have now used this function to change the background color, 
     * whenever you click on the screen.
     */
    public void mouseClicked()
    {
        println("x = " + mouseX + " y = " + mouseY); //1
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