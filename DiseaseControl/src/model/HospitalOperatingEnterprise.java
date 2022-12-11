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
public class HospitalOperatingEnterprise {
    private ArrayList<Hospital> hospitals;

    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    
    public void addHospital(Hospital hospital) {
        this.hospitals.add(hospital);
    }
    
    public void deleteHospital(Hospital hospital) {
        this.hospitals.remove(hospital);
    }
}
