/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioavion;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Cris
 */
public class Avion {
    private String codVuelo, ciudadOrigen, ciudadDestino;
    private double duracionVuelo;
    private ArrayList <Persona> listaPasajeros;

    public Avion(String codVuelo, String ciudadOrigen, String ciudadDestino, double duracionVuelo, ArrayList<Persona> listaPasajeros) {
        this.codVuelo = codVuelo;
        this.ciudadOrigen = ciudadOrigen;
        this.ciudadDestino = ciudadDestino;
        this.duracionVuelo = duracionVuelo;
        this.listaPasajeros = listaPasajeros;
    }

    public String getCodVuelo() {
        return codVuelo;
    }

    public void setCodVuelo(String codVuelo) {
        this.codVuelo = codVuelo;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getCiudadDestino() {
        return ciudadDestino;
    }

    public void setCiudadDestino(String ciudadDestino) {
        this.ciudadDestino = ciudadDestino;
    }

    public double getDuracionVuelo() {
        return duracionVuelo;
    }

    public void setDuracionVuelo(double duracionVuelo) {
        this.duracionVuelo = duracionVuelo;
    }

    public ArrayList<Persona> getListaPasajeros() {
        return listaPasajeros;
    }

    public void setListaPasajeros(ArrayList<Persona> listaPasajeros) {
        this.listaPasajeros = listaPasajeros;
    }

    @Override
    public String toString() {
        return "Avion{" + "codVuelo=" + codVuelo + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", duracionVuelo=" + duracionVuelo + ", listaPasajeros=" + listaPasajeros + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this.codVuelo);
        hash = 17 * hash + Objects.hashCode(this.ciudadOrigen);
        hash = 17 * hash + Objects.hashCode(this.ciudadDestino);
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.duracionVuelo) ^ (Double.doubleToLongBits(this.duracionVuelo) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.listaPasajeros);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Avion other = (Avion) obj;
        if (Double.doubleToLongBits(this.duracionVuelo) != Double.doubleToLongBits(other.duracionVuelo)) {
            return false;
        }
        if (!Objects.equals(this.codVuelo, other.codVuelo)) {
            return false;
        }
        if (!Objects.equals(this.ciudadOrigen, other.ciudadOrigen)) {
            return false;
        }
        if (!Objects.equals(this.ciudadDestino, other.ciudadDestino)) {
            return false;
        }
        if (!Objects.equals(this.listaPasajeros, other.listaPasajeros)) {
            return false;
        }
        return true;
    }
    
    
}
