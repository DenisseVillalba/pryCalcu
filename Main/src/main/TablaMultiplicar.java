
package main;

// Clase derivada TablaMultiplicar que sobrescribe los métodos de la clase base
class TablaMultiplicar extends Operacion {

    // Implementación de la operación para mostrar la tabla
    @Override
    public void realizarOperacion(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}