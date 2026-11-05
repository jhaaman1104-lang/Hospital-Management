package dao;

import java.sql.*;
import java.util.*;
import model.Bill;
import util.ConnectionFactory;

public class BillDao {
    public boolean add(Bill b){
        String sql="INSERT INTO bills(patient_id,consultation_fee,room_charge,medicine_charge,other_charge,total,bill_date,payment_status) VALUES(?,?,?,?,?,?,CURDATE(),?)";
        try(Connection c=ConnectionFactory.getConnection(); PreparedStatement ps=c.prepareStatement(sql)){
            ps.setInt(1,b.getPatientId()); ps.setDouble(2,b.getConsultationFee()); ps.setDouble(3,b.getRoomCharge());
            ps.setDouble(4,b.getMedicineCharge()); ps.setDouble(5,b.getOtherCharge());
            ps.setDouble(6,b.getConsultationFee()+b.getRoomCharge()+b.getMedicineCharge()+b.getOtherCharge());
            ps.setString(7,b.getPaymentStatus()); return ps.executeUpdate()>0;
        }catch(SQLException e){e.printStackTrace();return false;}
    }
    public List<Bill> getAll(){
        List<Bill> list=new ArrayList<>();
        try(Connection c=ConnectionFactory.getConnection(); PreparedStatement ps=c.prepareStatement("SELECT * FROM bills ORDER BY id DESC"); ResultSet rs=ps.executeQuery()){
            while(rs.next()){
                Bill b=new Bill(); b.setId(rs.getInt("id")); b.setPatientId(rs.getInt("patient_id"));
                b.setConsultationFee(rs.getDouble("consultation_fee")); b.setRoomCharge(rs.getDouble("room_charge"));
                b.setMedicineCharge(rs.getDouble("medicine_charge")); b.setOtherCharge(rs.getDouble("other_charge"));
                b.setTotal(rs.getDouble("total")); b.setBillDate(rs.getString("bill_date")); b.setPaymentStatus(rs.getString("payment_status")); list.add(b);
            }
        }catch(SQLException e){e.printStackTrace();}
        return list;
    }
}
