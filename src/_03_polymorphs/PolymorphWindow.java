package _03_polymorphs;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PolymorphWindow extends JPanel implements ActionListener, MouseListener, MouseMotionListener {
	public static final int WIDTH = 900;
	public static final int HEIGHT = 600;

	private JFrame window;
	private Timer timer;
ArrayList<Polymorph> poly = new ArrayList<Polymorph>();
	int mouseX = 100;
	int mouseY=100;

	public static void main(String[] args) {
		new PolymorphWindow().buildWindow();
	}

	public void buildWindow() {
		window = new JFrame("IT'S MORPHIN' TIME!");
		window.add(this);
		window.getContentPane().setPreferredSize(new Dimension(500, 500));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
		window.addMouseListener(this);
		window.addMouseMotionListener(this);
poly.add(new BluePolymorph(50, 50, 100, 100));
poly.add(new RedPolymorph(200, 50, 100, 100));
poly.add(new MovingPolymorph(50, 50, 100, 100));
poly.add(new FollowingPolymorph(mouseX, mouseY,100, 100));
poly.add(new ImagePolymorph(250, 250, 100, 100));

		//bluePoly = new BluePolymorph(50, 50, 100, 100);
		//redPoly = ;
		//movingPoly = new MovingPolymorph(50, 50, 100, 100);


		timer = new Timer(1000 / 30, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		// draw background
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, 500, 500);
for (Polymorph p : poly) {
	p.draw(g);
}
		// draw polymorph
//		bluePoly.draw(g);
//		redPoly.draw(g);
//		movingPoly.draw(g);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
		for (Polymorph p : poly) {
			p.update();
		}
//		bluePoly.update();
//		redPoly.update();
//		movingPoly.update();
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		if((e.getX()>=poly.get(0).getX()&& e.getX()<=poly.get(0).getX()+100) && (e.getY()>=poly.get(0).getY() && e.getY()>=poly.get(0).getY()+100)) {
			JOptionPane.showMessageDialog(null, "Hello");
		}
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		 mouseX = e.getX();
		 mouseY = e.getY();
		 poly.get(3).setX(e.getX());
		 poly.get(3).setY(e.getY());
	}
}
