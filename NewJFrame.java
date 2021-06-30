import javax.swing.*;
import java.awt.*;

/**
 * This class creates a new window in the size of the current screen
 * 
 * @author sonke-s
 * @author n-c0de-r
 * @version 28.06.2021
 */
public class NewJFrame extends JFrame {

	private static JFrame jf;
	
	public static void main(String[] args) {

		NewJFrame j = new NewJFrame();
		j.setup();
	}

	/**
	 * This method creates the Window
	 */
	private void setup() {
		jf = new JFrame("Sierpinski's Recursive Triangles by S�nke & Nermin");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(screenSize.width, screenSize.height);
		jf.add(new Triangles());
		jf.setVisible(true);
	}
	
	/**
	 * getter method to return the current content pane,
	 * as the Frame itself is private and can't be accessed.
	 * 
	 * @return Container within the Frame.
	 */
	public static Container getPane() {
		return jf.getContentPane();
	}
}
