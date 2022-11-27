/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;
/**
 *
 * @author oooo
 */
public class TransportationOperatingEnterprise extends Enterprise{
    List<EmergencyVehicle> vehicles;

    public List<EmergencyVehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<EmergencyVehicle> vehicles) {
        this.vehicles = vehicles;
    }
    
    public void add(EmergencyVehicle v) {
        this.vehicles.add(v);
    }
    
    public void delete(EmergencyVehicle v) {
        this.vehicles.remove(v);
    }

}
