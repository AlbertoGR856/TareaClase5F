/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaclase5f;

import java.util.ArrayList;

/**
 *
 * @author GR6
 */
public class Prueba {

    public static void main(String[] args) {

        // En una clase Prueba, crea 15 objetos CuadradoMagico
        CuadradoMagico cuadrado1 = new CuadradoMagico(3);
        CuadradoMagico cuadrado2 = new CuadradoMagico(3);
        CuadradoMagico cuadrado3 = new CuadradoMagico(3);
        CuadradoMagico cuadrado4 = new CuadradoMagico(3);
        CuadradoMagico cuadrado5 = new CuadradoMagico(3);
        CuadradoMagico cuadrado6 = new CuadradoMagico(3);
        CuadradoMagico cuadrado7 = new CuadradoMagico(3);
        CuadradoMagico cuadrado8 = new CuadradoMagico(3);
        CuadradoMagico cuadrado9 = new CuadradoMagico(3);
        CuadradoMagico cuadrado10 = new CuadradoMagico(3);
        CuadradoMagico cuadrado11 = new CuadradoMagico(3);
        CuadradoMagico cuadrado12 = new CuadradoMagico(3);
        CuadradoMagico cuadrado13 = new CuadradoMagico(3);
        CuadradoMagico cuadrado14 = new CuadradoMagico(3);
        CuadradoMagico cuadrado15 = new CuadradoMagico(3);

        ArrayList<CuadradoMagico> listaCuadrados = new ArrayList<>();

        listaCuadrados.add(cuadrado1);
        listaCuadrados.add(cuadrado2);
        listaCuadrados.add(cuadrado3);
        listaCuadrados.add(cuadrado4);
        listaCuadrados.add(cuadrado5);
        listaCuadrados.add(cuadrado6);
        listaCuadrados.add(cuadrado7);
        listaCuadrados.add(cuadrado8);
        listaCuadrados.add(cuadrado9);
        listaCuadrados.add(cuadrado10);
        listaCuadrados.add(cuadrado11);
        listaCuadrados.add(cuadrado12);
        listaCuadrados.add(cuadrado13);
        listaCuadrados.add(cuadrado14);
        listaCuadrados.add(cuadrado15);

        //Imprime su contenido por consola y un mensaje indicando si son o no cuadrados mágicos. 
        for (CuadradoMagico listaCuadrado : listaCuadrados) {

            System.out.println("---------------------------");
            
            System.out.println(listaCuadrado.imprimirCuadradoMagico());

            System.out.println("El cuadrado magico es: " + listaCuadrado.esCuadradoMagico());
            
            
          

        }
    }

}
