/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tratandovar;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author jotal
 */
public class TratandoVar {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int soma1 = 0;
        try {
            soma1 = ler.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido! Digite apenas números inteiros.");
            return; // encerra o programa
        }

        System.out.println("Digite o segundo valor: ");
        int soma2 = 0;
        try {
            soma2 = ler.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido! Digite apenas números inteiros.");
            return; // encerra o programa
        }

        int soma = soma1 + soma2;

        System.out.println("A soma dos valores é: " + soma);

    }
}
