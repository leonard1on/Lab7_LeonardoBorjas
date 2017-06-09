/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_leonardoborjas;

import java.util.ArrayList;

/**
 *
 * @author Leonardo Borjas
 */
public class Paciente extends Persona{
    private ArrayList<String> enfermedades = new ArrayList();
    private String fechaingreso;
    private String dealta;
    private String sangre;
    private String causa;
    private ArrayList<String> alergias=new ArrayList();
    private ArrayList<Organo> organos=new ArrayList();

    public Paciente() {
    }

    public Paciente(String fechaingreso, String dealta, String sangre, String causa, String nombre, int edad, int id, double altura, double peso, String sexo) {
        super(nombre, edad, id, altura, peso, sexo);
        this.fechaingreso = fechaingreso;
        this.dealta = dealta;
        this.sangre = sangre;
        this.causa = causa;
    }

    public ArrayList<String> getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(ArrayList<String> enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public String getDealta() {
        return dealta;
    }

    public void setDealta(String dealta) {
        this.dealta = dealta;
    }

    public String getSangre() {
        return sangre;
    }

    public void setSangre(String sangre) {
        this.sangre = sangre;
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }

    public ArrayList<Organo> getOrganos() {
        return organos;
    }

    public void setOrganos(ArrayList<Organo> organos) {
        this.organos = organos;
        
        
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
