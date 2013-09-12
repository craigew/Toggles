package com.toggle.v2;

import com.domain.Client;
import com.toggle.ProductionFeature;
import mockit.Mock;
import mockit.MockUp;
import org.junit.Assert;
import org.junit.Test;

public class FeatureTest {
    @Test
    public void test_toggle_is_on() {
        Assert.assertTrue(FeatureFactory.Build(ToggleType.STANDARD_TOGGLE).isActive(ProductionFeature.TOGGLE_ON));
    }

    @Test
    public void test_toggle_is_off() {
        Assert.assertFalse(FeatureFactory.Build(ToggleType.STANDARD_TOGGLE).isActive(ProductionFeature.TOGGLE_OFF));
    }

    @Test
    public void test_toggle_is_on_inverse() {
        Assert.assertFalse(FeatureFactory.Build(ToggleType.STANDARD_TOGGLE).isNotActive(ProductionFeature.TOGGLE_ON));
    }

    @Test
    public void test_toggle_is_off_inverse() {
        Assert.assertTrue(FeatureFactory.Build(ToggleType.STANDARD_TOGGLE).isNotActive(ProductionFeature.TOGGLE_OFF));
    }

    @Test
    public void toggle_should_be_on_for_staff() {
        new MockUp<Client>() {
            @Mock
            public boolean isStaff() {
                return true;
            }
        };
        Assert.assertTrue(FeatureFactory.Build(ToggleType.STAFF_TOGGLE).isActive(ProductionFeature.TOGGLE_ON_FOR_STAFF));
    }

    @Test
    public void toggle_should_be_off_for_staff() {
        new MockUp<Client>() {
            @Mock
            public boolean isStaff() {
                return false;
            }
        };
        Assert.assertFalse(FeatureFactory.Build(ToggleType.STAFF_TOGGLE).isActive(ProductionFeature.TOGGLE_OFF_FOR_STAFF));
    }

//    @Test
//    public void test_toggle_is_on_inverse() {
//        Assert.assertFalse(FeatureFactory.Build(ToggleType.STANDARD_TOGGLE).isNotActive(ProductionFeature.TOGGLE_ON));
//    }
//
//    @Test
//    public void test_toggle_is_off_inverse() {
//        Assert.assertTrue(FeatureFactory.Build(ToggleType.STANDARD_TOGGLE).isNotActive(ProductionFeature.TOGGLE_OFF));
//    }
}
