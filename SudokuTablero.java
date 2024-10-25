/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

import java.util.Random;

/**
 *
 * @author HP
 */
public class SudokuTablero implements Funciones {
    private int[][] tablero;
    private int[][] solucion;
    private boolean[][] esEditable; // Controla cuáles celdas pueden ser editadas por el usuario

    public SudokuTablero() {
        tablero = new int[9][9];
        solucion = new int[9][9];
        esEditable = new boolean[9][9];
        nuevoJuego();
    }

    @Override
    public void nuevoJuego() {
        // Genera un nuevo tablero de Sudoku con números aleatorios (ejemplo simple)
        Random rand = new Random();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tablero[i][j] = rand.nextInt(9) + 1; // Números entre 1 y 9
                solucion[i][j] = tablero[i][j];
                esEditable[i][j] = true; // Se puede personalizar para decidir qué celdas son editables
            }
        }
    }

    @Override
    public boolean comprobar() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (tablero[i][j] != solucion[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
    public void resolver() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tablero[i][j] = solucion[i][j];
            }
        }
    }

    public void limpiar() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (esEditable[i][j]) {
                    tablero[i][j] = 0; // Borra las celdas editables
                }
            }
        }
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public int[][] getSolucion() {
        return solucion;
    }

    public void setSolucion(int[][] solucion) {
        this.solucion = solucion;
    }
}
