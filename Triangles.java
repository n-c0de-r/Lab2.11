import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.JComponent;

public class Triangles extends Panel {
		
		int width = 500;
		int height = 500;
		int side = (int) ((height/(Math.sqrt(3))) * 2);
		int[] a = { width/2, 0, width }; // Top, Left, Right
		int[] b = { 0, height, height };
		
		public void paint(Graphics g) {	
			draw(g, a, b);
		}
		
		public void draw(Graphics g, int[] x, int[] y) {
			if(x[0] != 1) {
			g.setColor(Color.GRAY);
			g.fillPolygon(x, y, 3);
			int[] xl = {x[0]/2, x[1], x[2]/2};
			drawTriangle(g, a, b);
			}
		}
		
		public void drawTriangle(Graphics g, int[] x, int[] y) {
			
			//Dreieck links 
			
			g.setColor(Color.BLUE);
			int[] xa = {x[0] - x[0]/2, x[1] + x[1], x[2] - x[2]/2};
			int[] ya = {y[0] + y[1]/2, y[1],y[1]};
			
			System.out.println(x[0] + "");
			System.out.println(xa[0] + "");
			
			g.fillPolygon(xa, ya, 3);
			
			//Dreieck rechts
			
			g.setColor(Color.GREEN);
			int[] xb = {x[0] + x[0]/2, x[1] + x[0], x[2]};
			int[] yb = {y[0] + y[1]/2, y[1], y[1]};
			g.fillPolygon(xb, yb, 3);
		
			//Dreieck oben
			
			g.setColor(Color.RED);
			int[] xc = {x[0], x[1] + x[0]/2, x[0] + x[0]/2};
			int[] yc = {y[0], y[1] - y[1]/2, y[2] - y[1]/2};
			g.fillPolygon(xc, yc, 3);
			

			drawTriangle(g, xa, ya);
			drawTriangle(g, xb, yb);
			drawTriangle(g, xc, yc);
		}
		
		public void drawRecursion(Graphics g, int[] x, int[] y) {
			
		}
	}
