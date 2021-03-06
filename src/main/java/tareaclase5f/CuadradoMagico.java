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
    private int[][] cuadrado;
    private int numero;

    //El método constructor de la clase inicializa la matriz con números aleatorios entre 1 y 9
    public CuadradoMagico(int numero) {

        this.numero = numero;

        this.cuadrado = new int[3][3];

        for (int i = 0; i < cuadrado.length; i++) {
            for (int j = 0; j < cuadrado[i].length; j++) {
                cuadrado[i][j] = (int) (Math.random() * 9 + 1);
            }

        }

    }

    //Metodo que suma todos los valores del cuadrado magico
    public int sumaFinal() {

        int suma = numero * (numero * numero + 1) / 2;
        return suma;
    }

    public boolean sumarFila() {
        boolean Suma = true;
        int sumarFila = 0;
        int resultado = sumaFinal();
        int a = 0;
        while (a < numero && Suma) {
            for (int b = 0; b < numero; b++) {
                sumarFila += cuadrado[a][b];
            }

            if (sumarFila != resultado) {
                Suma = false;
            }
            a++;
            sumarFila = 0;
        }
        return Suma;
    }

    public boolean sumarColumna() {
        boolean Suma = true;
        int sumarColumna = 0;
        int resultado = sumaFinal();
        int a = 0;
        while (a < numero && Suma) {
            for (int b = 0; b < numero; b++) {
                sumarColumna += cuadrado[a][b];
            }

            if (sumarColumna != resultado) {
                Suma = false;
            }
            a++;
            sumarColumna = 0;
        }
        return Suma;
    }

    public boolean sumarDiagonalPrincipal() {
        boolean cumpleSuma = true;
        int sumarDiagonalPrincipal = 0;
        int resultado = sumaFinal();

        int a = 0, b = 0;
        while (a < numero && b < numero) {
            sumarDiagonalPrincipal += cuadrado[a][b];
            a++;
            b++;
        }
        if (sumarDiagonalPrincipal != resultado) {
            cumpleSuma = false;
        }

        return cumpleSuma;
    }

    public boolean SumarDiagonalSecundaria() {
        boolean cumpleSuma = true;
        int sumarDiagonalSecundaria = 0;
        int resultado = sumaFinal();

        int a = 0;
        int b = numero - 1;

        while (a < numero && b >= 0) {
            sumarDiagonalSecundaria += cuadrado[a][b];
            a++;
            b--;
        }
        if (sumarDiagonalSecundaria != resultado) {
            cumpleSuma = false;
        }

        return cumpleSuma;
    }

    public String imprimirCuadradoMagico() {
        String cuadradoMagico = "";
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                cuadradoMagico += cuadrado[i][j] + "\t";
            }
            cuadradoMagico += "\n";
        }
        return cuadradoMagico;
    }

    //Método que indique si la matriz es un cuadrado mágico
    public boolean esCuadradoMagico() {
        return sumarFila() && sumarColumna() && sumarDiagonalPrincipal() && SumarDiagonalSecundaria();
    }

}
