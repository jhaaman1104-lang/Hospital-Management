package dao;

import java.sql.*;
import java.util.*;
import model.Room;
import util.ConnectionFactory;

public class RoomDao {
    public List<Room> getAll(){
        List<Room> list=new ArrayList<>();
        try(Connection c=ConnectionFactory.getConnection(); PreparedStatement ps=c.prepareStatement("SELECT * FROM rooms ORDER BY room_number"); ResultSet rs=ps.executeQuery()){
            while(rs.next()){
                Room r=new Room(); r.setId(rs.getInt("id")); r.setRoomNumber(rs.getString("room_number"));
                r.setRoomType(rs.getString("room_type")); r.setStatus(rs.getString("status")); r.setPatientId(rs.getInt("patient_id")); list.add(r);
            }
        }catch(SQLException e){e.printStackTrace();}
        return list;
    }
    public boolean assign(int id,int patientId){
        try(Connection c=ConnectionFactory.getConnection(); PreparedStatement ps=c.prepareStatement(
            "UPDATE rooms SET patient_id=?, status='Occupied' WHERE id=? AND status='Available'")){
            ps.setInt(1,patientId); ps.setInt(2,id); return ps.executeUpdate()>0;
        }catch(SQLException e){e.printStackTrace();return false;}
    }
}
