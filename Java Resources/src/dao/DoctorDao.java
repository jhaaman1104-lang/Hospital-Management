package dao;

import java.sql.*;
import java.util.*;
import model.Doctor;
import util.ConnectionFactory;

public class DoctorDao {
    public boolean add(Doctor d){
        String sql="INSERT INTO doctors(name,specialization,department,phone,email) VALUES(?,?,?,?,?)";
        try(Connection c=ConnectionFactory.getConnection(); PreparedStatement ps=c.prepareStatement(sql)){
            ps.setString(1,d.getName()); ps.setString(2,d.getSpecialization()); ps.setString(3,d.getDepartment());
            ps.setString(4,d.getPhone()); ps.setString(5,d.getEmail()); return ps.executeUpdate()>0;
        }catch(SQLException e){e.printStackTrace();return false;}
    }
    public List<Doctor> getAll(){
        List<Doctor> list=new ArrayList<>();
        try(Connection c=ConnectionFactory.getConnection(); PreparedStatement ps=c.prepareStatement("SELECT * FROM doctors ORDER BY id DESC"); ResultSet rs=ps.executeQuery()){
            while(rs.next()) list.add(new Doctor(rs.getInt("id"),rs.getString("name"),rs.getString("specialization"),
                rs.getString("department"),rs.getString("phone"),rs.getString("email")));
        }catch(SQLException e){e.printStackTrace();}
        return list;
    }
}
