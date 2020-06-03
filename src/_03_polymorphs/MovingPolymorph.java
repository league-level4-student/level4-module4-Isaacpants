
	package _03_polymorphs;

	import java.awt.Color;
	import java.awt.Graphics;

	public class MovingPolymorph extends Polymorph{
	private int width;
	private int height;

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

		}@Override
		public void update() {
			int newX = getX()+10;
			setX(newX);
		
		}

		@Override
		public void draw(Graphics g) {
			g.setColor(Color.black);
			g.fillRect(getX(), getY(), width, height);
		}
		
	}


