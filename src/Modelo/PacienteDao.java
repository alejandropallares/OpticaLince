/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author alejandropallares
 */


public class PacienteDao {
    Conexion cn = new Conexion();
    Connection con;
    
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegistrarPaciente(Paciente pac) {
        String sql = "INSERT INTO pacientes (Nom_pac,Dir_pac,Fecha_pac,Sexo_pac,Tel_pac,Correo_pac) VALUES (?,?,?,?,?,?)";
        
        
        try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, pac.getNom_pac());
        ps.setString(2,pac.getDir_pac());
        ps.setString(3, pac.getFecha_pac());
        ps.setString(4, pac.getSexo_pac());
        ps.setString(5, pac.getTel_pac());
        ps.setString(6, pac.getCorreo_pac());
        ps.execute();
        return true;
        
            
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(null, e.toString());
            return false;
        } finally {
            try {
                con.close();
                
            } catch(SQLException e) {
                System.out.println(e.toString());
            }
        }
        
    }
    
    
    public List ListarPaciente() {
        List<Paciente> ListaPac = new ArrayList();
        String sql = "SELECT * FROM pacientes";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                Paciente pac = new Paciente();
                pac.setFolio_pac(rs.getInt("Folio_pac"));
                pac.setNom_pac(rs.getString("Nom_pac"));
                pac.setDir_pac(rs.getString("Dir_pac"));
                pac.setFecha_pac(rs.getString("Fecha_pac"));
                pac.setSexo_pac(rs.getString("Sexo_pac"));
                pac.setTel_pac(rs.getString("Tel_pac"));
                pac.setCorreo_pac(rs.getString("Correo_pac"));
                
                ListaPac.add(pac);
            }
        } catch(SQLException e) {
            System.out.println(e.toString());
            
            
        }
        
        return ListaPac;
    }
    
    
    public boolean EliminarPaciente(int Folio_pac) {
        String sql = "DELETE FROM pacientes WHERE Folio_pac = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, Folio_pac);
            ps.execute();
            return true;
        }catch(SQLException e) {
            System.out.println(e.toString());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                System.out.println(ex.toString());
            }
    }
    }
    
    public boolean ActualizarPaciente(Paciente pac) {
        String sql = "UPDATE pacientes SET Nom_pac=?,Dir_pac=?, Fecha_pac=?, Sexo_pac=?,Tel_Pac=?,Correo_pac=? WHERE Folio_pac=? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pac.getNom_pac());
            ps.setString(2, pac.getDir_pac());
            ps.setString(3, pac.getFecha_pac());
            ps.setString(4, pac.getSexo_pac());
            ps.setString(5, pac.getTel_pac());
            ps.setString(6, pac.getCorreo_pac());
            ps.setInt(7, pac.getFolio_pac());;
            ps.execute();
            return true;
        }catch(SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally {
        try {
           con.close(); 
        }catch(SQLException e) {
            System.out.println(e.toString());
        }
    }
    }
}
