package gal.udc.fic.vvs.email.archivo;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class AudioPBTTest {
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad  nombre es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoNombreAudio(String name, String randomString) {
		Audio audio = new Audio(randomString, "sonido");
		assertTrue(randomString == audio.obtenerNombre());	
	}
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad contenido es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoContenidoAudio(String name, String randomString) {
		Audio audio = new Audio("audio", randomString);
		assertTrue(randomString == audio.obtenerContenido());	
	}

}
