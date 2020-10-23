package oop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        House house = new House("Rött", "Lund" , 750000, 1);
        House cottage = new House("Brunt", "Norrköping", 400000, 2);
        House mansion = new House("Gult", "Uppsala", 900000, 3);

        //Skapa en ArrayList som håller alla objekten av klassen "House"
        //Arraylist är också ett objekt av klassen ArrayList MEN som nån annan har skapat
        //Låna den
        ArrayList <House> houseList = new ArrayList<House>();

        //Vi har lägger till alla objekten av klassen "house" in i ArrayListan
        houseList.add(house);
        houseList.add(cottage);
        houseList.add(mansion);

        System.out.println(houseList);

    }

}
