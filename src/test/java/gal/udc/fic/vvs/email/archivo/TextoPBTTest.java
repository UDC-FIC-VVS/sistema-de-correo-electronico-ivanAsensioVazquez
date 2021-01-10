package gal.udc.fic.vvs.email.archivo;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class TextoPBTTest {
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad  nombre es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoNombreImagen(String name, String randomString) {
		Texto texto = new Texto(randomString, "sonido");
		assertTrue(randomString == texto.obtenerNombre());	
	}
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad  contenido es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoContenidoImagen(String name, String randomString) {
		Texto texto = new Texto("audio", randomString);
		assertTrue(randomString == texto.obtenerContenido());	
	}

}
