/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excscaseiros;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author leo_f
 */
public class IMC {
    public static void main(String[] args){
        float peso,imc;
        int altura;
        String str = "";
        try {
            str = JOptionPane.showInputDialog("Entre com o seu peso: ");
            peso = Float.parseFloat(str);
            
            str = JOptionPane.showInputDialog("Entre com a sua altura: ");
            altura = Integer.parseInt(str);
            
            imc = (peso)/(altura);
            
            if(imc <= 18.5)
            JOptionPane.showMessageDialog(null, "Seu índice de massa corporal (IMC) é = " + imc + "\n Seu peso está abaixo do normal");
            else if (imc > 18.5 && < 24.4)
            JOptionPane.showMessageDialog(null, "Seu índice de massa corporal (IMC) é = " +imc + "\n Seu peso está ideal");
            else if (imc > 24.5 && < 29.9 )
            JOptionPane.showMessageDialog(null, "Seu índice de massa corporal (IMC) é = " +imc + "\n VOcê está em pré obesidade");
            else if (imc > 30 && < 34.9)
            JOptionPane.showMessageDialog(null, "Seu índice de massa corporal (IMC) é = " +imc + "\n Você tem Obesidade Classe I");
            else if (imc > 35 && < 39.9)
            JOptionPane.showMessageDialog(null, "Seu índice de massa corporal (IMC) é = " +imc + "\n Você tem Obesidade Classe II(Severa)");
            else
            JOptionPane.showMessageDialog(null, "Seu índice de massa corporal (IMC) é = " +imc + "\n Você tem Obesidade Classe III(Mórbida)");
        }
        catch(IOException e){
            System.out.println("Houve um erro com a entrada de dados " + e.toString());
        }
        catch(NumberFormatException e){
            System.out.println("Houve um erro com a conversão de tipos, digite apenas caracteres núméricos " +e.toString());            
        }
    }
}
