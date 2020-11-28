package gal.udc.fic.vvs.email.cliente;

import java.awt.event.MouseEvent;

import javax.swing.JPopupMenu;

import org.junit.Test;

public class PopupListenerTest {
	
	@Test
	public void testMousePressed(){
		JPopupMenu menu = new JPopupMenu();
		PopupListener listener = new PopupListener(menu);
		MouseEvent event = new MouseEvent(menu,6,6,6,6,6,6,true);
		listener.mousePressed(event);
	}
	
	@Test
	public void testMouseReleased(){
		JPopupMenu menu = new JPopupMenu();
		PopupListener listener = new PopupListener(menu);
		MouseEvent event = new MouseEvent(menu,6,6,6,6,6,6,true);
		listener.mouseReleased(event);
	}

}
