package matrizes;
import javax.swing.JOptionPane;
import java.util.Random;

public class Matrizes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random randon = new Random();
        int Matriz[][] = new int [10][10];
        int soma = 0;
       
      
       for (int linha = 0; linha<10; linha++){
           for (int coluna = 0; coluna<10; coluna++){
        Matriz[linha][coluna] = randon.nextInt(100);
        soma = soma + Matriz[linha][coluna];
        
        JOptionPane.showMessageDialog(null, "Linha (" + linha + ") coluna (" + coluna + ") \nvalor:" + Matriz[linha][coluna]);
        }
       }
        JOptionPane.showMessageDialog(null, "A soma dos valores da Matriz �: " + soma);
    }
    
}