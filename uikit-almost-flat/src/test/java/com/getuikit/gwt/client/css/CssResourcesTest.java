package com.getuikit.gwt.client.css;

import com.getuikit.gwt.client.util.CssHelper;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.StyleInjector;
import com.google.gwt.junit.client.GWTTestCase;

import static com.google.gwt.core.client.ScriptInjector.FromString;


public class CssResourcesTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.getuikit.gwt.UIKit";
    }

    @Override
    protected void gwtSetUp() throws Exception {
    }

    public void testInjectUIKitCSS(){
        CssHelper.loadCss("css/uikit.css");
    }

}
