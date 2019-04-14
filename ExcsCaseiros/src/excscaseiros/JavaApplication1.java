/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excscaseiros;

import java.io.*;


/**
 *
 * @author leo_f
 */
public class JavaApplication1 {    
    public static void main(String[] args) {
        float area,base,altura;
        String s = "";
        BufferedReader dado;
        try{
            System.out.println("Entre com a altura do triangulo: ");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            altura = Float.parseFloat(s);
            
            System.out.println("Entre com a base do triangulo: ");
            dado = new BufferedReader(new InputStreamReader(System.in));
            s = dado.readLine();
            base = Float.parseFloat(s);     
            
            area = base*altura/2;
            
            System.out.println("\nA area do triangulo é: " +area);            
        }
        catch(IOException erro){
            System.out.println("Houve erro com a entrada de dados: " + erro.toString());
        }
        catch(NumberFormatException erro){
            System.out.println("Houve um erro com a conversão de dado: " + erro.toString());
        } 
    }
}
