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
        ArrayList<String> facilities = new ArrayList<String>();


        Property p1 = new Property(1, "Mary Smith", "A91AB12", 255000, 130, facilities);
        System.out.println("Property p1 details:");
        System.out.println(p1.getPropertyID() + " : " + p1.getOwner() + " : " + p1.getPostcode() + " : " + p1.getSellingPrice() + " : " + p1.getArea());

        Property p2 = new Property(2,"John Smith","A4RD7T7",265000,250,facilities);

        Property p3 = new Property(3,"Jack Attack","A92ERF",585694,350,facilities);
        Property p4 = p3;
        Property p5 = new Property(3,"Jack Attack","A92ERF",585694,350,facilities);
        Property p6 = null;

        // part 3 and 4 tests
        p1.addFacility("electricity");
        p1.addFacility("mains water");
        p2.addFacility("electricity");
        p2.addFacility("freehold");
        p2.addFacility("private access");
        System.out.println("p1s facilities: "+p1.getFacilities());
        System.out.println("p2s facilities: "+p2.getFacilities());

        //part 5 tests
        System.out.println("p3==p4: "+(p3==p4));
        System.out.println("p3.equals(p4)"+p3.equals(p4));
        System.out.println("p3==p5: "+(p3==p5));
        System.out.println("p3.equals(p5)"+p3.equals(p5));

        System.out.println("Q2 - tests");


        System.out.println("Q3 - tests");


        System.out.println("Q4 - tests");


    }
}

