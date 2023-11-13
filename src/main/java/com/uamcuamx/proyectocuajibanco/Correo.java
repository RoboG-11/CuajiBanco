
package com.uamcuamx.proyectocuajibanco;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

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
public class Correo {

    private String correoOrigen;
    private String passwordOrigen;
    private String correoDestino;
    private String asunto;
    private String mensaje;
    private String archivo;

    public Correo() {
        this.correoOrigen = "servicios.cuajibanco@gmail.com";
        this.passwordOrigen = "CuajiBanco2021$";
    }

    public void enviar(String correoDestino, String asunto, String mensaje, String archivo) {
        
        this.correoDestino = correoDestino;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.archivo = archivo;
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            BodyPart texto = new MimeBodyPart();
            texto.setText(this.mensaje);
            BodyPart adjunto = new MimeBodyPart();
            adjunto.setDataHandler(new DataHandler(new FileDataSource(archivo)));
            adjunto.setFileName("Comprobante.pdf");

            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            multiParte.addBodyPart(adjunto);

            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(this.correoOrigen));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.correoDestino));
            message.setSubject(this.asunto);

            message.setContent(multiParte);
            Transport t = session.getTransport("smtp");
            t.connect(this.correoOrigen, this.passwordOrigen);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();

        } catch (AddressException ex) {
            Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    public void enviar(String correoDestino, String asunto, String mensaje) {
        this.correoDestino = correoDestino;
        this.asunto = asunto;
        this.mensaje = mensaje;
        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");

            Session session = Session.getDefaultInstance(props);

            MimeMessage message = new MimeMessage(session);

            message.setFrom(new InternetAddress(this.correoOrigen));

            message.addRecipient(Message.RecipientType.TO, new InternetAddress(this.correoDestino));
            message.setSubject(this.asunto);

            message.setText(this.mensaje);
            Transport t = session.getTransport("smtp");
            t.connect(this.correoOrigen, this.passwordOrigen);
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();

        } catch (AddressException ex) {
            Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MessagingException ex) {
            Logger.getLogger(Correo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
