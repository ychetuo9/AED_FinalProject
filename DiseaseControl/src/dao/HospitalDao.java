/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Hospital;

/**
 *
 * @author oooo
 */
public class HospitalDao {
    public static void save(Hospital hospital){
        String query = "insert into hospital(name) values('"+hospital.getName()+"')";
        DbOperations.setDataOrDelete(query, "Hospital Added Successfully!");
    }
    
    public static ArrayList<Hospital> getAllRecords(){
        ArrayList<Hospital> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from city");
            while(rs.next()){
                Hospital hospital = new Hospital();
                hospital.setId(rs.getString("id"));
                hospital.setName(rs.getString("name"));
                arrayList.add(hospital);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void delete(String id){
        String query ="delete from hospital where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Hospital Deleted Successfully!");
    }
}
