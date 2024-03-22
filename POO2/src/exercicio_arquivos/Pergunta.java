package exercicio_arquivos;

public class Pergunta {
    String pergunta;
    String resposta;
    int numero;
    
    
    public Pergunta(String pergunta, String resposta, int numero) {
    	this.pergunta = pergunta;
    	this.resposta = resposta;
        this.numero = numero;
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    

    
}
