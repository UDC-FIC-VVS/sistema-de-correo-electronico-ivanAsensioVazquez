package gal.udc.fic.vvs.email.archivador;
import org.junit.Assert;
import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class ArchivadorSimplePBTTest {
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad  espacio total es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoTamanoTotalArchivador(String name, @InRange(min = "1") int randomSize) {
		Archivador archivador = new ArchivadorSimple(name, randomSize);
		Assert.assertEquals(randomSize, archivador.obtenerEspacioTotal());
	}
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad  espacio disponible es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoTamanoDisponibleArchivador(String name, @InRange(min = "1") int randomSize) {
		Archivador archivador = new ArchivadorSimple(name, randomSize);
		Assert.assertEquals(randomSize, archivador.obtenerEspacioDisponible());
	}

}
