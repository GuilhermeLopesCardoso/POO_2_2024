package banco_de_dados.banco_de_dados_Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import banco_de_dados.CidadeService;
import banco_de_dados.Conexao;
import banco_de_dados.model.Cidade;

public class ConexaoTest {
    @Test
    @Order(1)
    void conexaoTest() {
        assertNotNull(Conexao.conectaMySql());
    }
    /*
    @Test
    void insereCidadeTest() {
    	Cidade c = new Cidade(0,"Araranguá","SC");
    	assertEquals(1,CidadeService.insereCidade(c));
    }*/
    
//    @Test
//    @Order(2)
//    void alteraCidadeExistente() {
//    	Cidade c = new Cidade(5,"Goiânia", "GO");
//    	assertEquals(1, CidadeService.alteraCidade(c));
//    }
//    
//    @Test
//    @Order(3)
//    void alteraCidadeInexistente() {
//    	Cidade c = new Cidade(25,"Brasília","DF");
//    	assertEquals(0,CidadeService.alteraCidade(c));
//    }
    
//    @Test
//    @Order(4)
//    void excluiCidadeExistente() {
//    	Cidade c = new Cidade(1,"","");
//    	assertEquals(1,CidadeService.excluiCidade(c));
//    }
    
//    @Test
//    @Order(5)
//    void excluiCidadeInexistente() {
//    	Cidade c = new Cidade(1,"","");
//    	assertEquals(0,CidadeService.excluiCidade(c));
//    }
    
    @Test
    void listaCidadeTest() {
    	ArrayList<Cidade> lista = CidadeService.listaAll();
    	for (Cidade c : lista) {
    		System.out.println(c);
    	}
    }
}
