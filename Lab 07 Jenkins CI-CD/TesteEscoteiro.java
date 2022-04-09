import org.junit.jupiter.api.Test;

import main.Escoteiro;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TesteEscoteiro {

	@Test
	public void naoDeveReceberSubsidio() {
			Escoteiro escoteiro = new Escoteiro("LOBO", 0);
			
			assertEquals(0, escoteiro.valorSubsidio());
	}
	@Test
	public void deveReceberSubsidioDe25() {
			Escoteiro escoteiro = new Escoteiro("LOBO", 1);
			
			assertEquals(25, escoteiro.valorSubsidio());
	}
	@Test
	public void deveReceberSubsidioDe35() {
			Escoteiro escoteiro = new Escoteiro("LOBO", 2);
			
			assertEquals(35, escoteiro.valorSubsidio());
	}
	@Test
	public void deveReceberSubsidioDe50() {
			Escoteiro escoteiro = new Escoteiro("LOBO", 3);
			
			assertEquals(50, escoteiro.valorSubsidio());
	}
	
	@Test
	public void naoDeveReceberSubsidioExtra() {
		Escoteiro escoteiro = new Escoteiro("LOBINHO", 3);
		
		assertEquals(0, escoteiro.valorSubsidioExtra());		
}
	@Test
	public void deveReceberSubsidioExtraDe10() {
		Escoteiro escoteiro = new Escoteiro("LOBO", 3);
		
		assertEquals(10, escoteiro.valorSubsidioExtra());		
}
	@Test
	public void deveReceberSubsidioExtraDe15() {
		Escoteiro escoteiro = new Escoteiro("URSO", 3);
		
		assertEquals(15, escoteiro.valorSubsidioExtra());		
}
	@Test
	public void deveReceberSubsidioExtraDe20() {
		Escoteiro escoteiro = new Escoteiro("LEÃO", 3);
		
		assertEquals(20, escoteiro.valorSubsidioExtra());		
}
	
	
}