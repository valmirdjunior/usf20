
package Joption;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author Valmir Junior
 */
public class Joptionx implements Icon{

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
  Image image = new ImageIcon(getClass().getResource("x.png")).getImage();
        g.drawImage(image, x, y, c);
    
    }

    @Override
    public int getIconWidth() {
        return 60;
   }

    @Override
    public int getIconHeight() {
   return 65;
    }
    
}
