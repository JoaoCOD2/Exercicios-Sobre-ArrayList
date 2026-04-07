/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicioarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author joaop
 */
public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            lista.add(sc.nextInt());
        }

        System.out.println(lista);
    }
}


