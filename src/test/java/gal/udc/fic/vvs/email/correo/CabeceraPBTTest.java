package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertTrue;

import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

import gal.udc.fic.vvs.email.archivo.Texto;

@RunWith(JUnitQuickcheck.class)
public class CabeceraPBTTest {

	/*
	 * Test de unidad 
	 * Test para ver si la propiedad icono es siempre la misma 
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoIconoCabecera(String randomString, String randomContenido, String randomNombre,
			String randomValor) {
		Texto texto = new Texto(randomString, randomContenido);
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, randomNombre, randomValor);
		assertTrue(cabecera.obtenerIcono() == 3);
	}

}
