package excscaseiros;

import javax.swing.*;

public class xambra{
	public static void main(String[] args){
		int lado = Integer.parseInt(JOptionPane.showInputDialog("Qual tamanho do Losango?"));
		for(int i = 1; i < lado*2; i++){
			for(int j = 1; j < lado*2; j++){
				if(j == lado - i+1 || j == lado + i-1 || (i > lado && j == i - lado+1 || j == lado*2+lado-1-i)){
					System.out.print("*");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println("");
		}
	}
}