/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JDesktopPane;

/**
 *
 * @author Allan
 */
public class ClasseImagem  extends JDesktopPane {
    Image iiImagem;
    public ClasseImagem(String imagem) {
    try {
              iiImagem = javax.imageio.ImageIO.read(getClass().getResource("/br/com/allan/siszorzo/imagens/Brazil_Flag.jpg"));
        } catch (Exception ex) {
        }
    }

    @Override
    public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(iiImagem, 0,0,this.getWidth(),this.getHeight(),this);
  }
}