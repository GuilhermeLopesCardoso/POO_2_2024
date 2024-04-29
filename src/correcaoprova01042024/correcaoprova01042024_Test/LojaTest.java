package correcaoprova01042024.correcaoprova01042024_Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

import correcaoprova01042024.Loja;

class LojaTest {
	
	private Loja loja = new Loja();

	@Test
	void carregaProdutoTest() {
		loja.carregaProdutos();
		assertFalse(loja.getProdutos().size() == 0);
		assertTrue(loja.getProdutos().size() == 50);
		assertEquals("Banana", loja.getProdutos().get(0).getNome());
	}

	@Test
	void carregaListaCompraTest() {
		loja.carregaProdutos();
		loja.carregaListaCompra();
		assertFalse(loja.getItens().size() == 0);
		assertTrue(loja.getItens().size() == 10);
		assertEquals("Maçã", loja.getItens().get(0).getProduto().getNome());
	}
	
	@Test
	void processarCompraTest() {
		loja.carregaProdutos();
		loja.carregaListaCompra();
		loja.processarCompra();
		assertTrue(new File("Compra.txt").exists());
		assertEquals(179.5, loja.getTotalCompra());
	}
	
	

}