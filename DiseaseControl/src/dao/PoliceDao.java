/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Police;

/**
 *
 * @author xiaoya
 */
public class PoliceDao {
    public static void save(Police police){
        String query = "insert into police(name) values('"+police.getName()+"','"+police.getCity()+"')";
        DbOperations.setDataOrDelete(query, "Police Added Successfully!");
    }
    
    public static ArrayList<Police> getAllRecords(){
        ArrayList<Police> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from city");
            while(rs.next()){
                Police police = new Police();
                police.setId(rs.getString("id"));
                police.setName(rs.getString("name"));
                police.setCity(rs.getString("city"));

                arrayList.add(police);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void delete(String id){
        String query ="delete from police where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Police Deleted Successfully!");
    }
}
