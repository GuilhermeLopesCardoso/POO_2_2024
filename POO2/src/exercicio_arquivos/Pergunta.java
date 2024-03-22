package exercicio_arquivos;

public class Pergunta {
    String pergunta;
    String resposta;
    
    
    public Pergunta(String pergunta, String resposta) {
    	this.pergunta = pergunta;
    	this.resposta = resposta;
    }
    
    public String getPergunta() {
        return pergunta;
    }
    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }
    public String getResposta() {
        return resposta;
    }
    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    
}
