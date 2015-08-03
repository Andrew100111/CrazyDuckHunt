/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GameEngineSystem;

import com.sun.org.apache.xerces.internal.parsers.DOMParser;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/**
 * Class to access the xml file for the ducks' stats
 * @author Xcreed
 */
public class XMLreader {
 
    private DOMParser parser = new DOMParser();
    private int stat;
    
    public int main() throws Exception {
        //Get the DOM Builder Factory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        //Get the DOM Builder
        DocumentBuilder builder = factory.newDocumentBuilder();

        //Load and Parse the XML document
        //document contains the complete XML as a Tree.
        Document document = 
                (Document) builder.parse(new File("src/res/DuckStats.xml"));
   
        
        //Iterating through the nodes and extracting the data.
        NodeList nodeList = document.getDocumentElement().getChildNodes();
        
        for (int i = 0; i < nodeList.getLength(); i++) {
            
            //Finds an element
            Node node = nodeList.item(i);
            
            //For every element in the xml
            if (node instanceof Object) {
                String content = node.getTextContent().trim();
                switch (node.getNodeName()) {
                    
                    //If the name of the enemy is:
                    case "speed" : stat = Integer.parseInt(content);
                    break;
                    
                }
                
            }
        }
        
    return stat;
 
    }
}