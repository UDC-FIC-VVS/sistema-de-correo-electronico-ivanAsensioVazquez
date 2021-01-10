package gal.udc.fic.vvs.email.archivador;
import org.junit.Assert;
import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class LogPBTTest {
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad  espacio disponible es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoTamanoTotalLog(String name, @InRange(min = "1") int randomSize) {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", randomSize);
		Log log = new Log(archivador);
		Assert.assertEquals(randomSize, log.obtenerEspacioTotal());
	}
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad  espacio disponible es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoTamanoDisponibleLog(String name, @InRange(min = "1") int randomSize) {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", randomSize);
		Log log = new Log(archivador);
		Assert.assertEquals(randomSize, log.obtenerEspacioDisponible());
	}

}
