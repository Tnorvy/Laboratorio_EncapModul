/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2_encapsulamiento;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author zarat
 */
public class Lab2_Encapsulamiento {

    public static void main(String[] args) {
        //Se crea un objeto invocando a la clase calculadora
        ObjetoCalculadora calculadora = new ObjetoCalculadora();
        JOptionPane.showMessageDialog(null, "CALCULADORA\nDigite numeros mayores a 0");
        
        //Se asignan valores a los atributos de la clase
        calculadora.setNumero1(calculadora.pedirNum());
        calculadora.setNumero2(calculadora.pedirNum());
        JOptionPane.showMessageDialog(null, "Suma: "
                +calculadora.calcularSuma()+""
                + "\nResta: "+calculadora.calcularResta()+"\nProducto: "
                +calculadora.calcularMultiplicacion()
                +"\nDivision: "
                +calculadora.calcularDivision());
    }
}
