/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author muhib
 */
public class select {
    
    public static ResultSet getData(String query){
    
        Connection con = null;
        ResultSet rs = null;
        Statement st = null;
        
        try{
        
            con = ConnectionProvider.getCon();
            st = con.createStatement();
            rs = st.executeQuery(query);
            return rs;
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
    
}
