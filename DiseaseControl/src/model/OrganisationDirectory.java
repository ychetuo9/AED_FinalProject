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
public class OrganisationDirectory {
    List<Organisation> organisations;

    public List<Organisation> getOrganisations() {
        return organisations;
    }

    public void setOrganisations(List<Organisation> organisations) {
        this.organisations = organisations;
    }
    
    public void add(Organisation org) {
        this.organisations.add(org);
    }
    
    public void delete(Organisation org) {
        this.organisations.remove(org);
    }
}
