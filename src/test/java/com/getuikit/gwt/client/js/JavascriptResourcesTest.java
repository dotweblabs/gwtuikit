package com.getuikit.gwt.client.js;

import com.getuikit.gwt.client.JQuery;
import com.getuikit.gwt.client.UIKit;
import com.getuikit.gwt.client.resources.js.JavascriptResources;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.junit.client.GWTTestCase;
import static com.google.gwt.core.client.ScriptInjector.FromString;


public class JavascriptResourcesTest extends GWTTestCase {

    @Override
    public String getModuleName() {
        return "com.getuikit.gwt.UIKit";
    }

    @Override
    protected void gwtSetUp() throws Exception {
    }

    public void testScriptInjectJQuery(){
        new FromString(JavascriptResources.INSTANCE.jqueryJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW)
                .inject();
    }

    public void testScriptInjectUIKit(){
//        new FromString(JavascriptResources.INSTANCE.jqueryJS().getText())
//                .setWindow(ScriptInjector.TOP_WINDOW)
//                .inject();
        JQuery jquery = GWT.create(JQuery.class);
        jquery.load();
        new FromString(JavascriptResources.INSTANCE.uikitJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW)
                .inject();
    }


}
