/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.List;

/**
 *
 * @author xiaoya
 */
public class Police {
    String name;
    String address;
    String city;
    String id;
    List<Policeman> policemen;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Policeman> getPolicemen() {
        return policemen;
    }

    public void setPolicemen(List<Policeman> policemen) {
        this.policemen = policemen;
    }
    
    public void addPolice(Police p) {
        this.policemen.add(p);
    }
    
    public void deletePolice(Police p) {
        this.policemen.remove(p);
    }
}
