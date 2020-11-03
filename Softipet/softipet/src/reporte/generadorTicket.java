/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reporte;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author chido
 */
public class generadorTicket {

    private Font fuenteBold = new Font(Font.FontFamily.COURIER, 10, Font.BOLD);
    private Font fuenteNormalShort = new Font(Font.FontFamily.COURIER, 10, Font.NORMAL);
    private Font fuenteBoldShort = new Font(Font.FontFamily.COURIER, 10, Font.BOLD);
    private Font fuenteNormal = new Font(Font.FontFamily.COURIER, 8);
    private Font fuenteItalic = new Font(Font.FontFamily.COURIER, 10, Font.ITALIC);

    public void generarPDF(String header, String rutaIcon, String headerLeft,
            String info1, String info2, String info3, String info4, String footer, String salida) {
        try {

            Document document = new Document(PageSize.A5.rotate(), 25, 25, 20, 20);
            PdfWriter.getInstance(document, new FileOutputStream(salida));
            document.open();

            document.add(getIcon(rutaIcon));
            document.add(getHeader(header));
            document.add(getHeaderleft(headerLeft));
            document.add(getInfobold("Animal: "));
            document.add(getInfo1(info1));
            document.add(getInfobold("Raza: "));
            document.add(getInfo1(info2));
            document.add(getInfobold("Diagnostico: "));
            document.add(getInfo1(info3));
            document.add(getInfobold("Medicación: "));
            document.add(getInfo1(info4));
            document.add(getFooter(footer));
            document.close();

        } catch (Exception e) {
        }
    }

    private Image getIcon(String pathIcon) throws BadElementException, IOException {
        Image imagen = Image.getInstance(pathIcon);
        imagen.setAlignment(Element.ALIGN_TOP);

        return imagen;
    }

    private Paragraph getHeader(String texto) {
        Paragraph p = new Paragraph(6);
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_RIGHT);
        c.append(texto);
        c.setFont(fuenteBold);
        p.add(c);

        return p;
    }

    private Paragraph getHeaderleft(String texto) {
        Paragraph p = new Paragraph(6);
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_RIGHT);
        c.append(texto);
        c.setFont(fuenteNormalShort);
        p.add(c);

        return p;
    }

    private Paragraph getInfo1(String texto) {
        Paragraph p = new Paragraph(20);
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_JUSTIFIED);
        c.append(texto);
        c.setFont(fuenteNormal);
        p.add(c);

        return p;
    }

    private Paragraph getInfobold(String texto) {
        Paragraph p = new Paragraph(20);
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_JUSTIFIED);
        p.setIndentationLeft(3);

        c.append(texto);
        c.setFont(fuenteBoldShort);
        p.add(c);

        return p;
    }

    private Paragraph getFooter(String texto) {
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fuenteItalic);
        p.add(c);

        return p;
    }
}
