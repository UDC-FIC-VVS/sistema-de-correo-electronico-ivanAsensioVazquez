package gal.udc.fic.vvs.email.integration;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Carpeta;
import gal.udc.fic.vvs.email.correo.Mensaje;
import gal.udc.fic.vvs.email.correo.OperacionInvalida;

public class CorreoTest {
	
	/*
	 * Test de integración
	 * Prueba con email que contiene carpetas y mensajes
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoria
	 */
	@Test
	public void carpetasConMensajesExplorarTest() throws OperacionInvalida {
		List<Mensaje> listExpected = new ArrayList<>();
		Carpeta carpeta = new Carpeta("carpeta");
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpeta.añadir(mensaje);
		listExpected.add(mensaje);
		Texto texto2 = new Texto("texto2","texto");
		Mensaje mensaje2 = new Mensaje(texto2);
		carpeta.añadir(mensaje2);
		listExpected.add(mensaje2);
		Texto texto3 = new Texto("texto3","texto");
		Mensaje mensaje3 = new Mensaje(texto3);
		carpeta.añadir(mensaje3);
		listExpected.add(mensaje3);
		Object[] listFinded = carpeta.explorar().toArray();
		assertTrue(((Mensaje)listFinded[0]) == listExpected.get(0));
		assertTrue(((Mensaje)listFinded[1]) == listExpected.get(1));
		assertTrue(((Mensaje)listFinded[2]) == listExpected.get(2));
	}
	
	/*
	 * Test de integración
	 * Prueba con no leidos
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoria
	 */
	@Test
	public void carpetasConMensajesNoLeidosTest() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpeta.añadir(mensaje);
		Texto texto2 = new Texto("texto2","texto");
		Mensaje mensaje2 = new Mensaje(texto2);
		carpeta.añadir(mensaje2);
		Texto texto3 = new Texto("texto3","texto");
		Mensaje mensaje3 = new Mensaje(texto3);
		carpeta.añadir(mensaje3);
		assertTrue(carpeta.obtenerNoLeidos() == 3);
	}
	
	/*
	 * Test de integración
	 * Prueba con establecer leidos
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoria
	 */
	@Test
	public void carpetasConMensajesEstablecerLeidosTest() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpeta.añadir(mensaje);
		Texto texto2 = new Texto("texto2","texto");
		Mensaje mensaje2 = new Mensaje(texto2);
		carpeta.añadir(mensaje2);
		Texto texto3 = new Texto("texto3","texto");
		Mensaje mensaje3 = new Mensaje(texto3);
		carpeta.añadir(mensaje3);
		carpeta.establecerLeido(true);
		assertTrue(carpeta.obtenerNoLeidos() == 0);
	}


}
