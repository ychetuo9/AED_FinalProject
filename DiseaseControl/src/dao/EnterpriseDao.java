/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Enterprise;

/**
 *
 * @author yanyanchen
 */
public class EnterpriseDao {
    public static void save(Enterprise enterprise){
        String query = "insert into enterprise(name,city,type) values('"+enterprise.getName()+"','"+enterprise.getCity()+"','"+enterprise.getType()+"')";
        DbOperations.setDataOrDelete(query, "Enterprise Added Successfully!");
    }
    
    public static ArrayList<Enterprise> getAllRecords(){
        ArrayList<Enterprise> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from enterprise");
            while(rs.next()){
                Enterprise enterprise = new Enterprise();
                enterprise.setId(rs.getString("id"));
                enterprise.setName(rs.getString("name"));
                enterprise.setCity(rs.getString("city"));
                enterprise.setType(rs.getString("type"));

                arrayList.add(enterprise);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void delete(String id){
        String query ="delete from enterprise where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Enterprise Deleted Successfully!");
    }
    
    public static boolean isExisted(String name){
        boolean flag=false;
        ArrayList<Enterprise> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from enterprise where name='"+name+"'");
            while(rs.next()){
                Enterprise enterprise = new Enterprise();
                enterprise.setId(rs.getString("id"));
                enterprise.setName(rs.getString("name"));
                enterprise.setCity(rs.getString("city"));
                enterprise.setType(rs.getString("type"));

                arrayList.add(enterprise);
                
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        if(arrayList!=null&&arrayList.size()==0){
            flag=true;
        }
        return flag;
    }
}
