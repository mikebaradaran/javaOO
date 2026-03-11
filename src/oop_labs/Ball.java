package oop_labs;

public class Ball {
	int x, y, w, h, dirX, dirY;
	static int wx, wy, ww, wh;
	
	ShapeType shapeType;

	public Ball(int x, int y, int w, int h, int dirX, int dirY, ShapeType t) {
		this.shapeType = t;
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.dirX = dirX;
		this.dirY = dirY;
		wx = 20;
		wy = 10;
		ww = 600;
		wh = 400;
	}
	
	public Ball(int x, int y, int w, int h, int dirX, int dirY) {
		this(x,y,w,h,dirX, dirY, ShapeType.Oval);
	}
	
	public int right() {
		return x+w;
	}
	public int bottom() {
		return y+h;
	}
	public int rightW() {
		return wx+ww;
	}
	public int bottomW() {
		return wy+wh;
	}

	public void move() {
		this.x += dirX;
		this.y += dirY;

		if (right() > rightW()) {
			x = rightW()-w;
			dirX = -dirX;
		}
		if (bottom() > bottomW()) {
			y = bottomW()-h;
			dirY = -dirY;
		}

		if (x < Ball.wx) {
			x = Ball.wx;
			dirX = -dirX;
		}
		if (y < Ball.wy) {
			y = Ball.wy;
			dirY = -dirY;
		}
	}
}
