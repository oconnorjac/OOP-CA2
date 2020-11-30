/**
 * OOP - CA#2 - Nov 2020
 * Your Name: JACQUELINE O'CONNOR
 * <p>
 * Your GitHub link: https://github.com/oconnorjac/OOP-CA2
 */
package com.dkit.oop;

import java.util.ArrayList;
import java.util.Objects;

public class PrivateProperty extends Property{

    /**
     * fields
     */
    private int numBeds;
    private PropertyType type;

    /**
     *Constructors
     */
    public PrivateProperty(int propertyID, String owner, String postcode, double sellingPrice, double area, ArrayList<String> facilities, int numBeds, PropertyType type) {
        super(propertyID, owner, postcode, sellingPrice, area, facilities);
        this.numBeds = numBeds;
        this.type = type;
    }

    public PrivateProperty(int propertyID, String owner, String postcode, double sellingPrice, double area, int numBeds, PropertyType type) {
        super(propertyID, owner, postcode, sellingPrice, area);
        this.numBeds = numBeds;
        this.type = type;
    }

    public PrivateProperty(int propertyID, String owner, String postcode, double area, int numBeds, PropertyType type) {
        super(propertyID, owner, postcode, area);
        this.numBeds = numBeds;
        this.type = type;
    }

    /**
     * Methods
     */
    public double calculateTax(){
        return (25.00 * this.numBeds) + (super.getArea() * this.numBeds);
    }

    @Override
    public String toString() {
        return super.toString() +
                "numBeds=" + numBeds +
                ", type=" + type +
                '}';
    }
}
