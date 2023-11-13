
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
public class comprobanteCreacionCuenta {
    public static boolean crearComprobanteCreacionCuenta(movCreacionCuenta C) throws FileNotFoundException, DocumentException, IOException {
        Document documento;
        FileOutputStream  archivo; 
        Rectangle pageSize = new Rectangle(400, 500); 
        documento = new Document(pageSize,15,15,15,15);
        try{
            archivo = new FileOutputStream("./IMPRESORA/"+C.tipoTran+"_"+C.numTran+".pdf");
            PdfWriter.getInstance(documento,archivo);
            Image img = Image.getInstance("src/main/resources/Imagenes/LogoCuajiBancopdf.jpg");
            img.scaleToFit(200,80);
            img.setAlignment(Chunk.ALIGN_CENTER);
            
            Image img2 = Image.getInstance("src/main/resources/Imagenes/LogoCuajiBancoCircularpdf.jpg");
            img2.scaleToFit(100,40);
            img2.setAlignment(Chunk.ALIGN_CENTER);
            Font f2 = new Font(Font.FontFamily.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLACK);
            Paragraph p1 = new Paragraph
            ("Estimado(a):"+C.nombre+"\n"+
             "Te informamos que se creó una nueva cuenta, asociada al siguiente número de cliente.\n",f2);
             p1.setAlignment(Paragraph.ALIGN_LEFT); 
           Paragraph p11 = new Paragraph
              ("Te pedimos que revises los siguientes datos, en caso de a ver algún error por favor comunicate a teléfono que se encuentra al final de este documento o bien puedes visitarnos en nuestra sucursal\n",f2);//10espacios)
            p11.setAlignment(Paragraph.ALIGN_LEFT); 
           Font f3 = new Font(Font.FontFamily.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLUE);
             Paragraph p2 = new Paragraph("Número de cliente:  "+C.numCliente+"\n",f3);
             p2.setAlignment(Paragraph.ALIGN_LEFT);  
            Font f7 = new Font(Font.FontFamily.TIMES_ROMAN,10,Font.BOLDITALIC,BaseColor.BLUE);
             Paragraph p3 = new Paragraph("Fecha y Hora: \n"+C.FechayHora+"\n",f7);
             p3.setAlignment(Paragraph.ALIGN_LEFT); 
             Paragraph p12 = new Paragraph("Número de Cuenta Creado: "+C.numCuenta+"\n",f7);
             p12.setAlignment(Paragraph.ALIGN_LEFT); 
             Font f11 = new Font(Font.FontFamily.TIMES_ROMAN,13,Font.BOLDITALIC,BaseColor.BLACK);
             Paragraph p4 = new Paragraph("---------------------------------------------------------------------------",f11);//separador
            p4.setAlignment(Paragraph.ALIGN_CENTER);
            Font f12 = new Font(Font.FontFamily.TIMES_ROMAN,9,Font.BOLDITALIC,BaseColor.BLUE);
             Paragraph p5 = new Paragraph("Número de transacción: "+C.numTran+"\n",f12);
            p5.setAlignment(Paragraph.ALIGN_LEFT);
             p2.setAlignment(Paragraph.ALIGN_LEFT); 
             
            
             Font f10 = new Font(Font.FontFamily.HELVETICA,8,Font.BOLDITALIC,BaseColor.BLACK);
             Paragraph p6 = new Paragraph("DIRECTOR GENERAL: DR. J. GUILLERMO FALCÓN\n",f10);
             p6.setAlignment(Paragraph.ALIGN_CENTER);
             Paragraph p7 = new Paragraph("Vasco de Quiroga 4871, Alcaldía, Cuajimalpa de Morelos, "
                                            + "05348 Ciudad de México, CDMX\n",f10);
             p7.setAlignment(Paragraph.ALIGN_CENTER);
             Paragraph  p8 = new Paragraph("CUAJIBANCO S.A, DONDE TU DINERO NO VALE NADA",f10);
             p8.setAlignment(Paragraph.ALIGN_CENTER);
             Paragraph p9 = new Paragraph("Para aclaraciones comunicarse al: "
                                            + "56-10-74-30-85",f10);
            p9.setAlignment(Paragraph.ALIGN_CENTER);
            
            
            
            documento.open();
            documento.add(img);
            documento.add(p1);
            documento.add(p12);
            documento.add(p2);
            documento.add(p5);
            documento.add(p3);
            documento.add(p11);
            documento.add(p4);
            
            
            documento.add(img2);
            documento.add(p8);
            documento.add(p7);
            documento.add(p6);
            documento.add(p9);
            documento.close();
            System.out.println("documento de creacion de cuenta, creado con exito");
        }catch(FileNotFoundException | DocumentException e){
            System.err.println(e.getMessage());
        }
        return false;
    }
}
