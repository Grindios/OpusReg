package com.example.opusreg;

import java.sql.*;

public class DBRegistrant {

    public static void addRegistrant(String fName, String lName,String address,String city,String state,String zip,String phoneNum,String email,String favFood,String type,String welcomeReception,String shirtSize,String foodReqs,String sponsorRep,String workRegion){
        Connection con = DBConnection.getConnection();
        PreparedStatement pst;

        try {
            System.out.println(con);
            pst = con.prepareStatement("INSERT INTO opus_registrant.registrant(fName,lName,addy,City,state,zip,phoneNumber,email,faveFood,empType,welcomeReception,shirtSize,foodReqs,sponsorRep,workRegion) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1,fName);
            pst.setString(2,lName);
            pst.setString(3,address);
            pst.setString(4,city);
            pst.setString(5,state);
            pst.setString(6,zip);
            pst.setString(7,phoneNum);
            pst.setString(8,email);
            pst.setString(9,favFood);
            pst.setString(10,type);
            pst.setString(11, welcomeReception);
            pst.setString(12,shirtSize);
            pst.setString(13,foodReqs);
            pst.setString(14, sponsorRep);
            pst.setString(15, workRegion);
            pst.executeUpdate();

        }catch(SQLException ex){
            System.out.println(ex);
        }


    }

    public static int getMaxRegistrant() {
        int regMaxId = 0;
        String maxregIdSQL = "SELECT MAX(idregistrant) FROM opus_registrant.registrant";

        try {
            Connection con = DBConnection.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(maxregIdSQL);

            if (rs.next()) {
                regMaxId = rs.getInt(1);
            }
        }
        catch (SQLException e) {
        }
        return regMaxId;

    }
}
