
package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;

public class MovingPolymorph extends Polymorph {
	private int width;
	private int height;
	int circlePos = 0;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	MovingPolymorph(int x, int y, int width, int height) {
		super(x, y);
		this.height = height;
		this.width = width;

	}

	@Override
	public void update() {
		
setX( (int) (getX()+Math.cos(circlePos)*100.0));

setY( (int) (getY()+Math.sin(circlePos)*100.0));
	circlePos++;
	}

	@Override
	public void draw(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(getX(), getY(), width, height);
	}

}
