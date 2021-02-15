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
	
	@DisplayName("Testa a soma de dois números")
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
			fail("Exceção não lançada");
		}catch (ArithmeticException e) {
			assertEquals("/ by zero", e.getMessage());
		}		
	}
	
	@Test
	public void testDivisaoPorZeroComAssertThrows() {
		assertThrows(ArithmeticException.class,
				() -> calc.divisao(8, 0));
	}



/* Casos de Teste Para a Classe Calculadora- Exercício com entrega em 15/01 Amanda Inacio 
 * Testes Propostos:
 * Testar a subtração de um número maior menos um número menor;
 * Testar a subtração de um número menor menos um número maior;
 * Testar a multiplicação entre dois números;
 * Testar a função de somatória; 
 * Testar se um número é positivo;
 * Testar se um número é maior, menor ou igual a outro;
 * 
 * 
 * */



@DisplayName("Testa a subtração entre dois números")
@Test
public void testSubtrai() {
	int subtrai = calc.subtracao(6, 4);		
	Assertions.assertEquals(2, subtrai);		
}



@DisplayName("Testa a subtração entre dois números dando negativo")
@Test
public void testSubtraiNegativo() {
	int subtraiNegativo = calc.subtracao(4, 6);		
	Assertions.assertEquals(-2, subtraiNegativo);		
}


@DisplayName("Testa a multiplicação entre dois números")
@Test
public void testMultiplica() {
	int multiplica = calc.multiplicacao(4, 6);		
	Assertions.assertEquals(24, multiplica);		
}


@DisplayName("Testa a função de somatoria")
@Test
public void testSomatorio() {
	int somatoria = calc.somatoria(4);		
	Assertions.assertEquals(10, somatoria);		
}

@DisplayName("Testa se um número é positivo, passando um positivo")
@Test
public void testEhpositivo() {
	
	boolean positivo = calc.ehPositivo(4);
    Assertions.assertEquals(true, positivo);		
}


@DisplayName("Testa se um número é positivo, passando um negativo")
@Test
public void testEhpositivoN() {
	
	boolean positivo = calc.ehPositivo(-4);
    Assertions.assertEquals(false, positivo);		
}



@DisplayName("Testa se um número é maior que outro")
@Test
public void testComparamaior() {
	
	int compara = calc.compara(6,4);
    Assertions.assertEquals(1, compara);		
}

@DisplayName("Testa se um número é menor que outro")
@Test
public void testComparamenor() {
	
	int compara = calc.compara(4,6);
    Assertions.assertEquals(-1, compara);		
}

@DisplayName("Testa se um número é igual a outro")
@Test
public void testComparaigual() {
	
	int compara = calc.compara(4,4);
    Assertions.assertEquals(0, compara);		
}


}
