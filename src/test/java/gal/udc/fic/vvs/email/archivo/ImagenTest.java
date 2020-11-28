package gal.udc.fic.vvs.email.archivo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ImagenTest {
	
	@Test
	public void testObtenerContenido(){
		Imagen imagen = new Imagen("Imagen", "sonido");
		assertTrue("sonido" == imagen.obtenerContenido());		
	}
	
	@Test
	public void testMimeType(){
		Imagen imagen = new Imagen("Imagen", "sonido");
		assertTrue("image/png" == imagen.obtenerMimeType());		
	}
	
	@Test
	public void testNombre(){
		Imagen imagen = new Imagen("Imagen", "sonido");
		assertTrue("Imagen" == imagen.obtenerNombre());		
	}
	
	@Test
	public void testTamaño(){
		Imagen imagen = new Imagen("Imagen", "sonido");
		assertTrue(6 == imagen.obtenerTamaño());		
	}
	
	@Test
	public void testPrevisualizacion(){
		Imagen imagen = new Imagen("Imagen", "sonido");
		assertTrue("Imagen(6 bytes, image/png)" == imagen.obtenerPreVisualizacion());		
	}

}
