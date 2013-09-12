package com.toggle.v2;

import com.domain.Client;

public class StaffOnlyFeature extends Feature{

    public StaffOnlyFeature() {
        super(ToggleType.STAFF_TOGGLE);
    }

    @Override
    boolean isValid() {
        return new Client().isStaff();
    }
}
