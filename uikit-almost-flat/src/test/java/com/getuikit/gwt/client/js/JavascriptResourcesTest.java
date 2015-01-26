package com.getuikit.gwt.client.js;

import com.getuikit.gwt.client.UIKit;
import com.google.gwt.core.client.Callback;
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
        ScriptInjector.fromUrl("js/jquery-2.1.3.min.js").setCallback(new Callback<Void, Exception>() {
            @Override
            public void onFailure(Exception e) {
                fail();
            }
            @Override
            public void onSuccess(Void aVoid) {
                ScriptInjector.fromUrl("js/uikit.js").setCallback(new Callback<Void, Exception>() {
                    @Override
                    public void onFailure(Exception e) {
                        fail();
                    }
                    @Override
                    public void onSuccess(Void aVoid) {

                    }
                }).inject();
            }
        }).inject();
    }

}
