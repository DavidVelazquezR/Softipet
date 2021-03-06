/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import com.toedter.calendar.JDateChooser;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 *
 * @author DavidVelazquez
 */
public class cambioColor {

    private Color verdeClaro = new Color(130, 224, 170);
    private Color verdeOscuro = new Color(30, 132, 73);
    private Color rojoClaro = new Color(240, 128, 128);
    private Color rojoOscuro = new Color(123, 36, 28);
    private Color azulClaro = new Color(187, 212, 236);
    private Color azulOscuro = new Color(80, 117, 144);
    private Color amarilloClaro = new Color(255, 245, 157);
    private Color amarilloOscuro = new Color(195, 175, 3);
    private Color negro = Color.BLACK;
    private Color blanco = Color.WHITE;
    private Color gris = new Color(240, 240, 240);

    public cambioColor() {
    }

    public void cVerde(Object... objs) {
        for (Object obj : objs) {
            if (obj instanceof JTextField) {
                ((JTextField) obj).setBackground(getVerdeClaro());
                ((JTextField) obj).setForeground(getVerdeOscuro());
                ((JTextField) obj).setSelectionColor(getVerdeOscuro());
                ((JTextField) obj).setSelectedTextColor(getVerdeClaro());
                ((JTextField) obj).setCaretColor(getVerdeOscuro());
            }

            if (obj instanceof JPasswordField) {
                ((JPasswordField) obj).setBackground(getVerdeClaro());
                ((JPasswordField) obj).setForeground(getVerdeOscuro());
                ((JPasswordField) obj).setSelectionColor(getVerdeOscuro());
                ((JPasswordField) obj).setSelectedTextColor(getVerdeClaro());
                ((JPasswordField) obj).setCaretColor(getVerdeOscuro());
            }

            if (obj instanceof JLabel) {
                ((JLabel) obj).setForeground(getVerdeOscuro());
            }

            if (obj instanceof JTextArea) {
                ((JTextArea) obj).setBackground(getVerdeClaro());
                ((JTextArea) obj).setForeground(getVerdeOscuro());
                ((JTextArea) obj).setSelectionColor(getVerdeOscuro());
                ((JTextArea) obj).setSelectedTextColor(getVerdeClaro());
                ((JTextArea) obj).setCaretColor(getVerdeOscuro());
            }

            if (obj instanceof JPanel) {
                ((JPanel) obj).setBackground(getVerdeClaro());
                ((JPanel) obj).setBorder(BorderFactory.createLineBorder(getVerdeOscuro()));
            }

            if (obj instanceof JDateChooser) {
                ((JDateChooser) obj).setBackground(getVerdeClaro());
                ((JDateChooser) obj).setForeground(getVerdeOscuro());
                ((JDateChooser) obj).getDateEditor().getUiComponent().setBorder(null);
            }
        }
    }

    public void cRojo(Object... objs) {
        for (Object obj : objs) {
            if (obj instanceof JTextField) {
                ((JTextField) obj).setBackground(getRojoClaro());
                ((JTextField) obj).setForeground(getRojoOscuro());
                ((JTextField) obj).setSelectionColor(getRojoOscuro());
                ((JTextField) obj).setSelectedTextColor(getRojoClaro());
                ((JTextField) obj).setCaretColor(getRojoOscuro());
            }

            if (obj instanceof JLabel) {
                ((JLabel) obj).setForeground(getRojoOscuro());
            }

            if (obj instanceof JTextArea) {
                ((JTextArea) obj).setBackground(getRojoClaro());
                ((JTextArea) obj).setForeground(getRojoOscuro());
                ((JTextArea) obj).setSelectionColor(getRojoOscuro());
                ((JTextArea) obj).setSelectedTextColor(getRojoClaro());
                ((JTextArea) obj).setCaretColor(getRojoOscuro());
            }

            if (obj instanceof JPanel) {
                ((JPanel) obj).setBackground(getRojoClaro());
                ((JPanel) obj).setBorder(BorderFactory.createLineBorder(getRojoOscuro()));
            }
        }
    }

    public void cAzul(Object... objs) {
        for (Object obj : objs) {
            if (obj instanceof JTextField) {
                ((JTextField) obj).setBackground(getAzulClaro());
                ((JTextField) obj).setForeground(getAzulOscuro());
                ((JTextField) obj).setSelectionColor(getAzulOscuro());
                ((JTextField) obj).setSelectedTextColor(getAzulClaro());
                ((JTextField) obj).setCaretColor(getAzulOscuro());
            }

            if (obj instanceof JLabel) {
                ((JLabel) obj).setForeground(getAzulOscuro());
            }

            if (obj instanceof JTextArea) {
                ((JTextArea) obj).setBackground(getAzulClaro());
                ((JTextArea) obj).setForeground(getAzulOscuro());
                ((JTextArea) obj).setSelectionColor(getAzulOscuro());
                ((JTextArea) obj).setSelectedTextColor(getAzulClaro());
                ((JTextArea) obj).setCaretColor(getAzulOscuro());
            }

            if (obj instanceof JPanel) {
                ((JPanel) obj).setBackground(getAzulClaro());
                ((JPanel) obj).setBorder(BorderFactory.createLineBorder(getAzulOscuro()));
            }
        }
    }

    public void cAmarillo(Object... objs) {
        for (Object obj : objs) {
            if (obj instanceof JTextField) {
                ((JTextField) obj).setBackground(getAmarilloClaro());
                ((JTextField) obj).setForeground(getAmarilloOscuro());
                ((JTextField) obj).setSelectionColor(getAmarilloOscuro());
                ((JTextField) obj).setSelectedTextColor(getAmarilloClaro());
                ((JTextField) obj).setCaretColor(getAmarilloOscuro());
            }

            if (obj instanceof JLabel) {
                ((JLabel) obj).setForeground(getAmarilloOscuro());
            }

            if (obj instanceof JTextArea) {
                ((JTextArea) obj).setBackground(getAmarilloClaro());
                ((JTextArea) obj).setForeground(getAmarilloOscuro());
                ((JTextArea) obj).setSelectionColor(getAmarilloOscuro());
                ((JTextArea) obj).setSelectedTextColor(getAmarilloClaro());
                ((JTextArea) obj).setCaretColor(getAmarilloOscuro());
            }

            if (obj instanceof JPanel) {
                ((JPanel) obj).setBackground(getAmarilloClaro());
                ((JPanel) obj).setBorder(BorderFactory.createLineBorder(getAmarilloOscuro()));
            }
        }
    }

    public void cDisable(Object... objs) {
        for (Object obj : objs) {
            if (obj instanceof JTextField) {
                ((JTextField) obj).setBackground(getGris());
                ((JTextField) obj).setForeground(getNegro());
                ((JTextField) obj).setSelectionColor(getNegro());
                ((JTextField) obj).setSelectedTextColor(getGris());
                ((JTextField) obj).setCaretColor(getNegro());
            }

            if (obj instanceof JPasswordField) {
                ((JPasswordField) obj).setBackground(getGris());
                ((JPasswordField) obj).setForeground(getNegro());
                ((JPasswordField) obj).setSelectionColor(getNegro());
                ((JPasswordField) obj).setSelectedTextColor(getGris());
                ((JPasswordField) obj).setCaretColor(getNegro());
            }

            if (obj instanceof JLabel) {
                ((JLabel) obj).setForeground(getNegro());
            }

            if (obj instanceof JTextArea) {
                ((JTextArea) obj).setBackground(getGris());
                ((JTextArea) obj).setForeground(getNegro());
                ((JTextArea) obj).setSelectionColor(getNegro());
                ((JTextArea) obj).setSelectedTextColor(getGris());
                ((JTextArea) obj).setCaretColor(getNegro());
            }

            if (obj instanceof JPanel) {
                ((JPanel) obj).setBackground(getGris());
                ((JPanel) obj).setBorder(BorderFactory.createLineBorder(getNegro()));
            }
        }
    }

    public void cDefault(Object... objs) {
        for (Object obj : objs) {
            if (obj instanceof JTextField) {
                ((JTextField) obj).setBackground(getBlanco());
                ((JTextField) obj).setForeground(getNegro());
                ((JTextField) obj).setSelectionColor(getNegro());
                ((JTextField) obj).setSelectedTextColor(getBlanco());
                ((JTextField) obj).setCaretColor(getNegro());
            }

            if (obj instanceof JPasswordField) {
                ((JPasswordField) obj).setBackground(getBlanco());
                ((JPasswordField) obj).setForeground(getNegro());
                ((JPasswordField) obj).setSelectionColor(getNegro());
                ((JPasswordField) obj).setSelectedTextColor(getBlanco());
                ((JPasswordField) obj).setCaretColor(getNegro());
            }

            if (obj instanceof JLabel) {
                ((JLabel) obj).setForeground(getNegro());
            }

            if (obj instanceof JTextArea) {
                ((JTextArea) obj).setBackground(getBlanco());
                ((JTextArea) obj).setForeground(getNegro());
                ((JTextArea) obj).setSelectionColor(getNegro());
                ((JTextArea) obj).setSelectedTextColor(getBlanco());
                ((JTextArea) obj).setCaretColor(getNegro());
            }

            if (obj instanceof JPanel) {
                ((JPanel) obj).setBackground(getBlanco());
                ((JPanel) obj).setBorder(BorderFactory.createLineBorder(getNegro()));
            }
        }
    }

    /**
     * @return the verdeClaro
     */
    public Color getVerdeClaro() {
        return verdeClaro;
    }

    /**
     * @return the verdeOscuro
     */
    public Color getVerdeOscuro() {
        return verdeOscuro;
    }

    /**
     * @return the rojoClaro
     */
    public Color getRojoClaro() {
        return rojoClaro;
    }

    /**
     * @return the rojoOscuro
     */
    public Color getRojoOscuro() {
        return rojoOscuro;
    }

    /**
     * @return the negro
     */
    public Color getNegro() {
        return negro;
    }

    /**
     * @return the blanco
     */
    public Color getBlanco() {
        return blanco;
    }

    /**
     * @return the azulClaro
     */
    public Color getAzulClaro() {
        return azulClaro;
    }

    /**
     * @return the azulOscuro
     */
    public Color getAzulOscuro() {
        return azulOscuro;
    }

    /**
     * @return the amarilloClaro
     */
    public Color getAmarilloClaro() {
        return amarilloClaro;
    }

    /**
     * @return the amarilloOscuro
     */
    public Color getAmarilloOscuro() {
        return amarilloOscuro;
    }

    /**
     * @return the gris
     */
    public Color getGris() {
        return gris;
    }

}
