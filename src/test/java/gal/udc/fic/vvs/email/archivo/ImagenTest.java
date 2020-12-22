package gal.udc.fic.vvs.email.archivo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ImagenTest {
	
	/*
	 * Test de unidad
	 * Test para obtener contenido
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerContenido(){
		Imagen imagen = new Imagen("Imagen", "sonido");
		assertTrue("sonido" == imagen.obtenerContenido());		
	}
	
	/*
	 * Test de unidad
	 * Test para obtener MimeType
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testMimeType(){
		Imagen imagen = new Imagen("Imagen", "sonido");
		assertTrue("image/png" == imagen.obtenerMimeType());		
	}
	
	/*
	 * Test de unidad
	 * Test para ver el nombre
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testNombre(){
		Imagen imagen = new Imagen("Imagen", "sonido");
		assertTrue("Imagen" == imagen.obtenerNombre());		
	}
	
	/*
	 * Test de unidad
	 * Test para ver el espacio 
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testTamaño(){
		Imagen imagen = new Imagen("Imagen", "sonido");
		assertTrue(6 == imagen.obtenerTamaño());		
	}
	
	/*
	 * Test de unidad
	 * Test para ver la previsualización
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testPrevisualizacion(){
		Imagen imagen = new Imagen("Imagen", "sonido");
		assertTrue("Imagen(6 bytes, image/png)" == imagen.obtenerPreVisualizacion());		
	}

}
