/**
 * OOP - CA#2 - Nov 2020
 * Your Name: JACQUELINE O'CONNOR
 * <p>
 * Your GitHub link: https://github.com/oconnorjac/OOP-CA2
 */
package com.dkit.oop;

import java.util.ArrayList;
import java.util.Objects;

public class Property
{
    private int propertyID;
    private String owner;
    private String postcode;
    private double sellingPrice;
    private double area;
    private ArrayList<String> facilities;

    /**
     * Constructor
     */
    public Property(int propertyID, String owner, String postcode, double sellingPrice, double area, ArrayList<String> facilities)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.facilities = facilities;
        this.sellingPrice = sellingPrice;
        this.area = area;
    }
    public Property(int propertyID, String owner, String postcode, double sellingPrice, double area)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.sellingPrice = sellingPrice;
        this.area = area;
    }
    public Property(int propertyID, String owner, String postcode, double area)
    {
        this.propertyID = propertyID;
        this.owner = owner;
        this.postcode = postcode;
        this.area = area;
    }

    /**
     * Public Methods
     */
    public void addFacility(String facility){
        this.facilities.add(facility);
    }

    public void removeFacility(String facility){
        //for(ArrayList<String> f : facilities){
            //if(f.contains(facility)){
                //facilities.remove(f);
           // }
       // }
    }


    /**
     * Getters & Setters
     */
    public ArrayList<String> getFacilities() {
        return facilities;
    }

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

    @Override
    public String toString() {
        return "\n"+ getClass().getSimpleName() + "{" +
                "propertyID=" + propertyID +
                ", owner='" + owner + '\'' +
                ", postcode='" + postcode + '\'' +
                ", sellingPrice=" + sellingPrice +
                ", area=" + area +
                ", facilities=" + facilities +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Property)) return false;
        Property property = (Property) o;
        return getPropertyID() == property.getPropertyID() &&
                Objects.equals(getOwner(), property.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getPropertyID(), getOwner());
    }
}
