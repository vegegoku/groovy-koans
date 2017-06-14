package i_introduction;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * @author mhmdsalem
 */
public class ReadingCustomersNames {

    public void read() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("customers.xml"));
            NodeList customers = document.getElementsByTagName("customer");
            for (int i = 0; i < customers.getLength(); i++) {
                Node item = customers.item(i);
                System.out.println(item.getAttributes().getNamedItem("name")
                        + " works for "
                        + (item.getAttributes().getNamedItem("company")));
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }

}
