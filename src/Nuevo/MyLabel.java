package Nuevo;

import java.awt.Color;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

class MyLabel extends JLabel {

    //declaracion de variables
    private final ImageViewPanel imageViewPanel;
    private boolean clicked = false; 
    static int centinela = 0;

    //constructor 1
    public MyLabel(Icon image, ImageViewPanel imageViewPanel) {
        super(image);
        this.imageViewPanel = imageViewPanel;
        initLabel();
    }

    //constructor 2
    public MyLabel(String text, ImageViewPanel imageViewPanel) {
        super(text);
        this.imageViewPanel = imageViewPanel;
        initLabel();
    }

    //metodo de acciones
    private void initLabel() {
        setFocusable(true);
        addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                clicked = true;
                if(clicked){
                    imageViewPanel.setFocusedLabel(MyLabel.this);
                    imageViewPanel.removeFocusedImageLabel();
                    centinela++;
                    System.out.println("Centinela "+ centinela);
                }
                
//                if(clicked){
//                    imageViewPanel.removeFocusedImageLabel();
//                    centinela++;
//                    System.out.println("Centinela "+centinela);  
//                }
            }
               
            //metodo que hace cosas 2
            @Override
            public void mouseEntered(MouseEvent me) {
                super.mouseEntered(me);
                if (clicked) {
                    return;
                }
                setBorder(new LineBorder(Color.RED));
                //call for focus mouse is over this component
                requestFocusInWindow();
            }
        });

        addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent f) {
                super.focusLost(f);

                if (clicked) {
                    return;
                }

                setBorder(null);
            }
        });
    }

    public void setClicked(boolean clicked) {
        this.clicked = clicked;
    }

    public boolean isClicked() {
        return clicked;
    }
}