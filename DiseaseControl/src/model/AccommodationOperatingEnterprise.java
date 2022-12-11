/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author yanyanchen
 */
public class AccommodationOperatingEnterprise {
    private ArrayList<Hotel> hotels;

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }
    
    public void addHotel(Hotel hotel) {
        this.hotels.add(hotel);
    }
    
    public void deleteHotel(Hotel hotel) {
        this.hotels.remove(hotel);
    }
}
