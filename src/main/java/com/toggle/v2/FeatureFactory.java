package com.toggle.v2;

public class FeatureFactory{

    public static Feature Build(ToggleType toggleType) {
        Feature feature = null;

        switch (toggleType) {
            case STANDARD_TOGGLE:
                feature = new StandardFeature();
                break;
            case STAFF_TOGGLE:
                feature = new StaffOnlyFeature();
                break;
        }

        return feature;

    }


}
