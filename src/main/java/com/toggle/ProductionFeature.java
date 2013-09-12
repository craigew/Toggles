package com.toggle;


public enum ProductionFeature {
    TOGGLE_ON("Toggle On"),
    TOGGLE_OFF("Toggle Off"),
    TOGGLE_ON_FOR_STAFF("Toggle On for staff"),
    TOGGLE_OFF_FOR_STAFF("Toggle Off for staff"),
    NOT_IN_CONFIG_FILE("Not in config file");

    private String featureDescription;

    ProductionFeature(String featureDescription){
        this.featureDescription=featureDescription;
    }

    public String getFeatureDescription() {
        return featureDescription;
    }
}
