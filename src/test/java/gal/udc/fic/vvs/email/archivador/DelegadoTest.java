package gal.udc.fic.vvs.email.archivador;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Mensaje;

public class DelegadoTest {
	
	@Test
	public void testEspacioDisponible() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Delegado delegado = new Delegado(archivador);
		int espacio = delegado.obtenerEspacioDisponible();
		assertTrue(espacio == 3);
	}
	
	@Test
	public void testEspacio() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Delegado delegado = new Delegado(archivador);
		int espacio = delegado.obtenerEspacioTotal();
		assertTrue(espacio == 3);
	}
	
	@Test
	public void testObtenerNombre() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Delegado delegado = new Delegado(archivador);
		assertTrue(delegado.obtenerNombre() == "Archivador");
	}
	
	@Test
	public void tesEstablecerObtenerDelegado() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Delegado delegado = new Delegado(archivador);
		delegado.establecerDelegado(archivador);
		assertTrue(archivador == delegado.obtenerDelegado());
	}
	
	@Test
	public void testEstablecerCorreoError() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 3);
		Delegado delegado = new Delegado(archivador);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		delegado.establecerDelegado(archivador);
		assertTrue(delegado.almacenarCorreo(mensaje) == false);
	}
	
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
