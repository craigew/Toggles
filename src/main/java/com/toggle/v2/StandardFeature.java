package com.toggle.v2;

public class StandardFeature extends Feature {
    public StandardFeature() {
        super(ToggleType.STANDARD_TOGGLE);
    }

    @Override
    boolean isValid() {
        return true;
    }
}
