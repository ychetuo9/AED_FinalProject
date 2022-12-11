/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.*;
/**
 *
 * @author yanyanchen
 */
public class TransportationOperatingEnterprise {
    private List<EmergencyVehicle> emergencyVehicles;
    
    public void TransportationOperatingEnterprise() {
        this.emergencyVehicles = new ArrayList<>();
    }

    public List<EmergencyVehicle> getEmergencyVehicles() {
        return emergencyVehicles;
    }

    public void setEmergencyVehicles(List<EmergencyVehicle> emergencyVehicles) {
        this.emergencyVehicles = emergencyVehicles;
    }
    
    public void addEmergencyVehicle(EmergencyVehicle v) {
        this.emergencyVehicles.add(v);
    }
    
    public void deleteEmergencyVehicle(EmergencyVehicle v) {
        this.emergencyVehicles.remove(v);
    }
}
