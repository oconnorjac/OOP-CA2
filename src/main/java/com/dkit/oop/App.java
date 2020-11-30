package com.dkit.oop;

import java.util.ArrayList;

/**
 * OOP - CA#2 - Nov 2020
 * Your Name: JACQUELINE O'CONNOR
 * <p>
 * Your GitHub link: https://github.com/oconnorjac/OOP-CA2
 */
public class App
{
    public static void main(String[] args)
    {
        System.out.println("\n*** Property & Private Property- - App ***");
        App app = new App();
        app.start();
    }

    public void start()
    {
        System.out.println("Q1 - some simple tests");
        //ArrayList<String> facilities = new ArrayList<String>();
        //facilities.add("mains water");
        //facilities.add("electricity");
        //facilities.add("freehold");
        //facilities.add("private access");

        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130, facilities);
        System.out.println("Property p1 details:");
        System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea());

        p1.getFacilities().addFacility("electricity");

        System.out.println("Q2 - tests");


        System.out.println("Q3 - tests");


        System.out.println("Q4 - tests");


    }
}

