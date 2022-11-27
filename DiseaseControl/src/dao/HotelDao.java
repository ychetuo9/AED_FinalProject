/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Hotel;

/**
 *
 * @author oooo
 */
public class HotelDao {
    public static void save(Hotel hotel){
        String query = "insert into hotel(name) values('"+hotel.getName()+"')";
        DbOperations.setDataOrDelete(query, "Hotel Added Successfully!");
    }
    
    public static ArrayList<Hotel> getAllRecords(){
        ArrayList<Hotel> arrayList = new ArrayList<>();
        try{
            ResultSet rs = DbOperations.getData("select *from hotel");
            while(rs.next()){
                Hotel hotel = new Hotel();
                hotel.setId(rs.getString("id"));
                hotel.setName(rs.getString("name"));
                arrayList.add(hotel);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void delete(String id){
        String query ="delete from hotel where id='"+id+"'";
        DbOperations.setDataOrDelete(query, "Hotel Deleted Successfully!");
    }
}
