package odczytywanieZPlikuDoBazy;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;


public class XMLParser {
    XMLParser(){
    }

    public static void zparsujXMLa(String ścieżka) {

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {
                boolean bname = false;
                boolean bsurname = false;
                boolean bcity = false;
                boolean bage = false;
                boolean bphone = false;
                boolean bperson = false;
                boolean bemail = false;
                boolean bicq = false;
                boolean bjabber = false;
                int id = 0;

                public void startElement(String uri, String localName, String qName,
                                         Attributes attributes) throws SAXException {
                    if (qName.equalsIgnoreCase("PERSON")) {
                        bperson = true;
                    }
                    if (qName.equalsIgnoreCase("NAME")) {
                        bname = true;
                    }
                    if (qName.equalsIgnoreCase("SURNAME")) {
                        bsurname = true;
                    }
                    if (qName.equalsIgnoreCase("CITY")) {
                        bcity = true;
                    }
                    if (qName.equalsIgnoreCase("AGE")) {
                        bage = true;
                    }
                    if (qName.equalsIgnoreCase("PHONE")) {
                        bphone = true;
                    }
                    if (qName.equalsIgnoreCase("EMAIL")) {
                        bemail = true;
                    }
                    if (qName.equalsIgnoreCase("ICQ")) {
                        bicq = true;
                    }
                    if (qName.equalsIgnoreCase("JABBER")) {
                        bjabber = true;
                    }
                }

                public void endElement(String uri, String localName,
                                       String qName) throws SAXException {
                    if(qName.equalsIgnoreCase("PERSON")) {
                        System.out.println("---------------------\n");
                    }

                }

                public void characters(char ch[], int start, int length) throws SAXException {
                    if (bperson) {
                        id++;
                        System.out.println("---------------------\nOSOBA (" + id + ")");
                        bperson = false;
                    }

                    if (bname) {
                        System.out.println("Imię : " + new String(ch, start, length));
                        bname = false;
                    }
                    if (bsurname) {
                        System.out.println("Nazwisko : " + new String(ch, start, length));
                        bsurname = false;
                    }
                    if (bcity) {
                        System.out.println("Miasto : " + new String(ch, start, length));
                        bcity = false;
                    }
                    if (bage) {
                        System.out.println("Wiek : " + new String(ch, start, length));
                        bage = false;
                    }
                    if (bphone) {
                        System.out.println("Telefon : " + new String(ch, start, length));
                        bphone = false;
                    }
                    if (bemail) {
                        System.out.println("Email : " + new String(ch, start, length));
                        bemail = false;
                    }
                    if (bicq) {
                        System.out.println("ICQ : " + new String(ch, start, length));
                        bicq = false;
                    }
                    if (bjabber) {
                        System.out.println("Jabber : " + new String(ch, start, length));
                        bjabber = false;
                    }
                }
            };

            saxParser.parse(ścieżka, handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// E:\\PROJEKTY INTELLIJ\\src\\odczytywanieZPlikuDoBazy\\dane-osoby.xml
// E:\\PROJEKTY INTELLIJ\\src\\odczytywanieZPlikuDoBazy\\dane-osoby.txt