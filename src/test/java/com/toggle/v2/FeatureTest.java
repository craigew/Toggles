package com.toggle.v2;

import com.toggle.ProductionFeature;
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
}
