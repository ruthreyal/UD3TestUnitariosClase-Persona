package es.iessoterohernandez.daw.endes.TestUnitarioUD3;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class PersonaTest 
{
	
	private Persona p;
	
	@BeforeEach
	public void init() {
		 p = new Persona("Juan", 45,'H',80,1.80);
	}
	
	
	
	@Test
	public void testIMC() {
	assertEquals(Persona.PESO_IDEAL, p.calcularIMC());
		
	p.setPeso(19);
	assertEquals(Persona.INFRAPESO,p.calcularIMC());
	
	p.setPeso(150);
	assertEquals(Persona.SOBREPESO,p.calcularIMC());
	}
	

	@Test 
	public void testMayorEdad() {
		p.setEdad(45);
		assertTrue(p.esMayorDeEdad());
	}
	
	

	
	

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
        
        
    }
}
