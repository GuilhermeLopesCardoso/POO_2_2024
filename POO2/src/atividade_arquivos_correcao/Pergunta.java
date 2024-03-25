package atividade_arquivos_correcao;

public class Pergunta {
    private String pergunta;
    private boolean resposta;


    public Pergunta criaPergunta (String linha) {
        String[] dados = linha.split(",");
        setPergunta(dados[0]);
       setResposta(dados[0], dados[1].equals("Verdadeiro"));
    }

    public Pergunta(String pergunta, boolean resposta) {
        super();
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    
    public String getPergunta() {
        return pergunta;
    }
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
    public boolean isResposta() {
        return resposta;
    }
    public void setResposta(boolean resposta) {
        this.resposta = resposta;
    }

    
}
