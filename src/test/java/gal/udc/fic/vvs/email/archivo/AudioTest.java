package gal.udc.fic.vvs.email.archivo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AudioTest {

	@Test
	public void testObtenerContenido(){
		Audio audio = new Audio("Audio", "sonido");
		assertTrue("sonido" == audio.obtenerContenido());		
	}
	
	@Test
	public void testMimeType(){
		Audio audio = new Audio("Audio", "sonido");
		assertTrue("audio/ogg" == audio.obtenerMimeType());		
	}
	
	@Test
	public void testNombre(){
		Audio audio = new Audio("Audio", "sonido");
		assertTrue("Audio" == audio.obtenerNombre());		
	}
	
	@Test
	public void testTamaño(){
		Audio audio = new Audio("Audio", "sonido");
		assertTrue(6 == audio.obtenerTamaño());		
	}
	
	@Test
	public void testPrevisualizacion(){
		Audio audio = new Audio("Audio", "sonido");
		assertTrue("Audio(6 bytes, audio/ogg)" == audio.obtenerPreVisualizacion());		
	}
	
}
