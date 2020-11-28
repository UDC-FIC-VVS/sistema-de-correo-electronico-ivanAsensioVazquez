package gal.udc.fic.vvs.email.archivador;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Mensaje;

public class ArchivadorSimpleTest {

	@Test
	public void testEspacioDisponible() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 3);
		int espacio = simple.obtenerEspacioDisponible();
		assertTrue(espacio == 3);
	}
	
	@Test
	public void testEspacio() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 3);
		int espacio = simple.obtenerEspacioTotal();
		assertTrue(espacio == 3);
	}
	
	@Test
	public void testObtenerNombre() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 3);
		assertTrue(simple.obtenerNombre() == "Archivador");
	}
	
	@Test
	public void tesEstablecerObtenerDelegado() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 3);
		ArchivadorSimple delegado = new ArchivadorSimple("Delegado", 3);
		simple.establecerDelegado(delegado);
		Archivador archivador = simple.obtenerDelegado();
		assertTrue(archivador == null);
	}
	
	@Test
	public void testEstablecerCorreoError() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 3);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		assertTrue(simple.almacenarCorreo(mensaje) == false);
	}
	
	@Test
	public void testEstablecerCorreo() {
		ArchivadorSimple simple = new ArchivadorSimple("Archivador", 50);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		assertTrue(simple.almacenarCorreo(mensaje) == true);
	}
}
