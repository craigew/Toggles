package com.toggle;

import com.toggle.parser.xmlParser;

import java.util.Map;

public class Toggle {

    public static boolean isOn(ProductionFeature productionFeature) {
        try {
            Map features =  xmlParser.getInstance().parse();
            return "on".equalsIgnoreCase(features.get(productionFeature.getFeatureDescription()).toString());
        } catch (Exception ex) {
            return false;
        }

    }
}
