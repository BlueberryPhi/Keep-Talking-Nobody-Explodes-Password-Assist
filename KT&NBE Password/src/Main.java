/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arreglo letras=new Arreglo();
        System.out.println("Primeras letras:");
        char[] Primera=letras.getLetrasP();
        System.out.println("Ultimas letras:");
        char[] Ultima=letras.getLetrasU();
        letras.contrastarLetras(Primera, Ultima);
    }
    
}
