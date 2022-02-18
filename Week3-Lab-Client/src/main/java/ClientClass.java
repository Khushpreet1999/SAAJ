
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConnection;
import javax.xml.soap.SOAPConnectionFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPPart;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khushpreetkaurgulati
 */
public class ClientClass {
    public static void main(String[] args) {
    
    //SAAJ Implementation
   //Instantiate a new MessageFactory instance and call createMessage() to create a new SOAP message

    MessageFactory mf;
        try {
            mf = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);
        
    
    SOAPMessage soapMessage = mf.createMessage();
    
    SOAPPart soapPart = soapMessage.getSOAPPart();
    
    SOAPEnvelope soapEnvelope = soapPart.getEnvelope();
    soapEnvelope.addNamespaceDeclaration("S","http://schemas.xmlsoap.org/soap/envelope/");
    soapEnvelope.setPrefix("S");
    
    
    SOAPHeader soapHeader = soapMessage.getSOAPHeader();
    soapHeader.detachNode();
    
    SOAPBody soapBody = soapMessage.getSOAPBody();
    soapBody.addNamespaceDeclaration("ns2", "http://service.my/");
    soapBody.setPrefix("S");
    
    QName qname = new QName("","GetAllMenuItems","ns2");
    soapBody.addChildElement(qname);
    
    
    soapMessage.writeTo(System.out);
    
    
    //create connection to call the web service and get the response

 SOAPConnectionFactory scFactory = SOAPConnectionFactory.newInstance() ;   
 
 SOAPConnection soapConnection =  scFactory.createConnection();
 
 URL endpoint = new URL("http://localhost:8080/Week3-Lab/MenuListService");
 SOAPMessage response = soapConnection.call(soapMessage, endpoint);
 
 System.out.println(" ");
 
 System.out.println("***************** Response ****************");
 
 response.writeTo(System.out);
    
    
 } catch (SOAPException ex) {
            Logger.getLogger(ClientClass.class.getName()).log(Level.SEVERE, null, ex);
 }      catch (IOException ex) {
            Logger.getLogger(ClientClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

 


