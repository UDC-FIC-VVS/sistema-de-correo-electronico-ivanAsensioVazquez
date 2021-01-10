package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class CarpetaPBTTest {

	/*
	 * Test de unidad 
	 * Test para ver si la propiedad icono es siempre la misma 
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoIconoCarpeta(String randomString) {
		Carpeta carpeta = new Carpeta(randomString);
		assertTrue(carpeta.obtenerIcono() == 1);
	}

}
