import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Tic_Tac_Toe_Driver extends JApplet implements MouseListener
{
	int turn = 0;
	int moux;
	int mouy;
	Image X;
	Image O;
	box b1;
	box b2;
	box b3;
	box b4;
	box b5;
	box b6;
	box b7;
	box b8;
	box b9;
	Random r;

	public void init()
	{
		setContentPane(new drawing_Panel());
		addMouseListener(this);
		X = getImage(getDocumentBase(), "X.png");
		O = getImage(getDocumentBase(), "Circle.png");
		//top left box
		b1 = new box(100,0,300,300,X,O);
		//middle left box
		b2 = new box(100,300,300,300,X,O);
		//middle top box
		b3 = new box(400,0,300,300,X,O);
		//right top box
		b4 = new box(700,0,300,300,X,O);
		//left bottom box
		b5 = new box(100,600,300,300,X,O);
		//middle middle box
		b6 = new box(400,300,300,300,X,O);
		//middle bottom box
		b7 = new box(400,600,300,300,X,O);
		//right middle box
		b8 = new box(700,300,300,300,X,O);
		//right bottom box
		b9 = new box(700,600,300,300,X,O);
		r = new Random();

	}
	void ai()
	{
		int block = r.nextInt(100)+1;
		int win = r.nextInt(100)+1;
		//left column top and middle
		if(block<= 73 && b1.boxState() == 1 && b2.boxState() == 1)
		{
			b5.setO();

		}
		//top row left and middle
		else if(block<= 73 && b1.boxState() == 1 && b3.boxState() == 1)
		{
			b4.setO();

		}
		//diagnal from top left
		else if(block<= 73 && b1.boxState() == 1 && b6.boxState() == 1)
		{
			b9.setO();

		}
		//left column middle and bottom
		else if(block<= 73 && b2.boxState() == 1 && b5.boxState() == 1)
		{
			b1.setO();

		}
		//middle row left and middle
		else if(block<= 73 && b2.boxState() == 1 && b6.boxState() == 1)
		{
			b8.setO();

		}
		//top row middle and right
		else if(block<= 73 && b3.boxState() == 1 && b4.boxState() == 1)
		{
			b1.setO();

		}
		//middle column top and middle
		else if(block<= 73 && b3.boxState() == 1 && b6.boxState() == 1)
		{
			b7.setO();

		}
		//right column top and middle
		else if(block<= 73 && b4.boxState() == 1 && b8.boxState() == 1)
		{
			b9.setO();

		}
		//diagnal from top right
		else if(block<= 73 && b4.boxState() == 1 && b6.boxState() == 1)
		{
			b5.setO();

		}
		//bottom row left and middle
		else if(block<= 73 && b5.boxState() == 1 && b7.boxState() == 1)
		{
			b9.setO();

		}
		//diagnal from bottom left
		else if(block<= 73 && b5.boxState() == 1 && b6.boxState() == 1)
		{
			b4.setO();

		}
		//middle column bottom and middle
		else if(block<= 73 && b7.boxState() == 1 && b6.boxState() == 1)
		{
			b3.setO();

		}
		//middle row right and middle
		else if(block<= 73 && b8.boxState() == 1 && b6.boxState() == 1)
		{
			b2.setO();

		}
		//right column middle and bottom
		else if(block<= 73 && b8.boxState() == 1 && b9.boxState() == 1)
		{
			b4.setO();
		}
		//top row left and right
		else if(block<= 73 && b1.boxState() == 1 && b4.boxState() == 1)
		{
			b3.setO();
		}
		//middle row left and right
		else if(block<= 73 && b2.boxState() == 1 && b8.boxState() == 1)
		{
			b6.setO();
		}
		//bottom row left and right
		else if(block<= 73 && b5.boxState() == 1 && b9.boxState() == 1)
		{
			b7.setO();
		}
		//left column top and bottom
		else if(block<= 73 && b1.boxState() == 1 && b5.boxState() == 1)
		{
			b2.setO();
		}
		//middle column top and bottom
		else if(block<= 73 && b3.boxState() == 1 && b7.boxState() == 1)
		{
			b6.setO();
		}
		//right column top and bottom
		else if(block<= 73 && b4.boxState() == 1 && b9.boxState() == 1)
		{
			b8.setO();
		}
		else
		{
			int boxN = r.nextInt(9)+1;

				if(boxN == 1)
				{
					b1.setO();
				}
				if(boxN == 2)
				{
					b2.setO();
				}
				if(boxN == 3)
				{
					b3.setO();
				}
				if(boxN == 4)
				{
					b4.setO();
				}
				if(boxN == 5)
				{
					b5.setO();
				}
				if(boxN == 6)
				{
					b6.setO();
				}
				if(boxN == 7)
				{
					b7.setO();
				}
				if(boxN == 8)
				{
					b8.setO();
				}
				if(boxN == 9)
				{
					b9.setO();
				}

		}
			//top row left and middle
			if(win<=84 && b1.boxState() == 2 && b3.boxState == 2)
			{
				b4.setO();
			}
			//left column top and middle
			if(win<=84 && b1.boxState() == 2 && b2.state == 2)
			{
				b5.setO();
			}
			//diagnal from top left
			if(win<=84 && b1.state() == 2 && b6.state == 2)
			{
				b9.setO();
			}
			//top row left and right
			if(win<=84 && b1.state() == 2 && b4.state == 2)
			{
				b3.setO();
			}
			//left column top and bottom
			if(win<=84 && b1.state() == 2 && b5.state == 2)
			{
				b2.setO();
			}
			//left column bottom and middle
			if(win<=84 && b2.state() == 2 && b5.state == 2)
			{
				b1.setO();
			}
			//middle row left and middle
			if(win<=84 && b2.state() == 2 && b6.state == 2)
			{
				b8.setO();
			}
			//middle column top and middle
			if(win<=84 && b3.state() == 2 && b6.state == 2)
			{
				b7.setO();
			}
			//top row middle and right
			if(win<=84 && b3.state() == 2 && b4.state == 2)
			{
				b1.setO();
			}
			//right column top and middle
			if(win<=84 && b4.state() == 2 && b8.state == 2)
			{
				b9.setO();
			}
			//diagnal from top right
			if(win<=84 && b4.state() == 2 && b6.state == 2)
			{
				b5.setO();
			}
			//bottom row left and middle
			if(win<=84 && b5.state() == 2 && b7.state == 2)
			{
				b9.setO();
			}
			//diagnal from bottom left
			if(win<=84 && b5.state() == 2 && b6.state == 2)
			{
				b4.setO();
			}
			//bottom row middle and right
			if(win<=84 && b7.state() == 2 && b9.state == 2)
			{
				b5.setO();
			}
			//middle column bottom and middle
			if(win<=84 && b7.state() == 2 && b6.state == 2)
			{
				b3.setO();
			}
			/*
			if(win<=84 && b.state() == 2 && b.state == 2)
			{
				b.setO();
			}
			//
			if(win<=84 && b.state() == 2 && b.state == 2)
			{
				b.setO();
			}
			//
			if(win<=84 && b.state() == 2 && b.state == 2)
			{
				b.setO();
			}
			//
			if(win<=84 && b.state() == 2 && b.state == 2)
			{
				b.setO();
			}
			//
			if(win<=84 && b.state() == 2 && b.state == 2)
			{
				b.setO();
			}*/
	}
	public class drawing_Panel extends JPanel
	{
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);

			if(b1.boxState() == 1)
			{
				b1.draw(g);
			}
			if(b2.boxState() == 1)
			{
				b2.draw(g);
			}
			if(b3.boxState() == 1)
			{
				b3.draw(g);
			}
			if(b4.boxState() == 1)
			{
				b4.draw(g);
			}
			if(b5.boxState() == 1)
			{
				b5.draw(g);
			}
			if(b6.boxState() == 1)
			{
				b6.draw(g);
			}
			if(b7.boxState() == 1)
			{
				b7.draw(g);
			}
			if(b8.boxState() == 1)
			{
				b8.draw(g);
			}
			if(b9.boxState() == 1)
			{
				b9.draw(g);
			}
			if(b1.boxState() == 2)
			{
				b1.draw(g);
			}
			if(b2.boxState() == 2)
			{
				b2.draw(g);
			}
			if(b3.boxState() == 2)
			{
				b3.draw(g);
			}
			if(b4.boxState() == 2)
			{
				b4.draw(g);
			}
			if(b5.boxState() == 2)
			{
				b5.draw(g);
			}
			if(b6.boxState() == 2)
			{
				b6.draw(g);
			}
			if(b7.boxState() == 2)
			{
				b7.draw(g);
			}
			if(b8.boxState() == 2)
			{
				b8.draw(g);
			}
			if(b9.boxState() == 2)
			{
				b9.draw(g);
			}
			g.setColor(Color.BLACK);
			g.drawLine(400,20,400,900);
			g.drawLine(700,20,700,900);
			g.drawLine(100,300,1000,300);
			g.drawLine(100,600,1000,600);
		}
	}
	public  void mousePressed(MouseEvent e)
	{
	}
	public  void mouseReleased(MouseEvent e)
	{
	}
	public  void mouseEntered(MouseEvent e)
	{
	}
	public  void mouseExited(MouseEvent e)
	{
	}
	public  void mouseMoved(MouseEvent e)
	{
	}
	public  void mouseDragged(MouseEvent e)
	{
	}
	public  void mouseClicked(MouseEvent e)
	{

		moux = e.getX();
		mouy = e.getY();
					if(b1.collision(moux,mouy) == true && b1.boxState() == 0)
								{
									b1.setX();
									System.out.println("box is now an x");
								}
					if(b2.collision(moux,mouy) == true && b2.boxState() == 0)
								{
									b2.setX();
									System.out.println("box is now an x");

								}
					if(b3.collision(moux,mouy) == true && b3.boxState() == 0)
								{
									b3.setX();
									System.out.println("box is now an x");
								}
					if(b4.collision(moux,mouy) == true && b4.boxState() == 0)
								{
									b4.setX();
									System.out.println("box is now an x");
								}
					if(b5.collision(moux,mouy) == true && b5.boxState() == 0)
								{
									b5.setX();
									System.out.println("box is now an x");
								}
					if(b6.collision(moux,mouy) == true && b6.boxState() == 0)
								{
									b6.setX();
									System.out.println("box is now an x");
								}
					if(b7.collision(moux,mouy) == true && b7.boxState() == 0)
								{
									b7.setX();
									System.out.println("box is now an x");
								}
					if(b8.collision(moux,mouy) == true && b8.boxState() == 0)
								{
									b8.setX();
									System.out.println("box is now an x");
								}
					if(b9.collision(moux,mouy) == true && b9.boxState() == 0)
								{
									b9.setX();
									System.out.println("box is now an x");
								}
						ai();
		repaint();
	}
}