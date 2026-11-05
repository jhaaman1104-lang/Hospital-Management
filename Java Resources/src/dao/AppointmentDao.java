package dao;

import java.sql.*;
import java.util.*;
import model.Appointment;
import util.ConnectionFactory;

public class AppointmentDao {
    public boolean add(Appointment a){
        String sql="INSERT INTO appointments(patient_id,doctor_id,appointment_date,appointment_time,reason,status) VALUES(?,?,?,?,?,?)";
        try(Connection c=ConnectionFactory.getConnection(); PreparedStatement ps=c.prepareStatement(sql)){
            ps.setInt(1,a.getPatientId()); ps.setInt(2,a.getDoctorId()); ps.setString(3,a.getAppointmentDate());
            ps.setString(4,a.getAppointmentTime()); ps.setString(5,a.getReason()); ps.setString(6,"Scheduled");
            return ps.executeUpdate()>0;
        }catch(SQLException e){e.printStackTrace();return false;}
    }
    public List<Appointment> getAll(){
        List<Appointment> list=new ArrayList<>();
        String sql="SELECT * FROM appointments ORDER BY appointment_date DESC, appointment_time DESC";
        try(Connection c=ConnectionFactory.getConnection(); PreparedStatement ps=c.prepareStatement(sql); ResultSet rs=ps.executeQuery()){
            while(rs.next()){
                Appointment a=new Appointment(); a.setId(rs.getInt("id")); a.setPatientId(rs.getInt("patient_id"));
                a.setDoctorId(rs.getInt("doctor_id")); a.setAppointmentDate(rs.getString("appointment_date"));
                a.setAppointmentTime(rs.getString("appointment_time")); a.setReason(rs.getString("reason"));
                a.setStatus(rs.getString("status")); list.add(a);
            }
        }catch(SQLException e){e.printStackTrace();}
        return list;
    }
}
