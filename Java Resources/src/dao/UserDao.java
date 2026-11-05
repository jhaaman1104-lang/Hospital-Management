package dao;

import java.sql.*;
import model.User;
import util.ConnectionFactory;

public class UserDao {
    public User login(String username, String password) {
        String sql = "SELECT * FROM users WHERE username=? AND password=?";
        try (Connection con=ConnectionFactory.getConnection();
             PreparedStatement ps=con.prepareStatement(sql)) {
            ps.setString(1, username); ps.setString(2, password);
            ResultSet rs=ps.executeQuery();
            if(rs.next()) return new User(rs.getInt("id"), rs.getString("username"),
                    rs.getString("password"), rs.getString("role"));
        } catch(SQLException e){ e.printStackTrace(); }
        return null;
    }
}
