/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv22task5;

import java.util.Arrays;

/**
 *
 * @author admin
 */
public class SPTV22Task5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Создаем зубчатый массив
        int[][] array = new int[5][];
        array[0] = new int[3];
        array[1] = new int[5];
        array[2] = new int[7];
        array[3] = new int[8];
        array[4] = new int[9];

        // Заполняем массив случайными числами от 50 до 100
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 51) + 50;
            }
        }

        // Выводим несортированный массив
        System.out.println("Несортированный массив:");
        printArray(array);

        // Сортируем массив
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }

        // Выводим отсортированный массив
        System.out.println("Отсортированный массив:");
        printArray(array);
    }

    // Метод для вывода массива в консоль
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i
