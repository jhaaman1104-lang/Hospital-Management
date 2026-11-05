package dao;

import java.sql.*;
import java.util.*;
import model.Patient;
import util.ConnectionFactory;

public class PatientDao {
    public boolean add(Patient p) {
        String sql="INSERT INTO patients(name,gender,dob,phone,address,disease) VALUES(?,?,?,?,?,?)";
        try(Connection c=ConnectionFactory.getConnection(); PreparedStatement ps=c.prepareStatement(sql)){
            ps.setString(1,p.getName()); ps.setString(2,p.getGender()); ps.setString(3,p.getDob());
            ps.setString(4,p.getPhone()); ps.setString(5,p.getAddress()); ps.setString(6,p.getDisease());
            return ps.executeUpdate()>0;
        }catch(SQLException e){e.printStackTrace(); return false;}
    }
    public List<Patient> getAll(){
        List<Patient> list=new ArrayList<>();
        try(Connection c=ConnectionFactory.getConnection();
            PreparedStatement ps=c.prepareStatement("SELECT * FROM patients ORDER BY id DESC");
            ResultSet rs=ps.executeQuery()){
            while(rs.next()) list.add(new Patient(rs.getInt("id"),rs.getString("name"),rs.getString("gender"),
                rs.getString("dob"),rs.getString("phone"),rs.getString("address"),rs.getString("disease")));
        }catch(SQLException e){e.printStackTrace();}
        return list;
    }
    public boolean delete(int id){
        try(Connection c=ConnectionFactory.getConnection(); PreparedStatement ps=c.prepareStatement("DELETE FROM patients WHERE id=?")){
            ps.setInt(1,id); return ps.executeUpdate()>0;
        }catch(SQLException e){e.printStackTrace(); return false;}
    }
}
