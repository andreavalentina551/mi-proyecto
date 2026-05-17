public class Geometria {

    // Función 2: Calcular el área de un círculo
    public static double calcularAreaCirculo(double radio) {
        double pi = 3.1416;
        return pi * radio * radio;
    }

    public static void main(String[] args) {
        double areaC = calcularAreaCirculo(5.0);
        System.out.println("El área del círculo es: " + areaC);
    }
}