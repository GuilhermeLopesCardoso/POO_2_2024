package atividade_arquivos_correcao.atividade_arquivos_correcao_teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import atividade_arquivos_correcao.Resposta;
import atividade_arquivos_correcao.Arquivo;
import atividade_arquivos_correcao.Pergunta;

public class ArquivoTest {
   private Arquivo jogo = new Arquivo();
	private Arquivo jogo2 =new Arquivo();
	@Test
	void carregaArquivoTest() {
		jogo.lerArquivo();
		assertEquals(50, jogo.getPerguntas().size());
		Pergunta quarta = jogo.getPerguntas().get(3);
		assertEquals("A água ferve a 100 graus Celsius.", quarta.getTitulo());
		assertEquals(true, quarta.isRespostaCorreta());
	}
	
	@Test
	void fazCorrecaoTest() {
		Pergunta pergunta = new Pergunta("ABCD é EFGH,Falso");
		Resposta r = new Resposta(pergunta, true);
		assertEquals("erro", r.correcao());
	}
	@Test
	void calculaPontuacaoTest() {
		assertEquals(2, jogo.calculaPontuacao(respostasControladas()));
		}
	
	@Test
	void gravarespostasTest() {
		ArrayList<Resposta> respostas = respostasControladas();
		jogo.gravaResultado(respostas);
		String conteudoArq = jogo.lerRespostas();
		assertEquals("1,A,acerto\n"
				+ "2,B,acerto\n"
				+ "3,C,erro\n"
				+ "4,D,erro\n", conteudoArq);
	}
	@Test
	void sorteiaRodadaTest() {
		jogo.lerArquivo();
		jogo2.lerArquivo();
		jogo2.sorteiaRodada(50);
		for(int i =1; i<50;i++) {
			assertNotEquals(jogo2.getPerguntas().get(i).getTitulo(),jogo.getPerguntas().get(i).getTitulo());
		}
		//assertNotEquals(jogo.getPerguntas().get(1).getTitulo(),jogo2.getPerguntas().get(1).getTitulo());
	}
	
	private ArrayList<Resposta> respostasControladas(){
		ArrayList<Resposta> respostas = new ArrayList<Resposta>();
		Pergunta pa = new Pergunta("A", false);
		Pergunta pb = new Pergunta("b", false);
		Pergunta pc = new Pergunta("c", true);
		Pergunta pd = new Pergunta("d", true);
		respostas.add(new Resposta(pa, false));
		respostas.add(new Resposta(pb, false));
		respostas.add(new Resposta(pc, false));
		respostas.add(new Resposta(pd, false));
		return respostas;
		
	}
	private ArrayList<Pergunta> perguntasControladas(){
		ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();
		perguntas.add(new Pergunta("a", false));
		perguntas.add(new Pergunta("b", false));
		perguntas.add(new Pergunta("c", false));
		perguntas.add(new Pergunta("d", true));
		return perguntas;
	}
}
