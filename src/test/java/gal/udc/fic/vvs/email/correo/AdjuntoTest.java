package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import gal.udc.fic.vvs.email.archivo.Texto;

public class AdjuntoTest {
	
	/*
	 * Test para obtener hijo falle
	 * Tipo de prueba: Dinámica de caja negra negativa
	 * Selección de datos: aleatoría
	 */
	@Test(expected = OperacionInvalida.class)
	public void testAñadirObtenerHijo() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		adjunto.obtenerHijo(0);
	}
	
	/*
	 * Test para obtener padre
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerPadre() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		Correo adjuntoBuscada = adjunto.obtenerPadre();
		assertTrue(adjuntoBuscada == null);
	}
	
	/*
	 * Test para obtener icono
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerIcono() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		int icono = adjunto.obtenerIcono();
		assertTrue(3 == icono);
	}
	
	/*
	 * Test para comprobar la operación buscar
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testBuscar() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		Adjunto adjuntoBuscada = (Adjunto) adjunto.buscar("texto").toArray()[0];
		assertTrue(adjuntoBuscada == adjunto);
	}
	
	/*
	 * Test para ver que falla explorar
	 * Tipo de prueba: Dinámica de caja negra negativa
	 * Selección de datos: aleatoría
	 */
	@Test(expected = OperacionInvalida.class)
	public void tesExplorar() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		adjunto.explorar();
	}
	
	/*
	 * Test para que añadir falle
	 * Tipo de prueba: Dinámica de caja negra negativa
	 * Selección de datos: aleatoría
	 */
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
	
	/*
	 * Test para ver el numero de leidos después de establecerse los leídos
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testLeidos() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		adjunto.establecerLeido(true);
		assertTrue(adjunto.obtenerNoLeidos() == 0);
	}
	
	/*
	 * Test para ver el tamaño total
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testTamaño() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		assertTrue(adjunto.obtenerTamaño() == 10);
	}
	
	/*
	 * Test para que añadir falle
	 * Tipo de prueba: Dinámica de caja negra negativa
	 * Selección de datos: aleatoría
	 */
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
	
	/*
	 * Test para probar visualización
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerVisualizacion() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		String string = "texto...";
		assertTrue(adjunto.obtenerVisualizacion() == string );
	}
	
	/*
	 * Test para probar previsualización
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerPreVisualizacion() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		assertTrue(adjunto.obtenerPreVisualizacion() == "texto...");
	}
	
	/*
	 * Test para probar obtener ruta
	 * Tipo de prueba: Dinámica de caja negra 
	 * Selección de datos: aleatoría
	 */
	@Test
	public void testObtenerRuta() throws OperacionInvalida {
		Texto texto = new Texto("texto1","texto");
		Mensaje mensaje = new Mensaje(texto);
		Adjunto adjunto = new Adjunto(mensaje, texto);
		assertTrue(adjunto.obtenerRuta() == "texto...");
	}
	
}
