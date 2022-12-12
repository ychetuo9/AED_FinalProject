/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author yanyanchen
 */
public class Tables {
    public static void main(String[] args){
        try{
            String userTable="create table user(id int AUTO_INCREMENT primary key,name varchar(200),email varchar(200),mobileNumber varchar(20),password varchar(200),city varchar(200),organization varchar(200),carrier varchar(200),location varchar(200),status varchar(200),role varchar(100),UNIQUE(name))";
            DbOperations.setDataOrDelete(userTable, "User Table Created Successfully");
            
//            added admin account information
            String adminDetails = "insert into user(name,email,mobileNumber,password,status,role,city,organization,carrier,location) values('Admin','admin@gmail.com','1234567890','admin','true','System Admin','Boston','System','Mint','12,1')";
            DbOperations.setDataOrDelete(adminDetails, "Admin Detials Added Successfully");
            
            String communityAdminDetails = "insert into user(name,email,mobileNumber,password,status,role,city,organization,carrier,location) values('CommunityAdmin','communityadmin@gmail.com','1234567890','admin','true','Community Head','Boston','Happiness Community','Mint','12,1')";
            DbOperations.setDataOrDelete(communityAdminDetails, "Community Admin Detials Added Successfully");
            
            String carAdminDetails = "insert into user(name,email,password,city,organization,role,carrier,mobileNumber,location,status) values('CarAdmin','ychetuo9@gmail.com','admin','Boston','Car Company','Car Admin','Mint','1234567890','12,1','true')";
            DbOperations.setDataOrDelete(carAdminDetails, "Car Admin Detials Added Successfully");
            
            String hospitalAdminDetails = "insert into user(name,email,mobileNumber,password,status,role,city,organization,carrier,location) values('HospitalAdmin','ychetuo9@gmail.com','1234567890','admin','true','Hospital Admin','Boston','Boston Hospital','Mint','12,1')";
            DbOperations.setDataOrDelete(hospitalAdminDetails, "Hospital Admin Detials Added Successfully");
            
            String hotelHeadDetails = "insert into user(name,email,mobileNumber,password,status,role,city,organization,carrier,location) values('HotelHead','ychetuo9@gmail.com','1234567890','admin','true','Hotel Head','Boston','Central Plaza','Mint','12,1')";
            DbOperations.setDataOrDelete(hotelHeadDetails, "Hotel Head Detials Added Successfully");
            
            String policeHeadDetails = "insert into user(name,email,mobileNumber,password,status,role,city,organization,carrier,location) values('PoliceHead','ychetuo9@gmail.com','1234567890','admin','true','Police Head','Boston','Boston Police','Mint','12,1')";
            DbOperations.setDataOrDelete(hotelHeadDetails, "Hotel Head Detials Added Successfully");
            
            String vaccinateHeadDetails = "insert into user(name,email,mobileNumber,password,status,role,city,organization,carrier,location) values('VaccinateHead','ychetuo9@gmail.com','1234567890','admin','true','Vaccinate Head','Boston','Boston Vaccinate','Mint','12,1')";
            DbOperations.setDataOrDelete(hotelHeadDetails, "Hotel Head Detials Added Successfully");
            
            
            
            String requestTable="create table request(id int AUTO_INCREMENT primary key,name varchar(200),date varchar(200),patientNumber varchar(20),victim varchar(20),location varchar(100),description varchar(200),requestObject varchar(100),status varchar(200))";
            DbOperations.setDataOrDelete(requestTable, "Request Table Created Successfully");


            String cityTable="create table city(id int AUTO_INCREMENT primary key,name varchar(200),UNIQUE(name))";
            DbOperations.setDataOrDelete(cityTable, "City Table Created Successfully");
            
            String enterpriseTable="create table enterprise(id int AUTO_INCREMENT primary key,name varchar(200),city varchar(200),type varchar(200),UNIQUE(name))";
            DbOperations.setDataOrDelete(enterpriseTable, "Enterprise Table Created Successfully");

        }catch(Exception e){
            JOptionPane.showMessageDialog(null,  e);
        }
    }
}
