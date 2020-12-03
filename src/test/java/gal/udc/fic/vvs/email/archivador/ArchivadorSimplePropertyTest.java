package gal.udc.fic.vvs.email.archivador;
import org.junit.Assert;
import org.junit.runner.RunWith;

import com.pholser.junit.quickcheck.Property;
import com.pholser.junit.quickcheck.generator.InRange;
import com.pholser.junit.quickcheck.runner.JUnitQuickcheck;

@RunWith(JUnitQuickcheck.class)
public class ArchivadorSimplePropertyTest {
	
	@Property
	public void sameSize(String name, @InRange(min = "1") int randomSize) {
		Archivador archivador = new ArchivadorSimple(name, randomSize);
		Assert.assertEquals(name, archivador.obtenerNombre());
	}

}
