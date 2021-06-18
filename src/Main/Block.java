package Main;

import java.awt.Color;

public class Block {
	public int value;
	public Color color = new Color(0);

	public Block(int num) {
		value = num;
		color = new Color(255 - num / 2, 255, num / 2);

	}
}
