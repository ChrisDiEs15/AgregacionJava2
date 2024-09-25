/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagrama;
import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Diagrama {

    public static void main(String[] args) {
    // Crear la primera Agencia
    Agencia agencia1 = new Agencia(1);
    agencia1.setDireccion("Direccion 12345");

    // Crear un Motor para el primer Auto
    Motor motor1 = new Motor(101);

    // Crear la Documentación para el primer Auto (solo noFactura)
    Documentacion doc1 = new Documentacion(12345);

    // Crear el primer Auto con un solo Motor y su Documentación
    Auto auto1 = new Auto("Modelo X", "Marca Y", agencia1.getIdAgencia(), doc1, new ArrayList<Motor>() {{
        add(motor1);
    }});

    // Mostrar los datos del primer Auto
    System.out.println("Datos del Auto 1:");
    System.out.println("Modelo: " + auto1.getNombreModelo());
    System.out.println("Marca: " + auto1.getMarca());
    System.out.println("Número de Motor: " + motor1.getNumeroMotor());
    System.out.println("Número de Factura: " + auto1.getDocumentacion().getNoFactura());
    System.out.println("ID Agencia: " + agencia1.getIdAgencia());
    System.out.println("Dirección Agencia: " + agencia1.getDireccion());

    // Crear la segunda Agencia
    Agencia agencia2 = new Agencia(2);
    agencia2.setDireccion("Direccion alskjhd");

    // Crear dos Motores para el segundo Auto
    Motor motor2 = new Motor(202);
    Motor motor3 = new Motor(203);

    // Crear la Documentación para el segundo Auto (todos los atributos)
    Documentacion doc2 = new Documentacion(54321, 67890, 112233);

    // Crear el segundo Auto con dos Motores y su Documentación
    Auto auto2 = new Auto("Modelo Z", "Marca W", agencia2.getIdAgencia(), doc2, new ArrayList<Motor>() {{
        add(motor2);
        add(motor3);
    }});

    // Mostrar los datos del segundo Auto
    System.out.println("Datos del Auto 2:");
    System.out.println("Modelo: " + auto2.getNombreModelo());
    System.out.println("Marca: " + auto2.getMarca());
    System.out.println("Número de Motor 1: " + motor2.getNumeroMotor());
    System.out.println("Número de Motor 2: " + motor3.getNumeroMotor());
    System.out.println("Número de Factura: " + auto2.getDocumentacion().getNoFactura());
    System.out.println("Número de Placa: " + auto2.getDocumentacion().getNoPlaca());
    System.out.println("Número de Tarjeta de Circulación: " + auto2.getDocumentacion().getNoTarjetaCirculacion());
    System.out.println("ID Agencia: " + agencia2.getIdAgencia());
    System.out.println("Dirección Agencia: " + agencia2.getDireccion());
}
    
}
