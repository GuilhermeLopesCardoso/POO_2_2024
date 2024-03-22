package exercicio_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
       
        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();


        try {
            FileReader fr = new FileReader("Perguntas.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine())!=null) {
                String v [] = linha.split(",");
                String pergunta = v[0];
                String resposta = v[1];
                perguntas.add(new Pergunta(pergunta, resposta));
            }
            br.close();
        } catch(Exception e) {
            e.printStackTrace();
        }



        String menu = "1 - Rodada de Perguntas\n"
                    + "2 - Score Total\n\n"
                    + "3 - Sair";

        int op = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if(op==1) {
                perguntas(perguntas);
            }
        } while(op!=3);

    }

    public static void perguntas(ArrayList<Pergunta> perguntas) {
        for(Pergunta p : perguntas) {
            System.out.println(p.getPergunta());
        }
    }
}
