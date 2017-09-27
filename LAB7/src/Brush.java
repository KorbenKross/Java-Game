import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Brush extends JPanel {
	@Override
	public void paint(Graphics g) {
		MassivLevel.exitkeyprove = 0;
		BufferedImage box = null;
		BufferedImage player = null;
		BufferedImage wall = null;
		BufferedImage floor = null;
		BufferedImage boxcheck = null;
		BufferedImage boxcpick = null;
		BufferedImage boxcp = null;
		try {
			box = ImageIO.read(new File(
					"D://Werk//workspace//LAB7//art//boxAlt.png"));
			player = ImageIO.read(new File(
					"D://Werk//workspace//LAB7//art//hud_p1.png"));
			wall = ImageIO.read(new File(
					"D://Werk//workspace//LAB7//art//castleMid.png"));
			floor = ImageIO.read(new File(
					"D://Werk//workspace//LAB7//art//castleCenter.png"));
			boxcheck = ImageIO.read(new File(
					"D://Werk//workspace//LAB7//art//boxitemAlt.png"));
			boxcpick = ImageIO.read(new File(
					"D://Werk//workspace//LAB7//art//metal.png"));
			boxcp = ImageIO.read(new File(
					"D://Werk//workspace//LAB7//art//hud_p1Alt.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < MassivLevel.sizex; i++) {
			for (int j = 0; j < MassivLevel.sizey; j++) {
				g.drawImage(floor, 50 * j, 50 * i, 50, 50, null);
				
			}
		}
		for (int i = 0; i < MassivLevel.sizex; i++) {
			for (int j = 0; j < MassivLevel.sizey; j++) {
				switch (MassivLevel.a[i][j]) {
				case 1:
					g.drawImage(player, 50 * j, 50 * i, 50, 50, null);
					break;
				case 2:
					g.drawImage(wall, 50 * j, 50 * i, 50, 50, null);
					break;
				case 3:
					g.drawImage(box, 50 * j, 50 * i, 50, 50, null);
					break;

				}
			}
		}
		for (int i = 0; i <  MassivLevel.sizex; i++) {
			for (int j = 0; j <  MassivLevel.sizey; j++) {
				if (MassivLevel.b[i][j] == 4) {
					g.drawImage(boxcpick, 50 * j, 50 * i, 50, 50, null);
				}
				if (MassivLevel.b[i][j] == 4 && MassivLevel.a[i][j] == 3) {
					MassivLevel.exitkeyprove++;
					g.drawImage(boxcheck, 50 * j, 50 * i, 50, 50, null);
				}
				if (MassivLevel.b[i][j] == 4 && MassivLevel.a[i][j] == 1) {
					g.drawImage(boxcp, 50 * j, 50 * i, 50, 50, null);
				}
			}
		}

	}

}
