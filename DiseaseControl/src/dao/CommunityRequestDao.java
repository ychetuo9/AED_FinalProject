/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Request;

/**
 *
 * @author yanyanchen
 */
public class CommunityRequestDao {
    public static void saveRequest(Request request){
        String query = "insert into request(name,date,patientNumber,victim,location,description,requestObject,status) values('"+request.getName()+"','"+request.getDate()+"','"+request.getPatientNumber()+"','"+request.getVictim()+"','"+request.getLocation()+"','"+request.getDescription()+"','"+request.getRequestObject()+"','"+request.getStatus()+"')";
        DbOperations.setDataOrDelete(query, "Request Added Successfully!");
    }
    
    public static ArrayList<Request> getAllRecords(){
        ArrayList<Request> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from request");
            while(rs.next()){
                Request request = new Request();
                request.setId(rs.getString("id"));
                request.setName(rs.getString("name"));
                request.setDate(rs.getString("date"));
                request.setPatientNumber(rs.getString("patientNumber"));
                request.setVictim(rs.getString("victim"));
                request.setLocation(rs.getString("location"));
                request.setDescription(rs.getString("description"));
                request.setRequestObject(rs.getString("requestObject"));
                request.setStatus(rs.getString("status"));
                arrayList.add(request);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static ArrayList<Request> getAssociatedRecords(String name){
        ArrayList<Request> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from request where requestObject='"+name+"'");
            while(rs.next()){
                Request request = new Request();
                request.setId(rs.getString("id"));
                request.setName(rs.getString("name"));
                request.setDate(rs.getString("date"));
                request.setPatientNumber(rs.getString("patientNumber"));
                request.setVictim(rs.getString("victim"));
                request.setLocation(rs.getString("location"));
                request.setDescription(rs.getString("description"));
                request.setRequestObject(rs.getString("requestObject"));
                request.setStatus(rs.getString("status"));
                arrayList.add(request);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void delete(String id){
        String query ="delete from request where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Request Deleted Successfully!");
    }
    
    public static void assignTo(String id,String assignObject){
        String query="update request set requestObject='"+assignObject+"' where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Assigned this task to "+assignObject+" Successfully!");
    }
}
