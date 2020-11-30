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

        //part 6
        double tax = p1.calculateTax();
        System.out.println("tax on p1: "+tax);

        System.out.println("Q2 - tests");
        ArrayList<Property> properties = new ArrayList<>();
        properties.add(p1);
        properties.add(p2);
        properties.add(p3);

        System.out.println("DISPLAY PROPERTIES ");
        displayAllProperties(properties);

        System.out.println("\nSELLING ABOVE");
        ArrayList<Property> sellingAbove = getPropertiesPriceAbove(properties,260000);
        displayAllProperties(sellingAbove);


        System.out.println("\n\nQ3 - tests");
        PrivateProperty pp1 = new PrivateProperty(8, "Joe Smith", "A98AB82", 285000, 130, facilities,5,PropertyType.APARTMENT);
        System.out.println(pp1);
        properties.add(pp1);
        PrivateProperty pp2 = new PrivateProperty(9, "Mike Smith", "A98TG82", 250000, 420, facilities,3,PropertyType.SEMI_D);
        PrivateProperty pp3 = new PrivateProperty(10, "Joe Bloggs", "A944B8G", 310000, 190, facilities,2,PropertyType.DETACHED);
        properties.add(pp2);
        properties.add(pp3);

        //5.	In a code comment, explain how equals() (based only on owner
        // and propertyID) and hashCode() should be dealt with in this
        // PrivateProperty class ........
        //
        // ANSWER: Due to polymorphism, in order to check whether they're equal,
        // you need to use "instanceof" and cast the properties array to a
        // PrivateProperty type

        System.out.println("PART 6 = ID AND TAX : ");
        System.out.println("ID : "+p1.getPropertyID()+" Tax: "+p1.calculateTax());
        System.out.println("ID : "+pp3.getPropertyID()+" Tax: "+pp3.calculateTax());

        System.out.println("\n\nQ4 - tests");
        displayAllProperties(properties);

        System.out.println("DISPLAY PROP ID & TAX ");
        for (Property p : properties) {
            if (p instanceof PrivateProperty) {
                System.out.print("Property ID "+p.getPropertyID() + "\t");
                PrivateProperty pp = (PrivateProperty) p;
                System.out.print("Tax :"+pp.calculateTax()+"\n");
            }
        }

    }

    public static void displayAllProperties(ArrayList<Property> p){

        for(Property property : p){
            System.out.print(property);
        }

    }

    public ArrayList<Property> getPropertiesPriceAbove(ArrayList<Property> p,double boundary){

        ArrayList<Property> sellingAbove = new ArrayList<>();

        for(Property prop : p ){
            if(prop.getSellingPrice()>boundary) {
                sellingAbove.add(prop);
            }
        }
        return sellingAbove;
    }
}

