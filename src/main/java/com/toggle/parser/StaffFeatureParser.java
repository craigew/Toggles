package com.toggle.parser;

import com.toggle.v2.ToggleType;

import java.util.Map;

public class StaffFeatureParser extends FeatureParser {
    private static StaffFeatureParser parser;
    private static Map features;

    private StaffFeatureParser() {
        features = xmlToMap(ToggleType.STAFF_TOGGLE);
    }

    public static StaffFeatureParser getInstance() {
        if (parser == null) {
            parser = new StaffFeatureParser();
        }
        return parser;
    }

    public static Map parse() {
        return features;
    }
}
