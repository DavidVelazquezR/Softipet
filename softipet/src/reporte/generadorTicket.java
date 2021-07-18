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
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JTable;

/**
 *
 * @author chido
 */
public class generadorTicket {

    private Font fuenteBold = new Font(Font.FontFamily.COURIER, 5, Font.BOLD);
    private Font fuenteNormalShort = new Font(Font.FontFamily.COURIER, 5, Font.NORMAL);
    private Font fuenteBoldShort = new Font(Font.FontFamily.COURIER, 10, Font.BOLD);
    private Font fuenteNormal = new Font(Font.FontFamily.COURIER, 2);
    private Font fuenteItalic = new Font(Font.FontFamily.COURIER, 5, Font.ITALIC);

    public void generarPDF(String header, String headerLeft, JTable ventas,
            float total, String footer, String salida) {
        try {

            Document document = new Document(PageSize.A8, 25, 25, 20, 20);
            PdfWriter.getInstance(document, new FileOutputStream(salida));
            document.open();

            document.add(getHeader(header));
            document.add(getHeaderleft(headerLeft));
            System.out.println("Tamaño del row: " + ventas.getColumnCount());
            try {
                PdfPTable table = new PdfPTable(ventas.getColumnCount() - 1);
                table.addCell(getInfo1("ID Producto"));
                table.addCell(getInfo1("Nombre Producto"));
                table.addCell(getInfo1("Cantidad"));
                table.addCell(getInfo1("Precio"));
                table.addCell(getInfo1("Subtotal"));

                for (int i = 0; i < ventas.getRowCount(); i++) {
                    table.addCell(getInfo1((String) ventas.getValueAt(i, 0)));
                    table.addCell(getInfo1((String) ventas.getValueAt(i, 1)));
                    table.addCell(getInfo1((String) ventas.getValueAt(i, 3)));
                    table.addCell(getInfo1((String) ventas.getValueAt(i, 4)));
                    table.addCell(getInfo1((String) ventas.getValueAt(i, 5)));
                }

                PdfPCell celdaFinal = new PdfPCell(new Paragraph(getInfo1("Total: " + total)));
                celdaFinal.setColspan(ventas.getColumnCount());
                table.addCell(celdaFinal);
                document.add(table);
            } catch (Exception e) {
                System.out.println("Error al crear la tabla");
            }

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
        p.setAlignment(Element.ALIGN_CENTER);
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
        Paragraph p = new Paragraph(6);
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fuenteItalic);
        p.add(c);

        return p;
    }
}
