/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Mr-mendes
 */
public class Conexao_DAO_Projeto {
    public Connection conectaBD(){
      Connection con = null; 
        
        try {
            
            String url = "jdbc:mysql://localhost:3306/bd_produto?user=root&password=root";
            
            con = DriverManager.getConnection(url);//chamo o get connection e chamo minha url
            
            
            
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    
    
        return con;
    }
    
}
