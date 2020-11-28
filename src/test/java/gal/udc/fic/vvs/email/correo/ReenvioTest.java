package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;

public class ReenvioTest {
	
	@Test(expected = OperacionInvalida.class)
	public void testAñadirObtenerHijo() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		reenvio.obtenerHijo(0);
	}
	
	@Test
	public void testObtenerPadre() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		Correo reenvioBuscado = reenvio.obtenerPadre();
		assertTrue(reenvioBuscado == null);
	}
	
	@Test
	public void testObtenerIcono() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		int icono = reenvio.obtenerIcono();
		assertTrue(3 == icono);
	}
	
	@Test
	public void testBuscar() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		Reenvio reenvioBuscada = (Reenvio) reenvio.buscar("texto").toArray()[0];
		assertTrue(reenvioBuscada == reenvio);
	}
	
	@Test(expected = OperacionInvalida.class)
	public void testAñadirExplorar() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		reenvio.explorar();
	}
	
	@Test
	public void testLeidos() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		reenvio.establecerLeido(true);
		assertTrue(reenvio.obtenerNoLeidos() == 0);
	}
	
	@Test
	public void testTamaño() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		assertTrue(reenvio.obtenerTamaño() == 10);
	}
	
	@Test
	public void testObtenerVisualizacion() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		String string = "texto...";
		assertTrue(reenvio.obtenerVisualizacion() == string );
	}
	
	@Test
	public void testObtenerPreVisualizacion() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		assertTrue(reenvio.obtenerPreVisualizacion() == "texto...");
	}
	
	@Test
	public void testObtenerRuta() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		assertTrue(reenvio.obtenerRuta() == "texto...");
	}

}
