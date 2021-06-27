import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Random;

public class Triangles extends Panel {
		
		int width = 500;
		int height = 500;
		int[] a = { width/2, 0, width }; // Top, Left, Right
		int[] b = { 0, height, height };
		
		public void paint(Graphics g) {	
			draw(g, a, b);
		}
		
		public void draw(Graphics g, int[] x, int[] y) {
			if(x[0] != 1) {
			g.setColor(Color.GRAY);
			g.fillPolygon(x, y, 3);
			drawTriangle(g, a, b, 5);
			}
		}
		
		public void drawTriangle(Graphics gr, int[] x, int[] y, int level) {
			int r = new Random().nextInt(250);
			int g = new Random().nextInt(250);
			int b = new Random().nextInt(250);
			
			//Triangle top
			gr.setColor(new Color(r,g,b));//Points Top, Left, Right
			int[] xc = {x[0], (x[0] + x[1]) / 2, (x[0] + x[2]) / 2};
			int[] yc = {y[0], (y[0] + y[1]) / 2, (y[0] + y[2]) / 2};
			gr.fillPolygon(xc, yc, 3);
			
			//Triangle left
			gr.setColor(new Color(r,g,b));//Points Top, Left, Right
			int[] xa = {(x[0] + x[1]) / 2, x[1], (x[1] + x[2]) / 2};
			int[] ya = {(y[0] + y[1]) / 2, y[1], (y[1] + y[2]) / 2};
			gr.fillPolygon(xa, ya, 3);
			
			//Triangle right
			gr.setColor(new Color(r,g,b));//Points Top, Left, Right
			int[] xb = {(x[0] + x[2]) / 2, (x[1] + x[2]) / 2, x[2]};
			int[] yb = {(y[0] + y[2]) / 2, (y[1] + y[2]) / 2, y[2]};
			gr.fillPolygon(xb, yb, 3);
			
			if (level > 0) {
			drawTriangle(gr, xa, ya, level-1);
			drawTriangle(gr, xb, yb, level-1);
			drawTriangle(gr, xc, yc, level-1);
			}
		}
	}
