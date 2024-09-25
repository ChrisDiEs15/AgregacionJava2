/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama;

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Auto extends Agencia {
    public String nombreModelo;
    public String marca;
    /* Se requiere de varios motores para el punto 2 */
    public ArrayList<Motor> listaMotor = new ArrayList<>();
    private Documentacion documentacion; // Relación 1 a 1 con Documentacion

    public Auto(String nombreModelo, String marca, int idAgencia, Documentacion documentacion, ArrayList<Motor> listaMotor) {
        super(idAgencia);
        this.nombreModelo = nombreModelo;
        this.marca = marca;
        this.documentacion = documentacion; // Asignar la documentación
        this.listaMotor = listaMotor;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public ArrayList<Motor> getListaMotor() {
        return listaMotor;
    }

    public void setListaMotor(ArrayList<Motor> listaMotor) {
        this.listaMotor = listaMotor;
    }

    public Documentacion getDocumentacion() {
        return documentacion; // Método para obtener la documentación
    }

    public void setDocumentacion(Documentacion documentacion) {
        this.documentacion = documentacion; // Método para asignar la documentación
    }
}
