//package enviando.email;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Properties;
//
//import javax.activation.DataHandler;
//import javax.mail.Address;
//import javax.mail.Authenticator;
//import javax.mail.Message;
//import javax.mail.Multipart;
//import javax.mail.PasswordAuthentication;
//import javax.mail.Session;
//import javax.mail.Transport;
//import javax.mail.internet.InternetAddress;
//import javax.mail.internet.MimeBodyPart;
//import javax.mail.internet.MimeMessage;
//import javax.mail.internet.MimeMultipart;
//import javax.mail.util.ByteArrayDataSource;
//
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfWriter;
//
//public class ObjetoEnviaEmail {
//	private String user = "javeiromaven@gmail.com";
//	private String passwd = "atgsxjheaqbwrqfi";
//	private String listaDestinatarios = "";
//	private String remetente = "";
//	private String assuntoEmail = "";
//	private String textoEmail = "";
//
//	public ObjetoEnviaEmail(String listaDestinatarios, String remetente, String assuntoEmail, String textoEmail) {
//		this.listaDestinatarios = listaDestinatarios;
//		this.remetente = remetente;
//		this.assuntoEmail = assuntoEmail;
//		this.textoEmail = textoEmail;
//	}
//
//	public void enviarEmail(boolean ehtml) throws Exception {
//
//		Properties properties = new Properties();
//
//		properties.put("mail.smtp.ssl.trust", "*");
//		properties.put("mail.smtp.auth", "true"); // Autorização
//		properties.put("mail.smtp.starttls", "true"); // Autenticação
//		properties.put("mail.smtp.host", "smtp.gmail.com"); // Servidor Gmail Google
//		properties.put("mail.smtp.port", "465"); // Porta Google Gmail
//		properties.put("mail.smtp.socketFactory.port", "465"); // Expecífica a porta a ser conectada pelo socket
//		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // Classe socket de conexão o
//																							// SMTP
//
//		Session session = Session.getInstance(properties, new Authenticator() {
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(user, passwd);
//			}
//		});
//
//		Address[] toUser = InternetAddress.parse(listaDestinatarios);
//		Message message = new MimeMessage(session);
//		message.setFrom(new InternetAddress(user, remetente));
//		message.setRecipients(Message.RecipientType.TO, toUser);
//
//		message.setSubject(assuntoEmail);
//
//		if (ehtml) {
//			message.setContent(textoEmail, "text/html; charset=utf-8");
//		} else {
//			message.setText(textoEmail);
//		}
//
//		Transport.send(message);
//	}
//
//	public void enviarEmailAnexo(boolean ehtml) throws Exception {
//
//		Properties properties = new Properties();
//
//		properties.put("mail.smtp.ssl.trust", "*");
//		properties.put("mail.smtp.auth", "true"); // Autorização
//		properties.put("mail.smtp.starttls", "true"); // Autenticação
//		properties.put("mail.smtp.host", "smtp.gmail.com"); // Servidor Gmail Google
//		properties.put("mail.smtp.port", "465"); // Porta Google Gmail
//		properties.put("mail.smtp.socketFactory.port", "465"); // Expecífica a porta a ser conectada pelo socket
//		properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); // Classe socket de conexão o
//																							// SMTP
//
//		Session session = Session.getInstance(properties, new Authenticator() {
//			@Override
//			protected PasswordAuthentication getPasswordAuthentication() {
//				return new PasswordAuthentication(user, passwd);
//			}
//		});
//
//		Address[] toUser = InternetAddress.parse(listaDestinatarios);
//		Message message = new MimeMessage(session);
//		message.setFrom(new InternetAddress(user, remetente));
//		message.setRecipients(Message.RecipientType.TO, toUser);
//		message.setSubject(assuntoEmail);
//
//		/* Parte 1 do e-mail que é texto e a descrição do e-mail */
//		MimeBodyPart corpoEmail = new MimeBodyPart();
//
//		if (ehtml) {
//			corpoEmail.setContent(textoEmail, "text/html; charset=utf-8");
//		} else {
//			corpoEmail.setText(textoEmail);
//		}
//
//		Multipart multipart = new MimeMultipart();
//		multipart.addBodyPart(corpoEmail);
//
//		List<FileInputStream> arquivos = new ArrayList<>();
//		arquivos.add(simuladorPDF());/* Certificado */
//		arquivos.add(simuladorPDF());/* nota fiscal */
//		arquivos.add(simuladorPDF());/* documento texto */
//		arquivos.add(simuladorPDF()); /* Imagem */
//
//		int idex = 0;
//		for (FileInputStream fileOutputStream : arquivos) {
//			/*Parte 2 do e-mail que são os anexo em pdf*/
//			MimeBodyPart anexoEmail = new MimeBodyPart();
//			
//			/* Onde é passado o simuladorDePDf você passa o seu arquivo gravado no banco e dados*/
//			anexoEmail.setDataHandler(new DataHandler(new ByteArrayDataSource(fileOutputStream, "application/pdf")));
//			anexoEmail.setFileName("anexoemail"+ idex +".pdf");			
//			multipart.addBodyPart(anexoEmail);
//			idex++;
//
//		}
//		message.setContent(multipart);
//
//		Transport.send(message);
//	}
//
//	/**
//	 * 
//	 * Esse método simula o PDF ou qualquer arquivo que possa ser enviado por anexo
//	 * no email. Voce pode pegar o arquino no seu banco de dados base64, byte[],
//	 * Stream de Arquivos. Pode estar e um banco de dados, ou em uma pasta.
//	 * 
//	 * Retorn um PDF em Branco com o texto do Paragrafo de exemplo.
//	 */
//	private FileInputStream simuladorPDF() throws IOException, DocumentException {
//
//		Document document = new Document();
//		File file = new File("fileanexo.pdf");
//		file.createNewFile();
//		PdfWriter.getInstance(document, new FileOutputStream(file));
//		document.open();
//		document.add(new Paragraph("CONTEÚDO DO PDF ANEXO COM JAVA EMAIL!"));
//		document.close();
//
//		return new FileInputStream(file);
//	}
//}
