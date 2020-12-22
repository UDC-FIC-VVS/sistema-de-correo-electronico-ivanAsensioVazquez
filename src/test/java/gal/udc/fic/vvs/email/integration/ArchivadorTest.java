package gal.udc.fic.vvs.email.integration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivador.ArchivadorSimple;
import gal.udc.fic.vvs.email.archivador.Delegado;
import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Carpeta;
import gal.udc.fic.vvs.email.correo.CarpetaLimitada;
import gal.udc.fic.vvs.email.correo.Mensaje;
import gal.udc.fic.vvs.email.correo.OperacionInvalida;

public class ArchivadorTest {
	
	/*
	 * Test de integración
	 * Prueba almacenando correo de tipo mensaje en archivador
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoria
	 */
	@Test
	public void archivadorAlmacenarMensajeTest() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 50);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		assertTrue(archivador.almacenarCorreo(mensaje) == true);
	}
	
	/*
	 * Test de integración
	 * Prueba almacenando correo de tipo carpeta vacía en archivador
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: valores frontera (carptea sin mensajes)
	 */
	@Test
	public void archivadorAlmacenarCarpetaVaciaTest() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 50);
		Carpeta carpeta = new Carpeta("carpeta");
		assertTrue(archivador.almacenarCorreo(carpeta) == true);
	}
	
	/*
	 * Test de integración
	 * Prueba almacenando correo de tipo carpeta no vacía en archivador
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: valores frontera (carpeta sin mensajes)
	 */
	@Test
	public void archivadorAlmacenarCarpetaNoVaciaTest() throws OperacionInvalida {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 50);
		Carpeta carpeta = new Carpeta("carpeta");
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpeta.añadir(mensaje);
		assertTrue(archivador.almacenarCorreo(carpeta) == true);
	}
	
	/*
	 * Test de integración
	 * Prueba almacenando correo de tipo carpeta limmitada vacía en archivador
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: valores frontera (carptea sin mensajes)
	 */
	@Test
	public void archivadorAlmacenarCarpetaLimitadaVaciaTest() {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 50);
		Carpeta carpeta = new Carpeta("carpeta");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 50);
		assertTrue(archivador.almacenarCorreo(carpetaLimitada) == true);
	}
	
	/*
	 * Test de integración
	 * Prueba almacenando correo de tipo carpeta limitada no vacía en archivador
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: valores frontera (carpeta sin mensajes)
	 */
	@Test
	public void archivadorAlmacenarCarpetaLimitadaNoVaciaTest() throws OperacionInvalida {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", 50);
		Carpeta carpeta = new Carpeta("carpeta");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 50);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpetaLimitada.añadir(mensaje);
		assertTrue(archivador.almacenarCorreo(carpetaLimitada) == true);
	}

}
