package com.toggle.parser;

import com.toggle.v2.ToggleType;

import java.util.Map;

public class StandardFeatureParser extends FeatureParser {
    private static StandardFeatureParser parser;
    private static Map features;

    private StandardFeatureParser() {
        features = xmlToMap(ToggleType.STANDARD_TOGGLE);
    }

    public static StandardFeatureParser getInstance() {
        if (parser == null) {
            parser = new StandardFeatureParser();
        }
        return parser;
    }

    public static Map parse() {
        return features;
    }
}
