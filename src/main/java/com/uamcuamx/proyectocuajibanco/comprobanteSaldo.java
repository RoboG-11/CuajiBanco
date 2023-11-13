
package com.uamcuamx.proyectocuajibanco;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Proyecto Final Programación Orientada a Objetos
 * Simulación del funncionamiento de un cajero automatico
 * Proyecto: Cuajibanco
 * Integrantes Equipo 1 
 * Rivera Martinez Brian
 * Rivera Plata Jesus Alejandro
 * Vazquez Cerritos Marco Alejandro
 * Victoria Nava Natalia
 */
public class comprobanteSaldo {
    
     public static boolean crearComprobanteSaldo(movSaldo saldo) throws FileNotFoundException, DocumentException, IOException {
        Document documento;
        FileOutputStream  archivo; 
        Rectangle pageSize = new Rectangle(200, 300); 
        documento = new Document(pageSize,10,10,10,10);
        try{
            archivo = new FileOutputStream("./IMPRESORA/"+saldo.tipoTran+"_"+saldo.numTran+".pdf");
            PdfWriter.getInstance(documento,archivo);
            Image img = Image.getInstance("src/main/resources/Imagenes/LogoCuajiBancopdf.jpg");
            img.scaleToFit(100,40);
            img.setAlignment(Chunk.ALIGN_CENTER);
            
            Image img2 = Image.getInstance("src/main/resources/Imagenes/LogoCuajiBancoCircularpdf.jpg");
            img2.scaleToFit(50,20);
            img2.setAlignment(Chunk.ALIGN_CENTER);
            //hasta aqui
            Font f1 = new Font(Font.FontFamily.HELVETICA,9,Font.UNDERLINE,BaseColor.DARK_GRAY);
            Paragraph p1 = new Paragraph("CONSULTA DE SALDO\n",f1);
             p1.setAlignment(Paragraph.ALIGN_CENTER);
            Font f2 = new Font(Font.FontFamily.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK);
            Paragraph p2 = new Paragraph("Nombre - - - - - - - "+saldo.nombre+" \n",f2);
            p2.setAlignment(Paragraph.ALIGN_LEFT); 
            Font f3 = new Font(Font.FontFamily.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLACK);
             Paragraph p3 = new Paragraph("Cliente - - - - - - - "+saldo.numCliente+"\n",f3);
             p3.setAlignment(Paragraph.ALIGN_LEFT); 
             Font f4 = new Font(Font.FontFamily.HELVETICA,10,Font.UNDERLINE,BaseColor.BLACK);
             Paragraph p4 = new Paragraph("DATOS PERSONALES",f4);
             p4.setAlignment(Paragraph.ALIGN_CENTER); 
             Font f5 = new Font(Font.FontFamily.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.BLUE);
             Paragraph p5 = new Paragraph("Cuenta - - - - - - - "+saldo.numCuenta+"\n",f5);
             p5.setAlignment(Paragraph.ALIGN_LEFT); 
             Paragraph p6 = new Paragraph("Tarjeta - - - - - - - "+saldo.numTarjeta+"\n",f5);
             p6.setAlignment(Paragraph.ALIGN_LEFT); 
            Font f7 = new Font(Font.FontFamily.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.DARK_GRAY);
             Paragraph p7 = new Paragraph("Fecha y Hora - - - - - "+saldo.FechayHora+"\n",f7);
             p7.setAlignment(Paragraph.ALIGN_LEFT); 
             Font f8 = new Font(Font.FontFamily.TIMES_ROMAN,8,Font.BOLDITALIC,BaseColor.ORANGE);
             Paragraph p8 = new Paragraph("TU SALDO ES DE: C$"+saldo.saldo+"\n",f8);
             p8.setAlignment(Paragraph.ALIGN_CENTER); 
             Font f11 = new Font(Font.FontFamily.HELVETICA,7,Font.BOLDITALIC,BaseColor.BLACK);
             Paragraph p14 = new Paragraph("---------------------------------------------------------------------------",f11);//separador
            p14.setAlignment(Paragraph.ALIGN_CENTER);
            Font f12 = new Font(Font.FontFamily.TIMES_ROMAN,7,Font.BOLDITALIC,BaseColor.BLACK);
             Paragraph p15 = new Paragraph("NÚMERO DE TRANSACCIÓN: "+saldo.numTran+"\n",f12);
            p15.setAlignment(Paragraph.ALIGN_CENTER);
             
             //datos que van en todos los recibos
             Font f10 = new Font(Font.FontFamily.HELVETICA,6,Font.BOLDITALIC,BaseColor.BLACK);
             Paragraph p10 = new Paragraph("DIRECTOR GENERAL: DR. J. GUILLERMO FALCÓN\n",f10);
             p10.setAlignment(Paragraph.ALIGN_CENTER);
             Paragraph p11 = new Paragraph("Vasco de Quiroga 4871, Alcaldía, Cuajimalpa de Morelos, "
                                            + "05348 Ciudad de México, CDMX\n",f10);
             p11.setAlignment(Paragraph.ALIGN_CENTER);
             Paragraph p12 = new Paragraph("CUAJIBANCO S.A, DONDE TU DINERO NO VALE NADA",f10);
             p12.setAlignment(Paragraph.ALIGN_CENTER);
             Paragraph p13 = new Paragraph("Para aclaraciones comunicarse al: "
                                            + "56-16-30-50-10",f10);
            p13.setAlignment(Paragraph.ALIGN_CENTER);
            
            
            
            documento.open();
            documento.add(img);
            documento.add(p4);
            documento.add(p2);
            documento.add(p3);
            documento.add(p5);
            documento.add(p6);
            documento.add(p14);
            documento.add(p1);
            documento.add(p7);
            documento.add(p15);
           documento.add(p8);
           documento.add(p14);
            documento.add(img2);
            documento.add(p12);
            documento.add(p11);
             documento.add(p10);
             documento.add(p13);
            documento.close();
            System.out.println("Comprobante de Consulta de Saldo, creado con exito");
        }catch(FileNotFoundException | DocumentException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
}
