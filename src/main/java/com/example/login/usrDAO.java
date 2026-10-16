
package com.example.login;
import java.sql.Connection;
import java.sql.PreparedStatement;



public class usrDAO {
    private jdbcutill db = new jdbcutill();
    

    public Boolean registrationUser(model user){
        String sql = "INSERT INTO users (user , email, password) VALUES (?,?,?)";
        try{
            Connection conn = db.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());

            int rowInserted =   ps.executeUpdate();

            if(rowInserted >0){
                return true ;
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
}