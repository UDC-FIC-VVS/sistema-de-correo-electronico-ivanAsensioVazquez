package gal.udc.fic.vvs.email.archivo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TextoTest {
	
	@Test
	public void testObtenerContenido(){
		Texto texto = new Texto("Texto", "sonido");
		assertTrue("sonido" == texto.obtenerContenido());		
	}
	
	@Test
	public void testMimeType(){
		Texto texto = new Texto("Texto", "sonido");
		assertTrue("text/plain" == texto.obtenerMimeType());		
	}
	
	@Test
	public void testNombre(){
		Texto texto = new Texto("Texto", "sonido");
		assertTrue("Texto" == texto.obtenerNombre());		
	}
	
	@Test
	public void testTamaño(){
		Texto texto = new Texto("Texto", "sonido");
		assertTrue(6 == texto.obtenerTamaño());		
	}
	
	@Test
	public void testPrevisualizacion(){
		Texto texto = new Texto("Texto", "sonido");
		assertTrue("Texto(6 bytes, text/plain)" == texto.obtenerPreVisualizacion());		
	}

}
