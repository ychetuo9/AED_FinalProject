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
public class PublicHealthOperatingEnterprise {
    private List<VaccinateUnit> vaccinateunits;
    private List<Police> polices;
    private List<Community> communities;
    
    public PublicHealthOperatingEnterprise() {
        this.communities = new ArrayList<>();
        this.polices = new ArrayList<>();
        this.vaccinateunits = new ArrayList<>();
    };

    public List<VaccinateUnit> getVaccinateunits() {
        return vaccinateunits;
    }

    public void setVaccinateunits(List<VaccinateUnit> vaccinateunits) {
        this.vaccinateunits = vaccinateunits;
    }

    public List<Police> getPolices() {
        return polices;
    }

    public void setPolices(List<Police> polices) {
        this.polices = polices;
    }

    public List<Community> getCommunities() {
        return communities;
    }

    public void setCommunities(List<Community> communities) {
        this.communities = communities;
    }
    
    public void addCommunity(Community c) {
        this.communities.add(c);
    }
    
    public void deleteCommunity(Community c) {
        this.communities.remove(c);
    }
    
    public void addPolice(Police p) {
        this.polices.add(p);
    }
    
    public void deletePolice(Police p) {
        this.polices.remove(p);
    }
    
    public void addVaccinateUnit(VaccinateUnit v) {
        this.vaccinateunits.add(v);
    }
    
    public void deleteVaccinateUnit(VaccinateUnit v) {
        this.vaccinateunits.remove(v);
    }
}
