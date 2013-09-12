package com.toggle.v2;

public enum ToggleType {
    STANDARD_TOGGLE("standard_toggle"),
    STAFF_TOGGLE("staff_toggle");

    private String toggleType;

    ToggleType(String toggleType) {
        this.toggleType=toggleType;
    }

    public String getToggleType() {
        return toggleType;
    }
}
