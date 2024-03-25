package atividade_arquivos_correcao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arquivo {
    private ArrayList<Pergunta> perguntas;
    
    public ArrayList<Pergunta> lerArquivo() {
        try {
            FileReader fr = new FileReader("Perguntas.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha = br.readLine())!= null) {
                perguntas.add(new Pergunta(linha));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void apuraResultado(ArrayList<resposta>)

        public ArrayList<Pergunta> sorteiaRodada(int qtd) {
    ArrayList<Pergunta> sorteadas = new ArrayList<Pergunta>();
    Collections.shuffle(perguntas);
    for(int i=0;i<qtd;i++) {
        sorteadas.add(perguntas.get(i));
    }
    return sorteadas;
    }
    private Arquivo() {
        perguntas = new ArrayList<Pergunta>();
    }
}
