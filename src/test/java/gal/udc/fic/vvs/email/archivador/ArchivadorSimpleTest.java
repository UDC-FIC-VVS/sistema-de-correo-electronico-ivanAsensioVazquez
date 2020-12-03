package gal.udc.fic.vvs.email.archivador;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Mensaje;

public class ArchivadorSimpleTest {

	/*
	 * Test para ver el espacio disponible
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testEspacioDisponible() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 3);
		int espacio = simple.obtenerEspacioDisponible();
		assertTrue(espacio == 3);
	}
	
	/*
	 * Test para ver el espacio total
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testEspacio() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 3);
		int espacio = simple.obtenerEspacioTotal();
		assertTrue(espacio == 3);
	}
	
	/*
	 * Test para obetner el nombre
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */	
	@Test
	public void testObtenerNombre() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 3);
		assertTrue(simple.obtenerNombre() == "Archivador");
	}
	
	/*
	 * Test para ver y establecer el delegado
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Test
	public void tesEstablecerObtenerDelegado() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 3);
		ArchivadorSimple delegado = new ArchivadorSimple("Delegado", 3);
		simple.establecerDelegado(delegado);
		Archivador archivador = simple.obtenerDelegado();
		assertTrue(archivador == null);
	}
	
	/*
	 * Test para ver el espacio disponible
	 * Tipo de prueba: Dinámica de caja negra negativa
	 * Selección de datos: tamaño menor que el disponible
	 * 
	 */
	@Test
	public void testEstablecerCorreoNegativa() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 3);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		assertTrue(simple.almacenarCorreo(mensaje) == false);
	}
	
	/*
	 * Test para establecer correo
	 * Tipo de prueba: Dinámica de caja negra positiva
	 * Selección de datos: tamaño superior al disponible
	 */
	@Test
	public void testEstablecerCorreo() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 50);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		assertTrue(simple.almacenarCorreo(mensaje) == true);
	}
}
