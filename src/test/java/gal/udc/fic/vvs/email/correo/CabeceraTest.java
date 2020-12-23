package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;

public class CabeceraTest {
	
	/*
	 * Test de unidad
	 * Test para obtener hijo
	 * Tipo de prueba: Dinámica de caja negra negativa
	 * Selección de datos: aleatoría
	 */
	@Test(expected = OperacionInvalida.class)
	public void testAñadirObtenerHijo() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		Correo cabeceraBuscada = cabecera.obtenerHijo(0);
	}
	
	/*
	 * Test de unidad
	 * Test para obtener padre
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerPadre() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		Correo cabeceraBuscada = cabecera.obtenerPadre();
		assertTrue(cabeceraBuscada == null);
	}
	
	/*
	 * Test de unidad
	 * Test para obtener icono
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerIcono() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		int icono = cabecera.obtenerIcono();
		assertTrue(3 == icono);
	}
	
	/*
	 * Test de unidad
	 * Test para comprobar buscar
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testBuscar() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		Cabecera cabeceraBuscada = (Cabecera) cabecera.buscar("texto").toArray()[0];
		assertTrue(cabeceraBuscada == cabecera);
	}
	
	/*
	 * Test de unidad
	 * Test para ver que explorar fallar
	 * Tipo de prueba: Dinámica de caja negra  negativa
	 * Selección de datos: aleatoría
	 */
	@Test(expected = OperacionInvalida.class)
	public void testAñadirExplorar() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		cabecera.explorar();
	}
	
	/*
	 * Test de unidad
	 * Test para ver que añadir falla
	 * Tipo de prueba: Dinámica de caja negra negativa
	 * Selección de datos: aleatoría
	 */
	@Test(expected = OperacionInvalida.class)
	public void testAñadir() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		Texto texto2 = new Texto("texto1","texto");
		Mensaje mensaje2 = new Mensaje(texto2);
		Cabecera cabecera2 = new Cabecera(mensaje2, "Cabecera", "valor");
		cabecera.añadir(cabecera2);
	}
	
	/*
	 * Test de unidad
	 * Test para establecer leidos
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testLeidos() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		cabecera.establecerLeido(true);
		assertTrue(cabecera.obtenerNoLeidos() == 0);
	}
	
	/*
	 * Test de unidad
	 * Test para ver el tamaño
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testTamaño() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		assertTrue(cabecera.obtenerTamaño() == 18);
	}
	
	/*
	 * Test de unidad
	 * Test para ver que añadir padre falla
	 * Tipo de prueba: Dinámica de caja negra negativa
	 * Selección de datos: aleatoría
	 */
	@Test(expected = OperacionInvalida.class)
	public void testAñadirPadre() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		Texto texto2 = new Texto("texto1","texto");
		Mensaje mensaje2 = new Mensaje(texto2);
		Cabecera cabecera2 = new Cabecera(mensaje2, "Cabecera", "valor");
		cabecera.añadir(cabecera2);
	}
	
	/*
	 * Test de unidad
	 * Test para ver la visualización
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerVisualizacion() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		String string = "texto...";
		assertTrue(cabecera.obtenerVisualizacion() == string );
	}
	
	/*
	 * Test de unidad
	 * Test para ver obtener previsualización
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerPreVisualizacion() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		assertTrue(cabecera.obtenerPreVisualizacion() == "texto..");
	}
	
	/*
	 * Test de unidad
	 * Test para ver obtener ruta
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerRuta() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Cabecera cabecera = new Cabecera(mensaje, "Cabecera", "valor");
		assertTrue(cabecera.obtenerRuta() == "cabecera");
	}
}
