package oop_better;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;

import oop_labs.Ball;

public class Game extends Canvas {

	public static void main(String[] args) {
		new Game();
	}

	Manager manager = new Manager();

	Game() {
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
		manager.move(g);
	}
}
