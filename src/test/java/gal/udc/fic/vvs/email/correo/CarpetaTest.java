package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;

public class CarpetaTest {
	
	@Test
	public void testAñadirObtenerHijo() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		carpeta.añadir(carpeta2);
		Correo carpetaBuscada = carpeta.obtenerHijo(0);
		assertTrue(carpetaBuscada == carpeta2);
	}
	
	@Test
	public void testAñadirObtenerPadre() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		carpeta.añadir(carpeta2);
		Correo carpetaBuscada = carpeta2.obtenerPadre();
		assertTrue(carpetaBuscada == carpeta);
	}
	
	@Test
	public void testObtenerIcono() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		int icono = carpeta.obtenerIcono();
		assertTrue(1 == icono);
	}
	
	@Test
	public void testAñadirBuscar() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpeta.añadir(mensaje);
		Mensaje mensajeBuscado = (Mensaje) carpeta.buscar("texto").toArray()[0];
		assertTrue(mensajeBuscado == mensaje);
	}
	
	@Test
	public void testAñadirExplorar() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpeta.añadir(mensaje);
		Mensaje mensajeBuscado = (Mensaje) carpeta.explorar().toArray()[0];
		assertTrue(mensajeBuscado == mensaje);
	}
	
	@Test
	public void testAñadirEliminar() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		Carpeta carpeta3 = new Carpeta("carpeta3");
		carpeta2.añadir(carpeta3);
		carpeta.añadir(carpeta2);
		carpeta.eliminar(carpeta2);
		assertTrue(carpeta.explorar().isEmpty());
	}
	
	@Test
	public void testLeidos() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		carpeta.añadir(carpeta2);
		carpeta.establecerLeido(true);
		assertTrue(carpeta.obtenerNoLeidos() == 0);
	}
	
	@Test
	public void testTamaño() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		carpeta.añadir(carpeta2);
		assertTrue(carpeta.obtenerTamaño() == 0);
	}
	
	@Test
	public void testAñadirPadre() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		Carpeta carpeta3 = new Carpeta("carpeta3");
		carpeta.añadir(carpeta2);
		carpeta3.añadir(carpeta2);
		assertTrue(carpeta.obtenerTamaño() == 0);
	}
	
	@Test
	public void testObtenerVisualizacion() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpeta.añadir(mensaje);
		String string = "carpeta (1)";
		assertTrue(carpeta.obtenerVisualizacion() == string );
	}
	
	@Test
	public void testObtenerPreVisualizacion() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		assertTrue(carpeta.obtenerPreVisualizacion() == "carpeta");
	}
	
	@Test
	public void testObtenerRuta() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		carpeta.añadir(carpeta2);
		assertTrue(carpeta.obtenerRuta() == "carpeta");
	}

}
