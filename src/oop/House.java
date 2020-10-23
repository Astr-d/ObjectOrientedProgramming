package oop;

//En klass innan det blir ett objekt
//Vi ska skapa en ritning för objekten
//Ritningen på huset men det är inte huset.

//POJO klass - Plain Old Java Objec

public class House {

    //Variabler för huset
    private int id;
    private String city;
    private String colour;
    private int price;

    public static int idCounter = 1;

    //to String - denna kan vi ändra själva
    @Override
    public String toString() {
        return "\nid (" + id +") " +"\nHouse in the municipality of " +  city
                +"\nColour: " + colour
                +"\nPrice: " + price + "kr" + "\n";
    }
    //Konstruktorn körs vid skapandet av objektet  (new) House();
    public House(String colour, String city, int price, int id) {

        this.id = idCounter;
        idCounter += 1;

        this.colour = colour;
        this.city = city;
        this.price = price;




    }
}