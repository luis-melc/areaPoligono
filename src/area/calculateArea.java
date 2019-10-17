/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package area;

/**
 *
 * @author luis
 */
public class calculateArea {
    private float radio;
    private float lado;
    private int noLados;

    public calculateArea(float _radio, float _lado, int _noLados){
        radio = _radio;
        lado = _lado;
        noLados = _noLados;
    }

    public void calculate(){
        //Calcular apotema
        double apotemaCuadrada = Math.pow(radio,2) - Math.pow(lado/2,2);
        double apotema = Math.sqrt(apotemaCuadrada);
        double area = noLados*((lado*apotema)/2);
        System.out.println(area);
        // return area
    }

    
}
