package gal.udc.fic.vvs.email.archivo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TextoTest {
	
	/*
	 * Test de unidad
	 * Test para ver el contenido
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerContenido(){
		Texto texto = new Texto("Texto", "sonido");
		assertTrue("sonido" == texto.obtenerContenido());		
	}
	
	/*
	 * Test de unidad
	 * Test para ver el MymeType
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testMimeType(){
		Texto texto = new Texto("Texto", "sonido");
		assertTrue("text/plain" == texto.obtenerMimeType());		
	}
	
	/*
	 * Test de unidad
	 * Test para ver el nombre
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testNombre(){
		Texto texto = new Texto("Texto", "sonido");
		assertTrue("Texto" == texto.obtenerNombre());		
	}
	
	/*
	 * Test de unidad
	 * Test para ver el espacio
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testTamaño(){
		Texto texto = new Texto("Texto", "sonido");
		assertTrue(6 == texto.obtenerTamaño());		
	}
	
	/*
	 * Test de unidad
	 * Test para ver la previsualización
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testPrevisualizacion(){
		Texto texto = new Texto("Texto", "sonido");
		assertTrue("Texto(6 bytes, text/plain)" == texto.obtenerPreVisualizacion());		
	}

}
