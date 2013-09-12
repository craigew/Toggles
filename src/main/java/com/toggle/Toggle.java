package com.toggle;

import com.toggle.parser.StandardFeatureParser;
import com.toggle.v2.ToggleType;

import java.util.Map;

public class Toggle {

    public static boolean isOn(ProductionFeature productionFeature) {
        try {
            Map features =  StandardFeatureParser.getInstance().parse();
            return "on".equalsIgnoreCase(features.get(productionFeature.getFeatureDescription()).toString());
        } catch (Exception ex) {
            return false;
        }

    }
}
