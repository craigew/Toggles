package com.toggle.v2;

import com.toggle.ProductionFeature;
import com.toggle.parser.xmlParser;

import java.util.Map;

public abstract class Feature<T> {

    public Feature() {

    }

    private boolean isOn(ProductionFeature productionFeature) {
        try {
            Map features =  xmlParser.getInstance().parse();
            return "on".equalsIgnoreCase(features.get(productionFeature.getFeatureDescription()).toString());
        } catch (Exception ex) {
            return false;
        }
    }

    public boolean isActive(ProductionFeature productionFeature) {
        return isOn(productionFeature) && isValid(null);
    }

    public boolean isNotActive(ProductionFeature productionFeature) {
        return !isActive(productionFeature);
    }

    abstract boolean isValid(T object);
}
