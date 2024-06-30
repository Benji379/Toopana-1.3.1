package MODELO;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Timestamp;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class UIController {

    public static void mostrarPanel(JPanel contenedor, JPanel panel) {
        contenedor.removeAll();
//        contenedor.setSize(0, 0);
        contenedor.add(panel, BorderLayout.CENTER);
        contenedor.revalidate();
        contenedor.repaint();
    }

    public static void transparentarTxtField(JTextField... txtField) {
        for (JTextField txt : txtField) {
            txt.setBackground(new java.awt.Color(0, 0, 0, 1));
            txt.setBorder(null);
        }
    }

    public static InputStream toInputStream(String imagePath) throws IOException {
        File imageFile = new File(imagePath);
        if (!imageFile.exists()) {
            throw new IOException("El archivo no existe: " + imagePath);
        }
        return new FileInputStream(imageFile);
    }

    public static Icon toIcon(InputStream inputStream) throws IOException {
        BufferedImage bufferedImage = ImageIO.read(inputStream);
        if (bufferedImage == null) {
            throw new IOException("El InputStream no contiene una imagen vÃ¡lida.");
        }
        return new ImageIcon(bufferedImage);
    }

    public static InputStream toInputStream(Icon icon) throws IOException {
        // Convertir el Icon a BufferedImage
        BufferedImage bufferedImage = new BufferedImage(
                icon.getIconWidth(),
                icon.getIconHeight(),
                BufferedImage.TYPE_INT_ARGB
        );
        Graphics graphics = bufferedImage.getGraphics();
        icon.paintIcon(null, graphics, 0, 0);
        graphics.dispose();

        // Escribir la imagen en un ByteArrayOutputStream
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ImageIO.write(bufferedImage, "png", byteArrayOutputStream);

        // Convertir el ByteArrayOutputStream a InputStream
        return new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
    }

    public static Timestamp obtenerFechaActual() {
        // Obtiene la fecha y hora actual del sistema
        Date fechaActual = new Date();
        // Crea un objeto Timestamp utilizando la fecha actual
        Timestamp timestamp = new Timestamp(fechaActual.getTime());
        return timestamp;
    }

    public static boolean isVacio(String... txts) {
        for (String tx : txts) {
            if (tx.equals("")) {
                return false;
            }
        }
        return true;
    }

    public static void ventanaEmergente(String mensaje, String urlIcono) {
        JOptionPane.showMessageDialog(null, mensaje, "Error", JOptionPane.ERROR_MESSAGE, new UIController().icono(urlIcono));
    }

    public Icon icono(String path) {
        Icon img = new ImageIcon(new ImageIcon(getClass().getResource(path)).getImage().getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH));
        return img;
    }

    public static void vaciosTextField(JTextField... txtsField) {
        for (JTextField tx : txtsField) {
            tx.setText("");
        }
    }

    public static void main(String[] args) {
        if (isVacio("hola", "", "mariano")) {
            System.out.println("exitoso");
            ventanaEmergente("gola", "/img/check.png");
        } else {
            System.out.println("hay vacios");
        }
    }

    public static void textAreaInivisible(JTextArea textArea, JScrollPane scrollTextArea) {
        textArea.setBackground(new Color(255, 255, 255, 0)); // 128 es el nivel de opacidad
        scrollInvisible(scrollTextArea);
        textArea.setWrapStyleWord(true); // Activa el ajuste de líneas
        textArea.setLineWrap(true); // Activa el ajuste de líneas
    }

    public static void scrollInvisible(JScrollPane scroll) {
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        scroll.setBorder(null);
    }

    public static void limitacionNumeros(JTextField txtField, KeyEvent evt, int CantNumeros) {
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        boolean espacio = key == KeyEvent.VK_SPACE;
        if (!numeros || espacio) {
            evt.consume();
        } else {
            if (txtField.getText().length() >= CantNumeros) {
                evt.consume();
            }
        }
    }

    public static void applyPlaceholder(JTextComponent textField, String placeholder) {
        textField.setForeground(Color.GRAY);
        textField.setText(placeholder);

        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if (textField.getText().equals(placeholder)) {
                    textField.setText("");
                    textField.setForeground(Color.WHITE);
                }
            }

            @Override
            public void focusLost(FocusEvent e) {
                if (textField.getText().isEmpty()) {
//                    textField.setForeground(Color.WHITE);
                    textField.setForeground(new Color(255, 255, 255, 161));
                    textField.setText(placeholder);
                }
            }
        });
    }
    
}
