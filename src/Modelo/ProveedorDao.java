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
/**
 *
 * @author alejandropallares
 */
public class ProveedorDao {
    
    
    Conexion cn = new Conexion();
    Connection con;
    
    PreparedStatement ps;
    ResultSet rs;
    
    
    public boolean RegistrarProveedor(Proveedor prove) {
        
        String sql = "INSERT INTO proveedores(Nom_prove,Tel_prove,Direccion) VALUES (?,?,?)" ;
        
        try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, prove.getNom_prove());
        ps.setString(2, prove.getTel_prove());
        ps.setString(3,prove.getDir_prove());
       
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
    
    
    public List ListarProveedor() {
        List <Proveedor> Listapr = new ArrayList();
        String sql = "SELECT * FROM proveedores";
        
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            
            while(rs.next()) {
                Proveedor pr = new Proveedor();
                pr.setId_prove(rs.getInt("Id_prove"));
                pr.setNom_prove(rs.getString("Nom_prove"));
                pr.setTel_prove(rs.getString("Tel_prove"));
                pr.setDir_prove(rs.getString("Direccion"));
                
                
                
                Listapr.add(pr);
            }
        } catch(SQLException e) {
            System.out.println(e.toString());
            
            
        }
        
        return Listapr;
    }
    
    
      public boolean EliminarProveedor(int Id_prove) {
        String sql = "DELETE FROM proveedores WHERE Id_prove = ? ";
        
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, Id_prove);
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
      
      
        public boolean ActualizarProveedor(Proveedor pr) {
            
        String sql = "UPDATE proveedores SET Nom_prove=?,Tel_prove=?, Direccion=? WHERE Id_prove=? ";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, pr.getNom_prove());
            ps.setString(2, pr.getTel_prove());
            ps.setString(3, pr.getDir_prove());
            ps.setInt(4, pr.getId_prove());
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
