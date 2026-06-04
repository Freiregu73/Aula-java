/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.TemporalQueries.localDate;
import javax.swing.JOptionPane;
import static javax.swing.text.StyleConstants.FontFamily;

/**
 *
 * @author Laboratorio-Info
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws Exception {

        Document doc = null;
        OutputStream os = null;

        try {

            //cria o documento tamanho A4, margens de 2,54cm
            doc = new Document(PageSize.A4, 72, 72, 72, 72);

            //cria a stream de saída
            os = new FileOutputStream("C://Users//Laboratorio-Info//Documents//out.pdf");

            //associa a stream de saída ao
            PdfWriter.getInstance(doc, os);

            //abre o documento
            doc.open();
           String nome = JOptionPane.showInputDialog(null, "Digite o seu nome");

            //adiciona o texto ao PDF
            
            //Font t = new Font(FontFamily. , 20, Font.BOLD);
            
            ///
            LocalDateTime localDate = LocalDateTime.now();//For reference
 
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/LL/yyyy");
    
            String data = localDate.format(formatter);
            
            DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");
    
            String hora = localDate.format(format);
            //
            
            Paragraph p1 = new Paragraph("ATESTADO MÉDICO");
            p1.setAlignment(Element.ALIGN_CENTER);
            doc.add(p1);
            
            
            Paragraph p2 = new Paragraph("Atesto que atendi nesta data o(a) Sr(a) " +nome+ " às "
                    + hora + ", sendo necessário seu afastamento do local de trabalho ou escola por 1 (UM) dia(s),"
                    + " a partir de "+data+", tendo como causa do atendimento o código abaixo:");
            doc.add(p2);
            
            Paragraph p3 = new Paragraph("CID 10- J11");
            doc.add(p3);
            Paragraph p4 = new Paragraph("..........");
            doc.add(p4);
            Paragraph p5 = new Paragraph("CID da doença");
            doc.add(p5);
            
            Paragraph p6 = new Paragraph("SÃO PAULO, "+data);
            doc.add(p6);
            
            Paragraph p7 = new Paragraph("Assinatura do Médico");
            doc.add(p7);
            
            Image assinatura = Image.getInstance("assinatura.png");
            doc.add(assinatura);
            
            Paragraph p8 = new Paragraph("----------------");
            doc.add(p8);
            
            Paragraph p9 = new Paragraph("JOSÉ V.L STEFANELLO                                                             "+data+" "+hora);
            doc.add(p9);
            

        } finally {

            if (doc != null) {

                //fechamento do documento
                doc.close();
            }

            if (os != null) {
                //fechamento da stream de saída
                os.close();
            }
        }
        
        Desktop.getDesktop().open(new File("C://Users//Laboratorio-Info//Documents//out.pdf"));
    }
    
}
