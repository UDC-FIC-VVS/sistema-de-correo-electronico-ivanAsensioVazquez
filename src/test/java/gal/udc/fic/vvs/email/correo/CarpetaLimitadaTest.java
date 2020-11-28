package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;

public class CarpetaLimitadaTest {
	
	@Test
	public void testAñadirObtenerHijo() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		Carpeta carpeta2 = new Carpeta("carpetaLimitada2");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		CarpetaLimitada carpetaLimitada2 = new CarpetaLimitada(carpeta2, 2);
		carpetaLimitada.añadir(carpetaLimitada2);
		Correo carpetaLimitadaBuscada = carpetaLimitada.obtenerHijo(0);
		assertTrue(carpetaLimitadaBuscada == carpetaLimitada2);
	}
	
	@Test
	public void testAñadirObtenerPadre() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		Carpeta carpeta2 = new Carpeta("carpetaLimitada2");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		CarpetaLimitada carpetaLimitada2 = new CarpetaLimitada(carpeta2, 2);
		carpetaLimitada.añadir(carpetaLimitada2);
		Correo carpetaLimitadaBuscada = carpetaLimitada2.obtenerPadre();
		assertTrue(carpetaLimitadaBuscada == carpeta);
	}
	
	@Test
	public void testObtenerIcono() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		int icono = carpetaLimitada.obtenerIcono();
		assertTrue(1 == icono);
	}
	
	@Test
	public void testAñadirBuscar() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpetaLimitada.añadir(mensaje);
		Mensaje mensajeBuscado = (Mensaje) carpetaLimitada.buscar("texto").toArray()[0];
		assertTrue(mensajeBuscado == mensaje);
	}
	
	@Test
	public void testAñadirExplorar() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpetaLimitada.añadir(mensaje);
		Mensaje mensajeBuscado = (Mensaje) carpetaLimitada.explorar().toArray()[0];
		assertTrue(mensajeBuscado == mensaje);
	}
	
	@Test
	public void testAñadirEliminar() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		Carpeta carpeta2 = new Carpeta("carpetaLimitada2");
		Carpeta carpeta3 = new Carpeta("carpetaLimitada3");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		CarpetaLimitada carpetaLimitada2 = new CarpetaLimitada(carpeta2, 2);
		CarpetaLimitada carpetaLimitada3 = new CarpetaLimitada(carpeta3, 2);
		carpetaLimitada2.añadir(carpetaLimitada3);
		carpetaLimitada.añadir(carpetaLimitada2);
		carpetaLimitada.eliminar(carpetaLimitada2);
		assertTrue(carpetaLimitada.explorar().isEmpty());
	}
	
	@Test
	public void testLeidos() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		Carpeta carpeta2 = new Carpeta("carpetaLimitada2");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		CarpetaLimitada carpetaLimitada2 = new CarpetaLimitada(carpeta2, 2);
		carpetaLimitada.añadir(carpetaLimitada2);
		carpetaLimitada.establecerLeido(true);
		assertTrue(carpetaLimitada.obtenerNoLeidos() == 0);
	}
	
	@Test
	public void testTamaño() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		Carpeta carpeta2 = new Carpeta("carpetaLimitada2");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		CarpetaLimitada carpetaLimitada2 = new CarpetaLimitada(carpeta2, 2);
		carpetaLimitada.añadir(carpetaLimitada2);
		assertTrue(carpetaLimitada.obtenerTamaño() == 0);
	}
	
	@Test
	public void testAñadirPadre() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		Carpeta carpeta2 = new Carpeta("carpetaLimitada2");
		Carpeta carpeta3 = new Carpeta("carpetaLimitada3");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		CarpetaLimitada carpetaLimitada2 = new CarpetaLimitada(carpeta2, 2);
		CarpetaLimitada carpetaLimitada3 = new CarpetaLimitada(carpeta3, 2);
		carpetaLimitada.añadir(carpetaLimitada2);
		carpetaLimitada3.añadir(carpetaLimitada2);
		assertTrue(carpetaLimitada.obtenerTamaño() == 0);
	}
	
	@Test
	public void testObtenerVisualizacion() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpetaLimitada.añadir(mensaje);
		String string = "carpetaLimitada (1)";
		assertTrue(carpetaLimitada.obtenerVisualizacion() == string );
	}
	
	@Test
	public void testObtenerPreVisualizacion() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		assertTrue(carpetaLimitada.obtenerPreVisualizacion() == "carpetaLimitada");
	}
	
	@Test
	public void testObtenerRuta() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpetaLimitada");
		Carpeta carpeta2 = new Carpeta("carpetaLimitada2");
		CarpetaLimitada carpetaLimitada = new CarpetaLimitada(carpeta, 2);
		CarpetaLimitada carpetaLimitada2 = new CarpetaLimitada(carpeta2, 2);
		carpetaLimitada.añadir(carpetaLimitada2);
		assertTrue(carpetaLimitada.obtenerRuta() == "carpetaLimitada");
	}

}