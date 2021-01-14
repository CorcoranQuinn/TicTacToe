import java.awt.*;
public class box
{
	int gx;
	int gy;
	int gw;
	int gl;
	Image X;
	Image O;
	int state;
	int x;
	int y;

	public box(int x1,int y1,int w, int l, Image x, Image o)
	{
		gx = x1;
		gy = y1;
		gw = w;
		gl = l;
		X = x;
		O = o;
		state = 0;
	}

	boolean collision(int moux,int mouy)
	{

		x = moux;
		y = mouy;
		if (moux >= gx && moux <= (gx + gw) && mouy >= gy && mouy <= (gy + gl))
						{
System.out.println(moux + " " + mouy + " " + gx + " " + gy);
							return true;
						}
						else
						{
							return false;
						}

	}
	public void setX()
	{
		state = 1;
	}
	public void setO()
	{
		state = 2;
	}
	public int boxState()
	{
		return state;
	}

	public void draw(Graphics g)
	{
		g.setColor(Color.RED);
		g.drawRect(gx,gy,gw,gl);
		if(state == 1)
		{
			g.drawImage(X,gx+100,gy+100,null);
			g.drawOval(x,y,2,2);
		}
		if(state == 2)
		{
			g.drawImage(O,gx-100,gy,null);
		}
	}
}