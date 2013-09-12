package com.toggle.v2;

import com.toggle.ProductionFeature;

public class FeatureFactory {

    public static Feature Build(ToggleType toggleType) {
        Feature feature = null;

        switch (toggleType) {
            case STANDARD_TOGGLE:
                feature = new StandardFeature();
        }

        return feature;

    }


}
