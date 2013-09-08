package com.toggle;


import org.junit.Assert;
import org.junit.Test;

public class ToggleTest {

    @Test
    public void test_toggle_is_on(){
       Assert.assertTrue(Toggle.isOn(ProductionFeature.TOGGLE_ON));
    }

    @Test
    public void test_toggle_is_off(){
        Assert.assertFalse(Toggle.isOn(ProductionFeature.TOGGLE_OFF));
    }

    @Test
    public void test_toggle_is_off_when_not_in_configuration_file(){
        Assert.assertFalse(Toggle.isOn(ProductionFeature.NOT_IN_CONFIG_FILE));
    }
}
