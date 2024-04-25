package exercicio_arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JOptionPane;

public class Jogo {
    public static void main(String[] args) {
        ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
        
            try {
                FileReader fr = new FileReader("Perguntas.txt");
                BufferedReader br = new BufferedReader(fr);
                String linha = "";
                while((linha = br.readLine())!=null) {
                    String v [] = linha.split(",");				
                    String pergunta = v[0];
                    String resposta = v[1];
                    Pergunta p = new Pergunta(pergunta,resposta);
                    perguntas.add(p);
                }
                br.close();
            }catch (Exception e) {
                e.printStackTrace();
            }
            
            String menu = "1 - Perguntas\n"
                    + "2 - Resultados\n\n"
                    + "3 - Sair";
            int op = 0;
            
            do {
                op = Integer.parseInt(JOptionPane.showInputDialog(menu));
                if (op ==1)perguntas(perguntas);;
                if (op ==2);
            }while(op!=99);
        }	
        public static void perguntas(ArrayList<Pergunta> perguntas) {
            Collections.shuffle(perguntas);
            for (Pergunta p : perguntas) {
            char resp =	JOptionPane.showInputDialog(null,p.getPergunta()).toUpperCase().charAt(0);
            p.verificaResp(resp);
            }
        }
    }