import java.awt.Color;
import java.awt.Graphics;
import java.awt.Panel;
import java.util.Random;

public class Triangles extends Panel {
	
		private int width;
		private int height;
		
		private Color[] colors = {Color.BLUE, Color.CYAN, Color.YELLOW, Color.MAGENTA, Color.GREEN, Color.RED, Color.PINK, Color.ORANGE};
		
		private int[] a = {0,0,0}; // Top, Left, Right
		private int[] b = {0,0,0};
		
		public Triangles(int h, Graphics g) {
			
			width = h;
			height = h;
			
			a[0] = width/2;
			a[1] = 0;
			a[2] = width;
			
			b[0] = 0;
			b[1] = height;
			b[2] = height;
			
			this.paint(g);
		}
		
		public void paint(Graphics g) {
			//System.out.println(width);
			drawTriangles(g, a, b, 6);
		}
		
		/**
		 * Draws additional triangles recursively.
		 * 
		 * @param gr Graphics object.
		 * @param x Array of points x coordinates.
		 * @param y Array of points y coordinates.
		 * @param level	current level of recursion
		 */
		public void drawTriangles(Graphics gr, int[] x, int[] y, int level) {

			gr.setColor(colors[level]);
			System.out.print(level);
			//Triangle big
			//Points Top, Left, Right
			int[] xd = {x[0], x[1], x[2]};
			int[] yd = {y[0], y[1], y[2]};
			gr.fillPolygon(xd, yd, 3);
			
			//Math derived from here https://courses.cs.duke.edu//fall01/cps001/labs/lab7.html
			
			//Triangle top
			//Points Top, Left, Right
			int[] xc = {x[0], (x[0] + x[1]) / 2, (x[0] + x[2]) / 2};
			int[] yc = {y[0], (y[0] + y[1]) / 2, (y[0] + y[2]) / 2};
			gr.fillPolygon(xc, yc, 3);
			
			//Triangle left
			//Points Top, Left, Right
			int[] xa = {(x[0] + x[1]) / 2, x[1], (x[1] + x[2]) / 2};
			int[] ya = {(y[0] + y[1]) / 2, y[1], (y[1] + y[2]) / 2};
			gr.fillPolygon(xa, ya, 3);
			
			//Triangle right
			//Points Top, Left, Right
			int[] xb = {(x[0] + x[2]) / 2, (x[1] + x[2]) / 2, x[2]};
			int[] yb = {(y[0] + y[2]) / 2, (y[1] + y[2]) / 2, y[2]};
			gr.fillPolygon(xb, yb, 3);
			
			//Only draw until the last level is reached
			if (level > 0) {
			drawTriangles(gr, xa, ya, level-1);
			drawTriangles(gr, xb, yb, level-1);
			drawTriangles(gr, xc, yc, level-1);
			}
		}
	}
