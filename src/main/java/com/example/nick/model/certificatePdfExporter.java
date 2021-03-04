package com.example.nick.model;

import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import org.apache.xpath.operations.Div;

import javax.servlet.http.HttpServletResponse;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;

public class certificatePdfExporter {


    public void export(HttpServletResponse response) throws DocumentException, IOException {
        Document document = new Document(PageSize.A3);
        PdfWriter.getInstance(document, response.getOutputStream());
        document.open();
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        font.setSize(18);
        font.setColor(Color.MAGENTA);
        Font font1 = FontFactory.getFont(FontFactory.HELVETICA);
        font1.setSize(18);
        font1.setColor(Color.black);
        Paragraph p = new Paragraph("Ovoj sertifikat go dodeluva", font);
        p.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(p);
        Paragraph p1 = new Paragraph("MOJ VODIC ZA FIZICKO ZDRAVJE", font);
        p1.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(p1);
        Paragraph p2 = new Paragraph("Ovoj sertifikat se dodeluva za uspesno kompletiranje na serija vezbi, prodolzete vaka! Moj trener za vas imame na raspolaganje uste mnogu drugi vezbi. Ostanete zdravi i srekjni!", font1);
        p2.setAlignment(Paragraph.ALIGN_JUSTIFIED);
        document.add(p2);
        Paragraph p3 = new Paragraph("Bravo!", font);
        p3.setAlignment(Paragraph.ALIGN_CENTER);
        document.add(p3);
        document.close();

    }
}
