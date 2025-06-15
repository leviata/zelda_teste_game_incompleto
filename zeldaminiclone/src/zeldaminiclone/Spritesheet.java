package zeldaminiclone;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spritesheet {
	
	public static BufferedImage spritesheet;
	public static BufferedImage [] player_front;
	public static BufferedImage TitlleWall;
	public static BufferedImage gun;
	public static BufferedImage [] inimigo_front;
	
	
	public Spritesheet() {
		try {
			spritesheet = ImageIO.read(getClass().getResource("/spritesheet.png"));
		} catch (IOException e) {
			e.printStackTrace();
			
		} player_front =  new BufferedImage[2];
		inimigo_front =  new BufferedImage[2];
		
		inimigo_front[0] = Spritesheet.getSprite(179,15,16,16);
		inimigo_front[1] = Spritesheet.getSprite(197,15,16,16);
		
		
		player_front[0] = Spritesheet.getSprite(18,14,16,16);
		player_front[1] = Spritesheet.getSprite(36,14,16,16);
		TitlleWall =  Spritesheet.getSprite(276, 244, 16, 16);
		gun = Spritesheet.getSprite(290, 158, 12, 12);
	}

	public static BufferedImage getSprite(int x, int y, int width, int height) {
		return spritesheet.getSubimage(x, y, width, height);
	}
	
}
