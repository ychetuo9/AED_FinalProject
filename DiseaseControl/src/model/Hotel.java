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
public class Hotel {
    List<Patient> patients;
    public void accommodate(Patient p) {
        this.patients.add(p);
    }
    
    public void release(Patient p) {
        this.patients.remove(p);
    }
}
