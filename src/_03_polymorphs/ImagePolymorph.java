package _03_polymorphs;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class ImagePolymorph extends Polymorph{
	public static BufferedImage image;
	public static boolean needImage = true;
	public static boolean gotImage = false;

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

	ImagePolymorph(int x, int y, int width, int height) {
		super(x, y);
		this.height = height;
		this.width = width;
		if (needImage) {
			loadImage("rocket.png");
		}
	}

	@Override
	public void update() {
		
	}

	@Override
	public void draw(Graphics g) {
		if (gotImage) {
			g.drawImage(image, getX(), getY(), width, height, null);
		} else {
			g.setColor(Color.black);
			g.fillRect(getX(), getY(), width, height);
		}
	
	}	void loadImage(String imageFile) {
		if (needImage) {
			try {
				image = ImageIO.read(this.getClass().getResourceAsStream(imageFile));
				gotImage = true;
			} catch (Exception e) {

			}
			needImage = false;
		}
	}
}
