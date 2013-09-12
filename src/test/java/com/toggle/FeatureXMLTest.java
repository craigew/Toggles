package com.toggle;


import com.toggle.parser.StandardFeatureParser;
import com.toggle.v2.ToggleType;
import junit.framework.Assert;
import org.junit.Test;

public class FeatureXMLTest {

    @Test
    public void feature_xml_is_parsed_correctly() {
        Assert.assertTrue(StandardFeatureParser.getInstance().parse().size() > 0);
    }
}
