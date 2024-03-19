package exercicio_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
        String menu = "1 - Rodada de Perguntas\n"
                    + "2 - Score Total\n\n"
                    + "3 - Sair";
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(op==1) lerPerguntas();
        } while (op!=3);
    }

    private static void lerPerguntas() {
        try {
            FileReader fr = new FileReader("Perguntas.txt");
            BufferedReader br = new BufferedReader(fr);
            String texto = br.readLine();
            String[] quebra = texto.split("|");
            String linha = "";
            while((linha = br.readLine())!= null) {
                System.out.println(linha);
            }
            while(texto!=null) {
            texto = br.readLine();
            System.out.println(quebra);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
