package com.toggle;


import com.toggle.parser.xmlParser;
import junit.framework.Assert;
import org.junit.Test;

public class FeatureXMLTest {

    @Test
    public void feature_xml_is_parsed_correctly() {
        Assert.assertTrue( xmlParser.getInstance().parse().size() > 0);
    }
}
