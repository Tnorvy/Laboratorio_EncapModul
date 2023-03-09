package udec.laboratorio;

public class Laboratorio {

    public static void main(String[] args) {
        Areas areas = new Areas();
        areas.setBase(areas.recibirDatos("Ingrese la base del cuadrado"));
        areas.setAltura(areas.recibirDatos("Ingrese la altura del cuadrado"));
        areas.setRadio(areas.recibirDatos("Ingrese el radio del circulo"));
        areas.imprimirAreas();
        System.exit(0);
    }
}
