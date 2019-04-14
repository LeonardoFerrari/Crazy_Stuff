/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excscaseiros;
import java.io.*;
import java.util.*;

/**
 *
 * @author leo_f
 */
public class NewClass {
    public static void main(String args[]){
        float saldo = 0,saque = 0;        
        System.out.println("Entre com o valor que deseja depositar: ");
        Scanner sc = new Scanner(System.in);
        saldo = sc.nextFloat();
        System.out.println("Entre com o valor que deseja sacar: ");
        saque = sc.nextFloat();
        saldo =  saldo - saque;
        if(saque > saldo)
            System.out.println("Valor de saque maior que o valor em conta");
        else
            System.out.println("Seu saldo final é de: " +saldo+ " reais em conta");
    }
    
}
