package gal.udc.fic.vvs.email.archivador;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Mensaje;

public class DelegadoTest {
	
	/*
	 * Test para ver el espacio disponible
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testEspacioDisponible() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Delegado delegado = new Delegado(archivador);
		int espacio = delegado.obtenerEspacioDisponible();
		assertTrue(espacio == 3);
	}
	
	/*
	 * Test para ver el espacio total
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testEspacio() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Delegado delegado = new Delegado(archivador);
		int espacio = delegado.obtenerEspacioTotal();
		assertTrue(espacio == 3);
	}
	
	/*
	 * Test para obtener nombre
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerNombre() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Delegado delegado = new Delegado(archivador);
		assertTrue(delegado.obtenerNombre() == "Archivador");
	}
	
	/*
	 * Test para establecer y obtener el delegado
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void tesEstablecerObtenerDelegado() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Delegado delegado = new Delegado(archivador);
		delegado.establecerDelegado(archivador);
		assertTrue(archivador == delegado.obtenerDelegado());
	}
	
	/*
	 * Test para establecer correo fallando
	 * Tipo de prueba: Dinámica de caja negra negativa
	 * Selección de datos: menor que el disponible
	 */
	@Test
	public void testEstablecerCorreoError() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Delegado delegado = new Delegado(archivador);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		delegado.establecerDelegado(archivador);
		assertTrue(delegado.almacenarCorreo(mensaje) == false);
	}
	
	/*
	 * Test para establecer correo correctamente
	 * Tipo de prueba: Dinámica de caja negra positiva
	 * Selección de datos: mayor que el disponible
	 */
	@Test
	public void testEstablecerCorreo() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 50);
		Delegado delegado = new Delegado(archivador);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		delegado.establecerDelegado(archivador);
		assertTrue(delegado.almacenarCorreo(mensaje) == true);
	}

}
