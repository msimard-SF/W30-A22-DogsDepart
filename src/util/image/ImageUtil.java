package util.image;

import javax.swing.ImageIcon;

public abstract class ImageUtil {

	public static ImageIcon getImageIcon(Object o, String pathImage) {
		return new ImageIcon(o.getClass().getResource(pathImage));
	}

	public static ImageIcon getImageIcon(Class c, String pathImage) {
		return new ImageIcon(c.getResource(pathImage));
	}
}