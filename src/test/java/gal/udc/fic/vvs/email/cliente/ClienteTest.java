package gal.udc.fic.vvs.email.cliente;

import static org.junit.Assert.assertTrue;

import java.awt.Dimension;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivador.ArchivadorSimple;
import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Mensaje;

public class ClienteTest {
	
	@Test
	public void testAgregarArchivador() {
		Texto texto = new Texto("texto","texto1"); 
		Mensaje mensaje = new Mensaje(texto);
		ClienteImp cliente = new ClienteImp(mensaje);
		ArchivadorSimple simple = new ArchivadorSimple("archivador", 50);
		cliente.agregarArchivador(simple);
	}
	
	@Test
	public void testPreferredSize() {
		Texto texto = new Texto("texto","texto1"); 
		Mensaje mensaje = new Mensaje(texto);
		ClienteImp cliente = new ClienteImp(mensaje);
		Dimension dimension = new Dimension(800, 500);
		assertTrue(cliente.getPreferredSize().getHeight() == dimension.getHeight());
		assertTrue(cliente.getPreferredSize().getWidth() == dimension.getWidth());
	}
	

}
