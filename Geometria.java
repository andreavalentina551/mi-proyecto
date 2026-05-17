public class Geometria {
     // Función 1: Calcular el área de un rectángulo
     public static double calcularAreaRectangulo(double base, double altura) {
         return base * altura;
     }
     // Función 2: Calcular el área de un triángulo (Agregada en la segunda rama)
     public static double calcularAreaTriangulo(double base, double altura) {
         return (base * altura) / 2;
     }
     // Función 3: Calcular el área de un círculo
     public static double calcularAreaCirculo(double radio) {
         double pi = 3.1416;
         return pi * radio * radio;
     }
     public static void main(String[] args) {
         double areaR = calcularAreaRectangulo(5.0, 3.0);
         System.out.println("El área del rectángulo es: " + areaR);
         double areaT = calcularAreaTriangulo(4.0, 6.0);
         System.out.println("El área del triángulo es: " + areaT);
         double areaC = calcularAreaCirculo(5.0);
         System.out.println("El área del círculo es: " + areaC);
     }
 }