package com.toggle.parser;

import com.toggle.v2.ToggleType;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class FeatureParser {

    protected static Map xmlToMap(ToggleType toggleType) {
        Map features = new HashMap();
        File file = new File(FeatureParser.class.getResource("/" + toggleType.getToggleXml()).getPath());

        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            NodeList nList = doc.getElementsByTagName("feature");

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                Element eElement = (Element) nNode;

                String featureName = eElement.getAttribute("name");
                String featureOn = eElement.getAttribute("value");
                features.put(featureName, featureOn);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return features;
    }
}
