/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package area;

import java.util.Scanner;

/**
 *
 * @author luis
 */
public class Area {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float radio,lado;
        int noLados;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca el número de lados: ");
        noLados = teclado.nextInt();
        System.out.print("Introduzca el valor del radio: ");
        radio = teclado.nextFloat();
        System.out.print("Introduzca el tamaño de los lados: ");
        lado = teclado.nextFloat();

        calculateArea cal = new calculateArea(radio, lado, noLados);
        cal.calculate();
        // System.out.println(noLados);
        // System.out.println(radio);
        // System.out.println(lado);
    }

}
