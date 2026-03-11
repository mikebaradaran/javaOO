package oop_better;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import oop_labs.Ball;
import oop_labs.ShapeType;

public class Manager {
	List<Ball> balls = new ArrayList<>();

	Manager() {
		balls.add(new Ball(100, 50, 40, 30, 1, 2, ShapeType.Oval));
		balls.add(new Ball(50, 50, 30, 30, 2, 3, ShapeType.Rectangle));
		balls.add(new Ball(150, 70, 150, 90, 3, 2, ShapeType.Arc));
		balls.add(new Ball(100, 40, 30, 20, 3, 2));
	}

	void move(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(Ball.wx, Ball.wy, Ball.ww, Ball.wh);
		g.setColor(Color.blue);

		for (Ball b : balls) {
			if (b.shapeType == ShapeType.Oval) {
				g.fillOval(b.x, b.y, b.w, b.h);
			} else if (b.shapeType == ShapeType.Rectangle) {
				g.fillRect(b.x, b.y, b.w, b.h);
			} else if (b.shapeType == ShapeType.Arc) {
				g.fillArc(b.x, b.y, b.w, b.h, 0, 100);
			}

		}

		for (Ball b : balls) {
			b.move();
		}

	}
}
