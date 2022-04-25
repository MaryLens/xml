package work.with.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

public class ParseXML {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		parse("C:\\Users\\Mary\\eclipse\\odissey\\work.with.xml\\Node.xml");

	}
	
	public static void parse(String fileName) throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc =  builder.parse(new File(fileName));
		doc.getDocumentElement().normalize();
		Element root = doc.getDocumentElement();
		NodeList children = root.getElementsByTagName("child");
		for (int i = 0; i < children.getLength(); i++) {
			if(children.item(i).getTextContent().equals("A")) {
				System.out.println(children.item(i).getTextContent());
			}
		}
	}

}
