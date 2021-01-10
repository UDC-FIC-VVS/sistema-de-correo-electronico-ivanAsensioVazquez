package gal.udc.fic.vvs.email.archivo;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class ImagenPBTTest {
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad  nombre es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoNombreImagen(String name, String randomString) {
		Imagen imagen = new Imagen(randomString, "sonido");
		assertTrue(randomString == imagen.obtenerNombre());	
	}
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad  contenido es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoContenidoImagen(String name, String randomString) {
		Imagen imagen = new Imagen("audio", randomString);
		assertTrue(randomString == imagen.obtenerContenido());	
	}

}
