/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_leonardoborjas;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Leonardo Borjas
 */
public class Administrar {
    private File archivo=null;
    private ArrayList<Doctor> doctores=new ArrayList();
    private ArrayList<Paciente> pacientes=new ArrayList();

    public Administrar() {
    }
    
    public Administrar(String path,ArrayList<Paciente> pacientes,ArrayList<Doctor> doctores){
    this.archivo=new File (path);
    this.doctores=doctores;
    this.pacientes=pacientes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Doctor> getDoctores() {
        return doctores;
    }

    public void setDoctores(ArrayList<Doctor> doctores) {
        this.doctores = doctores;
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(ArrayList<Paciente> pacientes) {
        this.pacientes = pacientes;
    }
    public void cargarArchivo(){
            try {
                pacientes=new ArrayList();
                doctores=new ArrayList();
                Paciente temp;
                Doctor temp2;
                if (archivo.exists()) {
                    FileInputStream entrada=new FileInputStream(archivo);
                    ObjectInputStream objeto=new ObjectInputStream(entrada);
                    try {
                        while ((temp=(Paciente)objeto.readObject())!=null) {
                            pacientes.add(temp);
                        }
                        while ((temp2=(Doctor)objeto.readObject())!=null) {
                            doctores.add(temp2);
                        }
                    } catch (EOFException e) {
                    }
                    objeto.close();
                    entrada.close();
                }
            } catch (Exception e) {
            }
        }
    
    public void escribirArchivo(){
        FileOutputStream fw=null;
        ObjectOutputStream bw=null;
        try {
            fw = new FileOutputStream(archivo);
            bw=new ObjectOutputStream(fw);
            for (Paciente t : pacientes) {
                bw.writeObject(t);
            }
            bw.writeObject("\n");
            for (Doctor d : doctores) {
                bw.writeObject(d);
            }
            bw.flush();
        } catch (Exception e) {
        }
        try {
            bw.close();
            fw.close(); 
        } catch (Exception e) {
        }
        
    }

}
