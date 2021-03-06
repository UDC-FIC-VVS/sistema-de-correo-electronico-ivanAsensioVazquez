package gal.udc.fic.vvs.email.archivador;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Mensaje;

public class LogTest {
	
	/*
	 * Test de unidad
	 * Test para ver el espacio disponible
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testEspacioDisponible() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Log log = new Log(archivador);
		int espacio = log.obtenerEspacioDisponible();
		assertTrue(espacio == 3);
	}
	
	/*
	 * Test de unidad
	 * Test para ver el espacio total
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testEspacio() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Log log = new Log(archivador);
		int espacio = log.obtenerEspacioTotal();
		assertTrue(espacio == 3);
	}
	
	/*
	 * Test de unidad
	 * Test para obtener el nombre
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerNombre() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Log log = new Log(archivador);
		assertTrue(log.obtenerNombre() == "Archivador");
	}
	
	/*
	 * Test de unidad
	 * Test para obtener el log
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void tesEstablecerObtenerLog() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Log log = new Log(archivador);
		log.establecerDelegado(archivador);
		assertTrue(null == log.obtenerDelegado());
	}
	
	/*
	 * Test de unidad
	 * Test para almacenar correo sin espacio disponible
	 * Tipo de prueba: Dinámica de caja negra negativa
	 * Selección de datos: menor que el disponible
	 */
	@Test
	public void testEstablecerCorreoError() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Log log = new Log(archivador);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		assertTrue(log.almacenarCorreo(mensaje) == false);
	}
	
	/*
	 * Test de unidad
	 * Test para establecer correo correctamente
	 * Tipo de prueba: Dinámica de caja negra  positiva
	 * Selección de datos: mayor que el disponible
	 */
	@Test
	public void testEstablecerCorreo() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 50);
		Log log = new Log(archivador);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		assertTrue(log.almacenarCorreo(mensaje) == true);
	}

}
