import java.util.Scanner;

public class Arreglo {
    Scanner scan = new Scanner(System.in);
    public int n = 5;

    public String[] palabras = 
           {"about", "after", "again", "below", "could", 
            "every", "first", "found", "great", "house",
            "large","learn", "never", "other", "place", 
            "plant", "point","right", "small", "sound", 
            "spell", "still", "study","their", "there", 
            "these", "thing", "think", "three","water", 
            "where", "which", "world", "would", "write"};

    // Obtener las letras iniciales ingresadas por el usuario
    public char[] getLetrasP() {
        String LetrasPrimeras = scan.next();
        return LetrasPrimeras.toCharArray();
    }

    // Obtener las letras finales ingresadas por el usuario
    public char[] getLetrasU() {
        String LetrasUltima = scan.next();
        return LetrasUltima.toCharArray();
    }

    // Comparar las letras ingresadas con las primeras y últimas letras de las palabras
   public void contrastarLetras(char[] Primera, char[] Ultima) {
        int cont = 0;
        System.out.println("Posibles palabras:");

        // Recorremos todas las palabras
        for (int x = 0; x < palabras.length; x++) {
            char[] Palabres = palabras[x].toCharArray(); // Convertir palabra a char array
            
            // Verificamos si la primera letra de la palabra coincide con alguna de las letras en Primera
            for (int i = 0; i < Primera.length; i++) {
                if (Primera[i] == Palabres[0]) {
                    // Verificamos si la última letra de la palabra coincide con alguna de las letras en Ultima
                    for (int j = 0; j < Ultima.length; j++) {
                        if (Ultima[j] == Palabres[Palabres.length - 1]) {
                            // Si ambas coinciden, imprimimos la palabra
                            System.out.println(palabras[x]);
                            cont++;
                        }
                    }
                }
            }
        }

        // Si no hay coincidencias, indicamos al usuario
        if (cont == 0) {
            System.out.println("No existen coincidencias");
        }
    }
}
        