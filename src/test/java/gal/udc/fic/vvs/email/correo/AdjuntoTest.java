package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;

public class AdjuntoTest {
	
	@Test(expected = OperacionInvalida.class)
	public void testAñadirObtenerHijo() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
	}
	
	@Test
	public void testObtenerPadre() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		Correo adjuntoBuscada = adjunto.obtenerPadre();
		assertTrue(adjuntoBuscada == null);
	}
	
	@Test
	public void testObtenerIcono() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		int icono = adjunto.obtenerIcono();
		assertTrue(3 == icono);
	}
	
	@Test
	public void testBuscar() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		Adjunto adjuntoBuscada = (Adjunto) adjunto.buscar("texto").toArray()[0];
		assertTrue(adjuntoBuscada == adjunto);
	}
	
	@Test(expected = OperacionInvalida.class)
	public void testAñadirExplorar() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		adjunto.explorar();
	}
	
	@Test(expected = OperacionInvalida.class)
	public void testAñadir() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		Texto texto2 = new Texto("texto1","texto");
		Mensaje mensaje2 = new Mensaje(texto2);
		Cabecera adjunto2 = new Cabecera(mensaje2, "Cabecera", "valor");
		adjunto.añadir(adjunto2);
	}
	
	@Test
	public void testLeidos() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		adjunto.establecerLeido(true);
		assertTrue(adjunto.obtenerNoLeidos() == 0);
	}
	
	@Test
	public void testTamaño() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		assertTrue(adjunto.obtenerTamaño() == 10);
	}
	
	@Test(expected = OperacionInvalida.class)
	public void testAñadirPadre() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		Texto texto2 = new Texto("texto1","texto");
		Mensaje mensaje2 = new Mensaje(texto2);
		Cabecera adjunto2 = new Cabecera(mensaje2, "Cabecera", "valor");
		adjunto.añadir(adjunto2);
	}
	
	@Test
	public void testObtenerVisualizacion() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		String string = "texto...";
		assertTrue(adjunto.obtenerVisualizacion() == string );
	}
	
	@Test
	public void testObtenerPreVisualizacion() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		assertTrue(adjunto.obtenerPreVisualizacion() == "texto...");
	}
	
	@Test
	public void testObtenerRuta() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		assertTrue(adjunto.obtenerRuta() == "texto...");
	}

}
