package gal.udc.fic.vvs.email.archivador;
import org.junit.Assert;
import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class DelegadoPBTTest {
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad  espacio disponible es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoTamanoTotalDelegado(String name, @InRange(min = "1") int randomSize) {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", randomSize);
		Delegado delegado = new Delegado(archivador);
		Assert.assertEquals(randomSize, delegado.obtenerEspacioTotal());
	}
	
	/*
	 * Test de unidad
	 * Test para ver si la propiedad  espacio disponible es siempre la misma
	 * Tipo de prueba: Dinámica de caja negra
	 * Selección de datos: aleatoría
	 */
	@Property
	public void mismoTamanoDisponibleDelegado(String name, @InRange(min = "1") int randomSize) {
		ArchivadorSimple archivador = new ArchivadorSimple("Archivador", randomSize);
		Delegado delegado = new Delegado(archivador);
		Assert.assertEquals(randomSize, delegado.obtenerEspacioDisponible());
	}

}
