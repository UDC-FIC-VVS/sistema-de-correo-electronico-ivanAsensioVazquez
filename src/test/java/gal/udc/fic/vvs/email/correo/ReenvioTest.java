package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;

public class ReenvioTest {
	
	/*
	 * Test de unidad
	 * Test para ver que obtener Hijo falla
	 * Tipo de prueba: Dinámica de caja negra negativa
	 * Selección de datos: aleatoría
	 */
	@Test(expected = OperacionInvalida.class)
	public void testAñadirObtenerHijo() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		reenvio.obtenerHijo(0);
	}
	
	/*
	 * Test de unidad
	 * Test para ver el padre
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerPadre() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		Correo reenvioBuscado = reenvio.obtenerPadre();
		assertTrue(reenvioBuscado == null);
	}
	
	/*
	 * Test de unidad
	 * Test para ver el icono
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerIcono() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		int icono = reenvio.obtenerIcono();
		assertTrue(3 == icono);
	}
	
	/*
	 * Test de unidad
	 * Test para comprobar la función buscar
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testBuscar() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		Reenvio reenvioBuscada = (Reenvio) reenvio.buscar("texto").toArray()[0];
		assertTrue(reenvioBuscada == reenvio);
	}
	
	/*
	 * Test de unidad
	 * Test para ver que explorar falla
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test(expected = OperacionInvalida.class)
	public void testAñadirExplorar() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		reenvio.explorar();
	}
	
	/*
	 * Test de unidad
	 * Test para comprobar establecer leidos
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testLeidos() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		reenvio.establecerLeido(true);
		assertTrue(reenvio.obtenerNoLeidos() == 0);
	}
	
	/*
	 * Test de unidad
	 * Test para ver el tamaño total
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testTamaño() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		assertTrue(reenvio.obtenerTamaño() == 10);
	}
	
	/*
	 * Test de unidad
	 * Test para obtener visualización
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerVisualizacion() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		String stringReenvio = "texto\n" + 
				"\n" + 
				"---- Correo reenviado ----\n" + 
				"\n" + 
				"texto\n" + 
				"---- Fin correo reenviado ----";
		assertTrue(reenvio.obtenerVisualizacion().equals(stringReenvio));
	}
	
	/*
	 * Test de unidad
	 * Test para ver la previsualización
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerPreVisualizacion() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		assertTrue(reenvio.obtenerPreVisualizacion().equals("texto..."));
	}
	
	/*
	 * Test de unidad
	 * Test para obtener ruta
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerRuta() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Reenvio reenvio = new Reenvio(mensaje, mensaje);
		assertTrue(reenvio.obtenerRuta().equals("texto..."));
	}

}
