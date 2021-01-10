package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class CarpetaLimitadaPBTTest {

	/*
	 * Test de unidad 
	 * Test para ver si la propiedad icono es siempre la misma 
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoIconoCarpetaLimitada(String randomString, @InRange(min = "1") int randomSize) {
		Carpeta carpeta = new Carpeta(randomString);
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, randomSize);
		assertTrue(carpetaLimitada.obtenerIcono() == 1);
	}

}
