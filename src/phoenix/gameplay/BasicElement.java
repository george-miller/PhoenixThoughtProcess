package phoenix.gameplay;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public abstract class BasicElement{
	public Position position;
	public int damage;
	public BufferedImage image;

	abstract public void draw(Graphics g);
}