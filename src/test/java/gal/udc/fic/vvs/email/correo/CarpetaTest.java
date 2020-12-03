package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;

public class CarpetaTest {
	
	/*
	 * Test para obtener hijo
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testAñadirObtenerHijo() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		carpeta.añadir(carpeta2);
		Correo carpetaBuscada = carpeta.obtenerHijo(0);
		assertTrue(carpetaBuscada == carpeta2);
	}
	
	/*
	 * Test para obtener padre
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testAñadirObtenerPadre() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		carpeta.añadir(carpeta2);
		Correo carpetaBuscada = carpeta2.obtenerPadre();
		assertTrue(carpetaBuscada == carpeta);
	}
	
	/*
	 * Test para comprobar icono
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerIcono() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		int icono = carpeta.obtenerIcono();
		assertTrue(1 == icono);
	}
	
	/*
	 * Test para comprobar buscar
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testAñadirBuscar() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpeta.añadir(mensaje);
		Mensaje mensajeBuscado = (Mensaje) carpeta.buscar("texto").toArray()[0];
		assertTrue(mensajeBuscado == mensaje);
	}
	
	/*
	 * Test para comprobar explorar
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testAñadirExplorar() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpeta.añadir(mensaje);
		Mensaje mensajeBuscado = (Mensaje) carpeta.explorar().toArray()[0];
		assertTrue(mensajeBuscado == mensaje);
	}
	
	/*
	 * Test para probar eliminar
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
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
	
	/*
	 * Test para probar establecer leídos
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testLeidos() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		carpeta.añadir(carpeta2);
		carpeta.establecerLeido(true);
		assertTrue(carpeta.obtenerNoLeidos() == 0);
	}
	
	/*
	 * Test para comprobar tamaño
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testTamaño() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		carpeta.añadir(carpeta2);
		assertTrue(carpeta.obtenerTamaño() == 0);
	}
	
	/*
	 * Test para comprobar añadir padre
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testAñadirPadre() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		Carpeta carpeta3 = new Carpeta("carpeta3");
		carpeta.añadir(carpeta2);
		carpeta3.añadir(carpeta2);
		assertTrue(carpeta.obtenerTamaño() == 0);
	}
	
	/*
	 * Test para obtener previsualización
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerVisualizacion() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		carpeta.añadir(mensaje);
		String string = "carpeta (1)";
		assertTrue(carpeta.obtenerVisualizacion() == string );
	}
	
	/*
	 * Test para obtener previsualización
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerPreVisualizacion() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		assertTrue(carpeta.obtenerPreVisualizacion() == "carpeta");
	}
	
	/*
	 * Test para obtener ruta
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerRuta() throws OperacionInvalida {
		Carpeta carpeta = new Carpeta("carpeta");
		Carpeta carpeta2 = new Carpeta("carpeta2");
		carpeta.añadir(carpeta2);
		assertTrue(carpeta.obtenerRuta() == "carpeta");
	}

}
