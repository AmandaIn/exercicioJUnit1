package test.calculadora;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import src.calculadora.Calculadora;

@DisplayName("Classe para teste da calculadora")
public class CalculadoraTest {
	
	private Calculadora calc;
	
	@BeforeEach
	public void inicializa() {
		calc = new Calculadora();
	}
	
	@DisplayName("Testa a soma de dois n�meros")
	@Test
	public void testSomaDoisNumeros() {
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@Test
	public void testDivisaoPorZero() {
		try {
			int divisao = calc.divisao(8, 0);
			fail("Exce��o n�o lan�ada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}



/* Casos de Teste Para a Classe Calculadora- Exerc�cio com entrega em 15/01 Amanda Inacio 
 * Testes Propostos:
 * Testar a subtra��o de um n�mero maior menos um n�mero menor;
 * Testar a subtra��o de um n�mero menor menos um n�mero maior;
 * Testar a multiplica��o entre dois n�meros;
 * Testar a fun��o de somat�ria; 
 * Testar se um n�mero � positivo;
 * Testar se um n�mero � maior, menor ou igual a outro;
 * 
 * 
 * */



@DisplayName("Testa a subtra��o entre dois n�meros")
@Test
public void testSubtrai() {
	int subtrai = calc.subtracao(6, 4);		
	Assertions.assertEquals(2, subtrai);		
}



@DisplayName("Testa a subtra��o entre dois n�meros dando negativo")
@Test
public void testSubtraiNegativo() {
	int subtraiNegativo = calc.subtracao(4, 6);		
	Assertions.assertEquals(-2, subtraiNegativo);		
}


@DisplayName("Testa a multiplica��o entre dois n�meros")
@Test
public void testMultiplica() {
	int multiplica = calc.multiplicacao(4, 6);		
	Assertions.assertEquals(24, multiplica);		
}


@DisplayName("Testa a fun��o de somatoria")
@Test
public void testSomatorio() {
	int somatoria = calc.somatoria(4);		
	Assertions.assertEquals(10, somatoria);		
}

@DisplayName("Testa se um n�mero � positivo, passando um positivo")
@Test
public void testEhpositivo() {
	
	boolean positivo = calc.ehPositivo(4);
    Assertions.assertEquals(true, positivo);		
}


@DisplayName("Testa se um n�mero � positivo, passando um negativo")
@Test
public void testEhpositivoN() {
	
	boolean positivo = calc.ehPositivo(-4);
    Assertions.assertEquals(false, positivo);		
}



@DisplayName("Testa se um n�mero � maior que outro")
@Test
public void testComparamaior() {
	
	int compara = calc.compara(6,4);
    Assertions.assertEquals(1, compara);		
}

@DisplayName("Testa se um n�mero � menor que outro")
@Test
public void testComparamenor() {
	
	int compara = calc.compara(4,6);
    Assertions.assertEquals(-1, compara);		
}

@DisplayName("Testa se um n�mero � igual a outro")
@Test
public void testComparaigual() {
	
	int compara = calc.compara(4,4);
    Assertions.assertEquals(0, compara);		
}


}
