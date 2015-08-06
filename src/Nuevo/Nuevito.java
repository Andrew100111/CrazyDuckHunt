package Nuevo;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;


public class Nuevito{
    
    static int count = 0;
    
    //main, inicia todo
    public static void main(String[] args) {
        createAndShowJFrame();
    }
    
    //instancia de un frame [que va ser el objeto infertaz] de la clase JFrame
    public static void createAndShowJFrame() {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {

                JFrame frame = createJFrame();
                frame.setVisible(true);

            }
        });
    }

    private static JFrame createJFrame() {
        
        //frame y sus caracteristicas
        JFrame window = new JFrame();
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Crazy Hunt Duck");
        //window.setSize(900,900);

        //array de las imagenes
        ArrayList<BufferedImage> ducks = null;
        

        //el array de imagenes se convierte en una array de patos
        try {
            ducks = getImagesArrayList();
        }catch (Exception ex){
        }
        
        
        //panel donde estan las imagenes
        final ImageViewPanel imageViewPanel = new ImageViewPanel(ducks);
        JScrollPane jsp = new JScrollPane(imageViewPanel);
        jsp.setPreferredSize(new Dimension(350, 200));
        window.add(jsp);
        
        /**HACER UN PANEL POR PATITO PARA
        MOVER EL PANEL PARA MOVER EL PATO**/ 
          
         
        //bandera
        System.out.println(ducks);

        //panel aparte para poner el boton
        JPanel controlPanel = new JPanel();
        
        //boton y su funcion de borrar la imagen
        JButton button = new JButton("Muerte Al Pato");
        button.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                imageViewPanel.removeFocusedImageLabel();
                count++;
                System.out.println("bandera " + count);
            }
        });
        
        //añade el boton al nuevo panel
        controlPanel.add(button);
        window.add(controlPanel, BorderLayout.NORTH);
        window.pack();
        
        //retorna el frame (ventana principal)
        return window;
    }

    //metodo meter un array las imagenes utilizadas
    private static ArrayList<BufferedImage> getImagesArrayList() throws Exception {
        
        //lista donde estan contenidas las imagenes
        ArrayList<BufferedImage> array = new ArrayList<>();
        
        //declaracion de las imagenes
        //objetosPatos
        BufferedImage patoSalvaje1 = ImageIO.read(new File("/home/randy/NetBeansProjects/Aprendiendo/src/res/patoSalvaje1.png"));
        BufferedImage patoSalvaje2 = ImageIO.read(new File("/home/randy/NetBeansProjects/Aprendiendo/src/res/patoSalvaje2.png"));
        BufferedImage tux = ImageIO.read(new File("/home/randy/NetBeansProjects/Aprendiendo/src/res/tux.png"));
        BufferedImage patoColorado1 = ImageIO.read(new File("/home/randy/NetBeansProjects/Aprendiendo/src/res/patoColorado1.png"));

        //resize(tux,100,100);
        
        array.add(resize(ImageIO.read(new File("/home/randy/NetBeansProjects/Aprendiendo/src/res/tux.png")), 100, 100));
        
        //añadiendo las imagenes a la lista
        array.add(patoSalvaje1);
        array.add(patoSalvaje2);
        array.add(patoColorado1);
        //array.add(resize((tux,100,100)));
        return array;
    }

    //metodo para editar el tamaño de las imagenes
    public static BufferedImage resize(BufferedImage image, int width, int height) {
        
        //editedImage -> imagen editedImage
        BufferedImage editedImage = new BufferedImage(width, height, BufferedImage.TRANSLUCENT);
        Graphics2D g2d = (Graphics2D) editedImage.createGraphics();
        g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
        g2d.drawImage(image, 0, 0, width, height, null);
        g2d.dispose();
        return editedImage;
    }
    
    //end
}


