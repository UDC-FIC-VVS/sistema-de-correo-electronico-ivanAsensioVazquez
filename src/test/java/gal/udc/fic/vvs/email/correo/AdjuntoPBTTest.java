package gal.udc.fic.vvs.email.correo;
import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import gal.udc.fic.vvs.email.archivo.Texto;

@RunWith(JUnitQuickcheck.class)
public class AdjuntoPBTTest {
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad icono es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoIconoAdjunto(String name, String randomString) {
		Texto texto = new Texto(randomString, randomString);
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		assertTrue(adjunto.obtenerIcono() == 3);
	}

}
