package com.toggle.v2;

public enum ToggleType {
    STANDARD_TOGGLE("standard_toggle","StandardFeature.xml"),
    STAFF_TOGGLE("staff_toggle","StaffFeature.xml");

    private String toggleType;
    private String toggleXml;

    ToggleType(String toggleType,String toggleXml) {
        this.toggleType=toggleType;
        this.toggleXml=toggleXml;
    }

    public String getToggleType() {
        return toggleType;
    }

    public String getToggleXml() {
        return toggleXml;
    }
}
