package com.toggle.parser;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class xmlParser implements FeatureParser {
    private static FeatureParser parser = new xmlParser();
    private Map features;

    private xmlParser() {
        features = new HashMap();
        File file = new File(getClass().getResource("/FeatureToggle.xml").getPath());
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
    }

    public static FeatureParser getInstance() {
        if (parser == null) {
            parser = new xmlParser();
        }
        return parser;
    }

    public Map parse() {

        return features;
    }
}
