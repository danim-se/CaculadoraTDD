package calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalcularTest{
	
	Calcular  calcular;
		
	@Before
	public void setUp() throws Exception{
		this.calcular = new Calcular();
	}
	
	@Test
	public void testeSomaValoresPositivo() {
		assertEquals("", 9, this.calcular.soma(4, 5));
	}
	
	private void assertEquals(String string, int i, int soma) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testeSomaValoresNegativos() {
		assertEquals("", -4, this.calcular .soma(-1, -3));
	}
	
	@Test
	public void testeSubtracaoValoresPositivos() {
		assertEquals(0, this.calcular .subtrai(5, 5));
	}
	private void assertEquals(int i, int subtrai) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testeMultiplicacaoValoresPositivos() {
		assertEquals("", this.calcular .multiplicar(5, 5));
	}
	private void assertEquals(String string, int multiplicar) {
		// TODO Auto-generated method stub
		
	}

	@Test
	public void testeDividirValoresPositivos() {
		assertEquals("", this.calcular .subtrai(0, 5));
	}
	

}






