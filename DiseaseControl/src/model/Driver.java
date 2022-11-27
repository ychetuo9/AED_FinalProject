/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author oooo
 */
public class Driver {
    String name;
    
    public void drive(EmergencyVehicle v, Hotel h) {
        for (Patient p : v.getPatients()) {
            h.accommodate(p);
        }
        v.getPatients().clear();
    }
}
