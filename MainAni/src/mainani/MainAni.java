
package mainani;

public class MainAni {

    public static void main(String[] args) {
        Mamifero[] animales = { new Perro(), new Gato() };

        for (Mamifero animal : animales) {
            animal.hacerSonido();
            animal.amamantar();
            System.out.println();
        }
    }
}
