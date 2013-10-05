/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

/**
 *
 * @author Allan
 */
public class ClasseImagem extends JDesktopPane {

    private ImageIcon iiImagem;

    public ClasseImagem(String imagem) {
        iiImagem = new ImageIcon(getClass().getResource(imagem));
    }

        public void paintComponent(Graphics g) {
        super.paintComponent(g);
        iiImagem.paintIcon(this, g, 0, 0);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(iiImagem.getIconWidth(),
                iiImagem.getIconHeight());
    }
}