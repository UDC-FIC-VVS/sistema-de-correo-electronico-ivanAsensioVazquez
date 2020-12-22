package gal.udc.fic.vvs.email.integration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Audio;
import gal.udc.fic.vvs.email.archivo.Imagen;
import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Adjunto;
import gal.udc.fic.vvs.email.correo.Mensaje;

public class DecoradorTest {
	
	/*
	 * Test de integración
	 * Prueba con adjunto tipo texto adjuntado a un mensaje
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoria
	 */
	@Test
	public void adjuntoTextoConMensajeTest() {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		assertTrue(adjunto.obtenerTamaño() == 10);
	}
	
	/*
	 * Test de integración
	 * Prueba con adjunto tipo Imagen adjuntado a un mensaje
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoria
	 */
	@Test
	public void adjuntoImagenConMensajeTest() {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Imagen imagen = new Imagen("imagen", "imagen");
		Adjunto adjunto = new Adjunto(mensaje, imagen);
		assertEquals(adjunto.obtenerTamaño(), 11);
	}
	
	/*
	 * Test de integración
	 * Prueba con adjunto tipo audio adjuntado a un mensaje
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoria
	 */
	@Test
	public void adjuntoAudioConMensajeTest() {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Audio audio = new Audio("imagen", "imagen");
		Adjunto adjunto = new Adjunto(mensaje, audio);
		assertEquals(adjunto.obtenerTamaño(), 11);
	}

}
