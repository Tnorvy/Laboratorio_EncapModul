package udec.laboratorio;

import javax.swing.JOptionPane;

public class Areas {
    private double base, altura, radio;

    public Areas() {
    }

    public void imprimirAreas(){
        JOptionPane.showMessageDialog(null, "El area del cuadrado es: " + calcularAreaCuadrado());
        JOptionPane.showMessageDialog(null, "El area del circulo es: " + calcularAreaCirculo());
    }
    
    public double recibirDatos(String mensaje){
        double valor = Double.parseDouble(JOptionPane.showInputDialog(mensaje));
        return valor;
    }

    private double calcularAreaCuadrado(){
        return base * altura;
    }

    private double calcularAreaCirculo(){
        return Math.PI * Math.pow(radio, 2);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
