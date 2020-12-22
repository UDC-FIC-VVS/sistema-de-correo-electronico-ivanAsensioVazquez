package gal.udc.fic.vvs.email.archivo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AudioTest {

	/*
	 * Test de unidad
	 * Test para obtener el contenido
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerContenido(){
		Audio audio = new Audio("Audio", "sonido");
		assertTrue("sonido" == audio.obtenerContenido());		
	}
	
	/*
	 * Test de unidad
	 * Test para obtener MymeType
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testMimeType(){
		Audio audio = new Audio("Audio", "sonido");
		assertTrue("audio/ogg" == audio.obtenerMimeType());		
	}
	
	/*
	 * Test de unidad
	 * Test para obtener el nombre
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testNombre(){
		Audio audio = new Audio("Audio", "sonido");
		assertTrue("Audio" == audio.obtenerNombre());		
	}
	
	/*
	 * Test de unidad
	 * Test para ver el espacio
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testTamaño(){
		Audio audio = new Audio("Audio", "sonido");
		assertTrue(6 == audio.obtenerTamaño());		
	}
	
	/*
	 * Test de unidad
	 * Test para ver la previsualización
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testPrevisualizacion(){
		Audio audio = new Audio("Audio", "sonido");
		assertTrue("Audio(6 bytes, audio/ogg)" == audio.obtenerPreVisualizacion());		
	}
	
}
