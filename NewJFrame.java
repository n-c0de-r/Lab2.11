import javax.swing.*;
import java.awt.*;

public class NewJFrame {
	
	static JFrame jf = new JFrame();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setup();
		triangles();
	}
	
	public static void setup() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(screenWidth, screenHeight);
//		int width = jf.getWidth();
//		int height = jf.getHeight();
	}
	
	public static void triangles() {
		jf.add(new Triangles());
		jf.setVisible(true);
	}
}
