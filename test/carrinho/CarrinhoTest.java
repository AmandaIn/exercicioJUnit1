package test.carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import src.carrinho.Carrinho;
import src.produto.Produto;
import src.produto.ProdutoNaoEncontradoException;


/* Casos de Teste Para a Classe Carrinho- Exerc�cio com entrega em 15/01 Amanda Inacio 
 * Testes Propostos:
 * Testar a fun��o que adicona produtos ao carrinho;
 * Testar a soma do valor total dos produtos do carrinho;
 * Testar se a quantidade de itens no carrinho est� correta;
 * Testar se o item est� sendo  removido do carrinho (neste teste eu tive muita dificuldade e n�o sei bem se como ficou est� correto).
 * 
 
 * 
 * */
public class CarrinhoTest {
	
	

	Carrinho itens;
	Produto livro1, livro2,livro3;
		
		@BeforeEach
		public void inicializaLivro() {
			livro1 = new Produto("Introdu��o ao Teste de Software", 100.00);
			livro2 = new Produto("Qualidade e Teste", 98.00);
			livro3 = new Produto("Qualidade", 97.00);
		}
		
		@DisplayName("Testar se os produtos est�o sendo adicionados ao carrinho")
		@BeforeEach
		@Test
		public void inicializaCarrinho() {
			itens = new Carrinho();
			itens.addItem(livro1);
			itens.addItem(livro2);
			itens.addItem(livro3);
				
			}
		
		@DisplayName("Testa se o valor total est� correto")
		@Test
		public void testValortotal() {
			double valorTotal = itens.getValorTotal();	
			
			Assertions.assertEquals(295.00, valorTotal);		
		}

		
	
		@DisplayName("Testa se a quantidade de itens do carrinho est� correta")
		@Test
		public void testQtdItem() {
			int qtd = itens.getQtdeItems();
			
			
			Assertions.assertEquals(3, qtd);		
		}

		
	

		@DisplayName("Testa se o produto est� sendo removido do carrinho")
		@Test
		public void testRemoveItem() throws ProdutoNaoEncontradoException {
			itens.removeItem(livro1);
											
		}

	
	
		
	

}
