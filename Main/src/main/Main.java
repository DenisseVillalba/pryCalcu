
package main;
import java.util.Scanner;
public class Main {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario hasta qué número desea ver las tablas
        System.out.print("Ingresa el numero hasta el cual deseas ver las tablas (ejemplo: 8): ");
        int hasta = scanner.nextInt();

        // Crear una instancia de la clase TablaMultiplicar (subclase de Operacion)
        Operacion TablaMultiplicar = new TablaMultiplicar();

        double sumaTotal = 0;

        // Mostrar las tablas de multiplicar hasta el número elegido
        for (int i = 2; i <= hasta; i++) {
            System.out.println("Tabla de multiplicar del " + i + " hasta 10:");
            TablaMultiplicar.realizarOperacion(i);

            // Sumar los resultados de la tabla y mostrar la suma
            double suma = TablaMultiplicar.sumarTabla(i);
            System.out.println("Suma de los resultados: " + suma);

            // Acumular la suma total
            sumaTotal += suma;
        }

        // Mostrar la suma total de todas las tablas
        System.out.println("La suma total de todas las tablas de multiplicar generadas es: " + sumaTotal);

        // Preguntar al usuario si desea ver las tablas invertidas
        System.out.print("Quieres ver las tablas invertidas (si/no): ");
        String respuesta = scanner.next().toLowerCase();

        if (respuesta.equals("sí") || respuesta.equals("si")) {
            // Mostrar las tablas invertidas usando polimorfismo
            for (int i = 2; i <= hasta; i++) {
                System.out.println("Tabla de multiplicar invertida del " + i + ":");
                TablaMultiplicar.mostrarTablaInvertida(i);
            }
        }

    }
}
   
