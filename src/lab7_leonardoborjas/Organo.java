/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_leonardoborjas;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author Leonardo Borjas
 */
public class Organo {
    private Color color;
    private ArrayList<String> caracteristicas=new ArrayList();
    private int efectividad;
    private int potenciado;
    private int prueba;

    public Organo() {
    }

    public Organo(Color color, int efectividad, int potenciado, int prueba) {
        this.color = color;
        this.efectividad = efectividad;
        this.potenciado = potenciado;
        this.prueba = prueba;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<String> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(ArrayList<String> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public int getEfectividad() {
        return efectividad;
    }

    public void setEfectividad(int efectividad) {
        this.efectividad = efectividad;
    }

    public int getPotenciado() {
        return potenciado;
    }

    public void setPotenciado(int potenciado) {
        this.potenciado = potenciado;
    }

    public int getPrueba() {
        return prueba;
    }

    public void setPrueba(int prueba) {
        this.prueba = prueba;
    }
    
    
}
