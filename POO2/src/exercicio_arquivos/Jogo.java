package exercicio_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
       
        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();


        try {
            int nm = 0;
            FileReader fr = new FileReader("Perguntas.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine())!=null) {
                nm ++;
                String v [] = linha.split(",");
                String pergunta = v[0];
                String resposta = v[1];
                perguntas.add(new Pergunta(pergunta, resposta, nm));
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
            if(op==2) {
                numeros();
            }
        } while(op!=3);

    }

    public static void numeros() {
        Random gerador = new Random();

        for(int i = 1;i < 10; i++) {
            System.out.println(gerador.nextInt(20));
        }
    }

    public static void perguntas(ArrayList<Pergunta> perguntas) {
        for(Pergunta p : perguntas) {
            System.out.println(p.getPergunta()+ " - " + p.getNumero());
        }
    }
}
