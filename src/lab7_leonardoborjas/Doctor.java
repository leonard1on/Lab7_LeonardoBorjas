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
public class Doctor extends Persona{
    private ArrayList<String> especialidades = new ArrayList();
    private ArrayList<Paciente> pacientes = new ArrayList();
    private int tiempodoctor;
    private String horario;
    private ArrayList<String> dias = new ArrayList();

    public Doctor() {
    }

    public Doctor(int tiempodoctor, String horario, String nombre, int edad, int id, double altura, double peso, String sexo) {
        super(nombre, edad, id, altura, peso, sexo);
        this.tiempodoctor = tiempodoctor;
        this.horario = horario;
    }

    public ArrayList<String> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<String> especialidades) {
        this.especialidades = especialidades;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public int getTiempodoctor() {
        return tiempodoctor;
    }

    public void setTiempodoctor(int tiempodoctor) {
        this.tiempodoctor = tiempodoctor;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public ArrayList<String> getDias() {
        return dias;
    }

    public void setDias(ArrayList<String> dias) {
        this.dias = dias;
    }

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
