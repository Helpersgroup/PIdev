/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pidev.presentation;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author unknown
 */
public class Mailing {
     public boolean  send(String to_mail) {
     
        
           String[] to ={to_mail};
            if(sendMail("hakim.khanchouch@esprit.tn","08974683HH","<h1>Votre reservation a été accepter vous pouvez <br> tirer votre facture <br> Merci ",to)){
            return true;
            }
            else 
            return false;

    }
   
public static boolean sendMail(String from,String password,String message,String to[]){
String host="smtp.gmail.com";
Properties props=System.getProperties();
props.put("mail.smtp.starttls.enable","true");
props.put("mail.smpt.host",host);
props.put("mail.smtp.user",from);
props.put("mail.smtp.password",password);
props.put("mail.smtp.port",587);
props.put("mail.smtp.auth","true");
Session session=Session.getDefaultInstance(props,null);
MimeMessage mime=new MimeMessage(session);
try{
mime.setFrom(new InternetAddress(from));
InternetAddress[] toAddress=new InternetAddress[to.length];
for(int i=0;i<to.length;i++){
toAddress[i]=new InternetAddress(to[i]);
}
for(int i=0;i<toAddress.length;i++){
mime.addRecipient(Message.RecipientType.TO,toAddress[i]);
}
mime.setSubject("Voyage à La Carte Validation de reservation");
mime.setText(message);
        javax.mail.Transport transport=session.getTransport("smtp");
transport.connect(host,from,password);
transport.sendMessage(mime,mime.getAllRecipients());
transport.close();
return true;
}
catch(MessagingException me){
	me.printStackTrace();
}
return false;
}
}
