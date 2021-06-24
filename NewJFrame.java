import javax.swing.*;
import java.awt.*;

public class NewJFrame {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int screenHeight = screenSize.height;
		int screenWidth = screenSize.width;

		JFrame jf = new JFrame();
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(screenWidth, screenHeight);
		int width = jf.getWidth();
		int height = jf.getHeight();
		System.out.print(height);
		System.out.print(width);
		jf.add(new Triangles(width, height));
		jf.setVisible(true);
	}
}





class Triangles extends JComponent {
	
	Graphics2D graphic;
	String triangle = "Triangle";
	
	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	int screenHeight = screenSize.height;
	int screenWidth = screenSize.width;
	
	int width;
	int height;
	
	public Triangles(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public void paint(Graphics g, int[] a, int[] b) {	
		g.setColor(Color.GRAY);
		int[] x = { (getSideLength() / 2), 0, getSideLength() }; // Top, Left, Right
		int[] y = { 0, height, height };
		g.fillPolygon(x, y, 3);
		g.setColor(Color.WHITE);
		int[] x2 = { x[0], x[2] / 4, (int) (x[2] * (3.0 / 4.0)) };
		int[] y2 = { y[1], y[1] / 2, y[1] / 2 };
		//	int[] x2 = {getSideLength()/2,getSideLength()/4, (int) (getSideLength()*(3.0/4.0))};
		//	int[] y2 = {height, height/2, height/2};
		g.fillPolygon(x2, y2, 3);
	}
	
	public int getSideLength() {
		int a = (int) ((height/(Math.sqrt(3))) * 2);
		return a;
	}
}
