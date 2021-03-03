/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareaclase5f;

import java.util.Random;

/**
 *
 * @author GR6
 */

/*
Todos los cambios realizados en esta tarea deben estar reflejados en un repositorio privado de github.
Crea una clase, llamada CuadradoMagico. Esta clase tendrá un atributo que representa una matriz de tres por tres dimensiones. 
El método constructor de la clase inicializa la matriz con números aleatorios entre 1 y 9. Crea un commit y sube estos cambios.
Utiliza métodos para sumar una fila, sumar una columna, sumar la diagonal principal y finalmente sumar la diagonal secundaria. 
Haciendo uso de estos métodos, implementa un nuevo método que indique si la matriz es un cuadrado mágico. Usa un método para imprimir la matriz por consola. 
Cada uno de los métodos anteriores debe ir confirmado en un commit diferente, con su respectiva prueba en el método main.
En una clase Prueba, crea 15 objetos CuadradoMagico, imprime su contenido por consola y un mensaje indicando si son o no cuadrados mágicos. 
Confirma los cambios y súbelos a github.
 */
public class CuadradoMagico {

    private static Random aleatorio = new Random();
    private static int[][] numeros = new int[3][3];

    public CuadradoMagico(int[][] numeros) {

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                numeros[i][j] = aleatorio.nextInt(9 - 1 + 1) + 1;
            }
        }

    }

}
