/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab2_encapsulamiento;

import javax.swing.JOptionPane;
/**
 *
 * @author zarat
 */
public class ObjetoCalculadora {

    //Declaración de variables a usar en esta clase
    private double numero1, numero2, resultado = 0;

    //Si la funcion detecta un numero menor a 1, este mostrará un error en consola y saldra de los procesos.
    public void setNumero1(double numero1) {
        if (numero1 == 0 || numero1<0){
            System.out.println("[ERROR] NUMERO 1 NO CUMPLE CON LOS PARAMETROS");
            System.exit(0);

        }else{
            this.numero1 = numero1;
        }
    }

    public void setNumero2(double numero2) {
        if (numero2 == 0 || numero2<0){
            System.out.println("[ERROR] NUMERO 2 NO CUMPLE CON LOS PARAMETROS");
            System.exit(0);
        }else{
            this.numero2 = numero2;
        }
    }

    //Constructor de la clase.
    
    public ObjetoCalculadora() {
    }
    
    //Acciones adicionales
    public double pedirNum(){
        double n;
        n = Double.parseDouble(JOptionPane.showInputDialog("Digite numero"));
        return n;
    }
    //Funciones de la calculadora
    public double calcularSuma() {
        return resultado = numero1 + numero2;
    }

    public double calcularResta() {
        return resultado = numero1 - numero2;
    }

    public double calcularMultiplicacion() {
        return resultado = numero1 * numero2;
    }

    public double calcularDivision() {
        return resultado = numero1 / numero2;
    }
}

