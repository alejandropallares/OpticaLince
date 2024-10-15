/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alejandropallares
 */
public class Proveedor {
    
    private int Id_prove;
    private String Nom_prove;
    private String Tel_prove;
    private String Dir_prove;
    
    
    public Proveedor() {
        
    }

    public Proveedor(int Id_prove, String Nom_prove, String Tel_prove, String Dir_prove) {
        this.Id_prove = Id_prove;
        this.Nom_prove = Nom_prove;
        this.Tel_prove = Tel_prove;
        this.Dir_prove = Dir_prove;
    }

    public int getId_prove() {
        return Id_prove;
    }

    public void setId_prove(int Id_prove) {
        this.Id_prove = Id_prove;
    }

    public String getNom_prove() {
        return Nom_prove;
    }

    public void setNom_prove(String Nom_prove) {
        this.Nom_prove = Nom_prove;
    }

    public String getTel_prove() {
        return Tel_prove;
    }

    public void setTel_prove(String Tel_prove) {
        this.Tel_prove = Tel_prove;
    }

    public String getDir_prove() {
        return Dir_prove;
    }

    public void setDir_prove(String Dir_prove) {
        this.Dir_prove = Dir_prove;
    }

   
    
}
