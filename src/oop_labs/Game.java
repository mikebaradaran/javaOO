package oop_labs;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

public class Game extends Canvas {

	public static void main(String[] args) {
		new Game();
	}

	Ball[] balls = new Ball[4];

	Game() {

		balls[0] = new Ball(100, 50, 40, 30, 1, 2, ShapeType.Oval);
		balls[1] = new Ball(50, 50, 30, 30, 2, 3, ShapeType.Rectangle);
		balls[2] = new Ball(150, 70, 150, 90, 3, 2, ShapeType.Arc);
		balls[3] = new Ball(100, 40, 30, 20, 3, 2);

		JFrame frame = new JFrame();
		this.setSize(Ball.ww + Ball.wx * 2, Ball.wh + Ball.wy *2);
		frame.add(this);
		frame.pack();
		frame.setVisible(true);

		Timer t = new Timer();
		TimerTask tt = new TimerTask() {
			@Override
			public void run() {
				draw();
			}
		};

		t.schedule(tt, 0, 50);

		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				t.cancel();
				tt.cancel();
			}
		});
	}

	public void draw() {
		this.repaint();
	}

	public void paint(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(Ball.wx, Ball.wy, Ball.ww, Ball.wh);
		g.setColor(Color.blue);

		for (Ball b : balls) {
			if (b.shapeType == ShapeType.Oval) {
				g.fillOval(b.x, b.y, b.w, b.h);
			}
			else if (b.shapeType == ShapeType.Rectangle) {
				g.fillRect(b.x, b.y, b.w, b.h);
			}
			else if (b.shapeType == ShapeType.Arc) {
				g.fillArc(b.x, b.y, b.w, b.h, 0, 100);
			}
			
		}

		for (Ball b : balls) {
			b.move();
		}
//		Ball.wx++;
//		Ball.wh--;
//		Ball.ww--;
	}
}
