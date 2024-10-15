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
public class Paciente {
    private int Folio_pac;
    private String Nom_pac;
    private String Dir_pac;
    private String Fecha_pac;
    private String Sexo_pac;
    private String Tel_pac;
    private String Correo_pac;
    
    public Paciente() {
        
    }

    public Paciente(int Folio_pac, String Nom_pac, String Dir_pac, String Fecha_pac, String Sexo_pac, String Tel_pac, String Correo_pac) {
        this.Folio_pac = Folio_pac;
        this.Nom_pac = Nom_pac;
        this.Dir_pac = Dir_pac;
        this.Fecha_pac = Fecha_pac;
        this.Sexo_pac = Sexo_pac;
        this.Tel_pac = Tel_pac;
        this.Correo_pac = Correo_pac;
    }

    public int getFolio_pac() {
        return Folio_pac;
    }

    public void setFolio_pac(int Folio_pac) {
        this.Folio_pac = Folio_pac;
    }

    public String getNom_pac() {
        return Nom_pac;
    }

    public void setNom_pac(String Nom_pac) {
        this.Nom_pac = Nom_pac;
    }

    public String getDir_pac() {
        return Dir_pac;
    }

    public void setDir_pac(String Dir_pac) {
        this.Dir_pac = Dir_pac;
    }

    public String getFecha_pac() {
        return Fecha_pac;
    }

    public void setFecha_pac(String Fecha_pac) {
        this.Fecha_pac = Fecha_pac;
    }

    public String getSexo_pac() {
        return Sexo_pac;
    }

    public void setSexo_pac(String Sexo_pac) {
        this.Sexo_pac = Sexo_pac;
    }

    public String getTel_pac() {
        return Tel_pac;
    }

    public void setTel_pac(String Tel_pac) {
        this.Tel_pac = Tel_pac;
    }

    public String getCorreo_pac() {
        return Correo_pac;
    }

    public void setCorreo_pac(String Correo_pac) {
        this.Correo_pac = Correo_pac;
    }
    
    

}