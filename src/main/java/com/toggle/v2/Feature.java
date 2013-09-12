package com.toggle.v2;

import com.toggle.ProductionFeature;
import com.toggle.parser.StaffFeatureParser;
import com.toggle.parser.StandardFeatureParser;

import java.util.Map;

public abstract class Feature {
    private ToggleType toggleType;

    public Feature(ToggleType toggleType) {
        this.toggleType = toggleType;
    }

    private boolean isOn(ProductionFeature productionFeature) {
        try {
            Map features = null;
            switch (toggleType) {
                case STAFF_TOGGLE:
                    features = StaffFeatureParser.getInstance().parse();
                    break;
                case STANDARD_TOGGLE:
                    features = StandardFeatureParser.getInstance().parse();
                    break;
            }


            return "on".equalsIgnoreCase(features.get(productionFeature.getFeatureDescription()).toString());
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean isActive(ProductionFeature productionFeature) {
        return isOn(productionFeature) && isValid();
    }

    public boolean isNotActive(ProductionFeature productionFeature) {
        return !isActive(productionFeature);
    }

    abstract boolean isValid();
}
