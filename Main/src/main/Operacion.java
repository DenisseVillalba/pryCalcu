
package main;

    // Clase base Operacion
abstract class Operacion {
    // Método abstracto para realizar la operación
    public abstract void realizarOperacion(int numero);
    
    // Método que calcula la suma de los resultados de la tabla de multiplicar
    public double sumarTabla(int numero) {
        double suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += numero * i;
        }
        return suma;
    }
    
    // Método que muestra la tabla invertida
    public void mostrarTablaInvertida(int numero) {
        for (int i = 10; i >= 1; i--) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}

