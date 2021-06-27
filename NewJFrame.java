import javax.swing.*;
import java.awt.*;

/**
 * This class creates a new window in the size of the current screen
 * 
 * @author sonke-s
 * @author n-c0de-r
 * @version 28.06.2021
 */
public class NewJFrame {

	private int screenHeight;
	private int screenWidth;

	static JFrame jf = new JFrame();

	public static void main(String[] args) {

		NewJFrame j = new NewJFrame();
		j.setup();
		j.triangles();
	}

	/**
	 * This method creates the Window
	 */
	public void setup() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		screenHeight = screenSize.height;
		screenWidth = screenSize.width;

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(screenWidth, screenHeight);
	}

	/**
	 * This method prints Sierpinski Triangles recursively
	 */
	public void triangles() {
		jf.add(new Triangles());
		jf.setVisible(true);
	}
}
