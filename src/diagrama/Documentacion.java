/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagrama;

/**
 *
 * @author Chris
 */
public class Documentacion {
    public int noFactura;
    public int noPlaca;
    public int noTarjetaCirculacion;

    public Documentacion(int noFactura) {
        this.noFactura = noFactura;
    }

    public Documentacion(int noFactura, int noPlaca, int noTarjetaCirculacion) {
        this.noFactura = noFactura;
        this.noPlaca = noPlaca;
        this.noTarjetaCirculacion = noTarjetaCirculacion;
    }

    public int getNoFactura() {
        return noFactura;
    }

    public void setNoFactura(int noFactura) {
        this.noFactura = noFactura;
    }

    public int getNoPlaca() {
        return noPlaca;
    }

    public void setNoPlaca(int noPlaca) {
        this.noPlaca = noPlaca;
    }

    public int getNoTarjetaCirculacion() {
        return noTarjetaCirculacion;
    }

    public void setNoTarjetaCirculacion(int noTarjetaCirculacion) {
        this.noTarjetaCirculacion = noTarjetaCirculacion;
    }
}

