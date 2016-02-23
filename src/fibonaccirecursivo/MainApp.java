/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonaccirecursivo;

import java.util.Scanner;

/**
 *
 * @author Eric Farias
 */
public class MainApp {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Informe a posição da sequencia Fibonacci desejada: ");
        int pos = input.nextInt();
        System.out.println("O " + pos + "º número Fibonacci é: " + FibonacciRecursivo.fibonacci(pos));
    }
}
