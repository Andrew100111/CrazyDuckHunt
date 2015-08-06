package Nuevo;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.LineBorder;

class ImageViewPanel extends JPanel {

    //variables
    JLabel NO_IMAGES = new JLabel("No Images");
    ArrayList<BufferedImage> images;
    ArrayList<MyLabel> imageLabels;
    private MyLabel focusedLabel;
    
    //constructor 1
    public ImageViewPanel(ArrayList<BufferedImage> images) {
        
        //declaracion
        this.images = images;
        imageLabels = new ArrayList<>();
        
        //bandera 2
        System.out.println(imageLabels);
        

        for (BufferedImage x : images) {
            imageLabels.add(new MyLabel(new ImageIcon(x), this));
        }
        layoutLabels();
        
        //bandera 3
        System.out.println(imageLabels);
        
        //metodo para borrar la imagen 
        getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0, true), "Delete pressed");
        getActionMap().put("Delete pressed", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                removeFocusedImageLabel();
            }
        });
    }
    
    //metoddo LayOut
    private void layoutLabels() {
        if (imageLabels.isEmpty()) {
            add(NO_IMAGES);
        } else {
            remove(NO_IMAGES);
            for (JLabel il : imageLabels) {
                add(il);
            }
        }
        revalidate();
        repaint();
    }

    //metodo quitar enmarcado de la imagen
    void removeFocusedImageLabel() {
        if (focusedLabel == null) {
            return;
        }
        imageLabels.remove(focusedLabel);
        remove(focusedLabel);
        layoutLabels();
    }
    
    //metodo helado dos pinos: okus-chokus 
    void setFocusedLabel(MyLabel labelToFocus) {
        if (focusedLabel != null) {
            focusedLabel.setBorder(null);
            focusedLabel.setClicked(false);
        }
        focusedLabel = labelToFocus;

        //focusedLabel.setBorder(new LineBorder(Color.YELLOW));
    }

}