import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

/**
 * This class creates a new window in the size of the current screen
 * 
 * @author sonke-s
 * @author n-c0de-r
 * @version 28.06.2021
 */
public class NewJFrame extends JFrame implements ComponentListener{

	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();	
	
	private int height;
	private int width;

	private JFrame jf = new JFrame();
	
	private Graphics g;
	
	public static void main(String[] args) {

		NewJFrame j = new NewJFrame();
		j.setup();
	}

	/**
	 * This method creates the Window
	 */
	private void setup() {
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.addComponentListener(this);
		jf.setSize(screenSize.width, screenSize.height);
		jf.setVisible(true);
		g = jf.getGraphics();
	}

	@Override
	public void componentResized(ComponentEvent e) {
		// TODO Auto-generated method stub
		Dimension newSize = jf.getSize();
		width = newSize.width;
		height = newSize.height;
		jf.add(new Triangles(height, g));
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}
}
