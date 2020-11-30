/**
 * OOP - CA#2 - Nov 2020
 * Your Name: JACQUELINE O'CONNOR
 * <p>
 * Your GitHub link: https://github.com/oconnorjac/OOP-CA2
 */
package com.dkit.oop;

import java.util.ArrayList;

public class Property
{
    private int propertyID;
    private String owner;
    private String postcode;
    private double sellingPrice;
    private double area;
    private ArrayList<ArrayList<String>> facilities;

    /**
     * Constructor
     * @param propertyID
     * @param owner
     * @param postcode
     * @param sellingPrice
     * @param area
     * @param facilities
     */
    public Property(int propertyID, String owner, String postcode, double sellingPrice, double area, ArrayList<ArrayList<String>> facilities)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.facilities = facilities;
        this.sellingPrice = 0;
        this.area = area;
    }

    /**
     * Methods
     */
    private void addFacility(String facility){
        this.getFacilities().add(facility);
    }


    public ArrayList<ArrayList<String>> getFacilities() {
        return facilities;
    }

    /**
     * Getters & Setters
     */

    public int getPropertyID()
    {
        return propertyID;
    }

    public void setPropertyID(int propertyID)
    {
        this.propertyID = propertyID;
    }

    public String getOwner()
    {
        return owner;
    }

    public void setOwner(String owner)
    {
        this.owner = owner;
    }

    public String getPostcode()
    {
        return postcode;
    }

    public void setPostcode(String postcode)
    {
        this.postcode = postcode;
    }

    public double getSellingPrice()
    {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice)
    {
        this.sellingPrice = sellingPrice;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

}
